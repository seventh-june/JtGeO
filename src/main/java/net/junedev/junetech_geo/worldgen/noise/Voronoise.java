package net.junedev.junetech_geo.worldgen.noise;

import io.github.jdiemke.triangulation.DelaunayTriangulator;
import io.github.jdiemke.triangulation.NotEnoughPointsException;
import io.github.jdiemke.triangulation.Vector2D;
import net.minecraft.core.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.phys.Vec2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// TODO - finish this up. maybe gut FastNoiseLite and transfer its copyright notice here
/**
 * Instances represents Worley noise constructed from a set of 2D vectors representing seeds. This is accomplished
 * using a Delaunay triangulation, as the former is the dual graph of the underlying Voronoi diagram & vice versa.
 * @author kawaiicakes
 */
public class Voronoise {
    protected final DelaunayTriangulator delaunay;

    // TODO - this needs a rework for better distribution
    public static Vec2 applyJitter(MinecraftServer server, BlockPos pos) {
        final RandomSource random = new WorldgenRandom(RandomSource.create(
                server.getWorldData().worldGenOptions().seed() + BlockPos.asLong(pos.getX(), 0, pos.getZ())
        ));

        return new Vec2(
                random.nextIntBetweenInclusive(0, 15) + pos.getX(),
                random.nextIntBetweenInclusive(0, 15) + pos.getZ()
        );
    }

    // TODO - enhanced Perlin will use a Voronoi graph to determine tectonic plate boundaries

    // TODO - figure out whether to enforce a passing order in the constructor or leave it to the caller
    //  Double-check that the order even matters...

    // meat of things in NoiseBasedChunkGenerator#doFill
    /**
     * Deterministically constructs a new Voronoi diagram from the passed {@code seeds}.
     * @param seeds the {@link Vec2}s representing the seeds. You must pass at least 3 and not include duplicates.
     *              The order they are passed matters.
     * @throws IllegalArgumentException if a passed arg is identical to a previous one.
     * @throws NotEnoughPointsException if less than 3 points are passed.
     */
    public Voronoise(Vec2... seeds) throws IllegalArgumentException, NotEnoughPointsException {
        if (seeds.length < 3) throw new NotEnoughPointsException();

        List<Vector2D> orderedSeeds = new ArrayList<>();
        Set<Vec2> existing = new HashSet<>();
        for (Vec2 seed : seeds) {
            if (!existing.add(seed)) throw new IllegalArgumentException("Duplicate point passed to Voronoi constructor");
            orderedSeeds.add(new Vector2D(seed.x, seed.y));
        }

        this.delaunay = new DelaunayTriangulator(orderedSeeds);
        this.delaunay.triangulate();
    }

    /*
    Since we’re doing Voronoi graphing, we need a set of seeding points to generate it. This is not a problem to do in a small arbitrarily-sized space (e.g. a grid of 5x5 chunks), but when considering tiling beyond what is already generated, the problem of extending the graph while maintaining consistency arises. This is because any ungenerated chunk can be queued for generation at any time independently of others. This is the problem with infinite scaling using this generation technique.

What this effectively means is that, for a given world seed, the seeding points must always have the same coordinates for a Voronoi diagram of arbitrary size in order for worldgen to be consistent. This also implies that each chunk that is being generated would have to know what the Voronoi polygon(s) inside of it look like.

The smallest meaningful unit we are working with in the game is the BlockPos, but we can work with any size of grid that is subdivided by a multiple of a single BlockPos. Let’s call this grid the container grid, and it is said to be of size k.  Each coordinate on the container grid therefore corresponds to a unique set containing a number of BlockPos equal to k^2.

Point jittering works off the premise of deviating a nominally integer-valued coordinate, but within constraints. Every coordinate on the container grid may be mapped to a single BlockPos contained within, and if this process is taken to be consistent (i.e., is always mapped to the BlockPos within it closest to negative infinity), jittering may then be described as deviating from this mapped value. We may do this by discretizing decimal jittering to the nearest BlockPos within.

With all of this in mind, a container grid’s coordinates can also be mapped, in a deterministic fashion, to a jittered BlockPos within it. This cheaply solves the issue of consistent seeding point selection regardless of what, when and where chunks are generated.

Conveniently, and to take advantage of well-optimized bitshift operations, we can use either regions or chunks as our container grids. Both regions and chunks are discretized into their own coordinates; RegionPos [verify name] and ChunkPos, respectively. Each position contains a unique set of BlockPos.

As an example, let’s say that each ChunkPos, by default, corresponds to the smallest BlockPos within it, that is to say, the BlockPos whose X and Z coordinates are closest to negative infinity. We can then jitter from the default point by adding, deterministically, two values to both the X and Z coordinates, where both values must be greater or equal to 0 but less than 16. To do this, an RNG seed could be generated from the ChunkPos (as a long), fed into a RandomSource, which is then queried for two integers between 0-15 inclusive.

We can now deterministically retrieve a seeding point for every point on the container grid. Rather than evaluating each neighbour for every chunk being loaded, chunks being loaded together could instead form a “group” which is calculated in one burst…
     */
}
