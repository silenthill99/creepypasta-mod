package fr.silenthill99.creepypasta_mod.data;

import fr.silenthill99.creepypasta_mod.Main;

import fr.silenthill99.creepypasta_mod.data.loot_tables.LootTableGenerator;
import fr.silenthill99.creepypasta_mod.data.models.BlockStateGenerator;
import fr.silenthill99.creepypasta_mod.data.models.ItemModelGenerator;
import fr.silenthill99.creepypasta_mod.data.sounds.SoundDefinitionGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        if (event.includeClient()) {
            generator.addProvider(new ItemModelGenerator(generator, existingFileHelper));
            generator.addProvider(new SoundDefinitionGenerator(generator, existingFileHelper));
            generator.addProvider(new BlockStateGenerator(generator, existingFileHelper));
        }

        if (event.includeServer()) {
            generator.addProvider(new LootTableGenerator(generator));
        }
    }
}
