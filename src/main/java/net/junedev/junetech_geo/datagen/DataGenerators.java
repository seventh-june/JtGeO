package net.junedev.junetech_geo.datagen;

import net.junedev.junetech_geo.JunetechGeo;
import net.junedev.junetech_geo.datagen.provider.ModBlockStateProvider;
import net.junedev.junetech_geo.datagen.provider.ModBlockTagGenerator;
import net.junedev.junetech_geo.datagen.provider.ModItemModelProvider;
//import net.junedev.junetech_geo.datagen.provider.ModLootTableProvider;
import net.junedev.junetech_geo.datagen.provider.WorldGenProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = JunetechGeo.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new WorldGenProvider(packOutput, lookupProvider));
    }

}