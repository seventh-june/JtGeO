package net.junedev.junetech_geo.mixin.client;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.junedev.junetech_geo.worldgen.chunk.JtGeOChunkStatus;
import net.minecraft.client.gui.screens.LevelLoadingScreen;
import net.minecraft.world.level.chunk.ChunkStatus;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * add {@link JtGeOChunkStatus#STONE_REPLACER} to the level loading screen after {@link ChunkStatus#NOISE} with color {@code #127b81}
 *
*/
@Mixin(LevelLoadingScreen.class)
public class LevelLoadingScreenMixin {

    /*
     * disabled
    @Inject(method = "lambda$static$0", at = @At(value = "HEAD"))
    private static void addStoneReplacer(Object2IntOpenHashMap<ChunkStatus> chunkStatus, CallbackInfo ci) {
        LogUtils.getLogger().info("Hello from the Mixin!"); // remove this at some point, here for debug purposes
        //chunkStatus.put(JtGeOChunkStatus.STONE_REPLACER, 0x127b81);
    }
    */

}
