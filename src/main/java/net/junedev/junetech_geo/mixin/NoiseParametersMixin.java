package net.junedev.junetech_geo.mixin;

import net.junedev.junetech_geo.util.ExpandedNoiseParameters;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

/**
 * I am REALLY not a fan of this since ordinarily a record would not allow you to add fields like this. Explore
 * alternate ways to do this
 * @author kawaiicakes
 */
@Mixin(NormalNoise.NoiseParameters.class)
public abstract class NoiseParametersMixin implements ExpandedNoiseParameters {
    // TODO - reimplement using new worldgen/noise_algorithm
    @Unique
    public boolean jtGeO$useEnhanced = true;

    @Override
    public boolean jtGeO$isEnhanced() {
        return this.jtGeO$useEnhanced;
    }

    @Override
    public void jtGeO$setEnhanced(boolean isEnhanced) {
        this.jtGeO$useEnhanced = isEnhanced;
    }
}
