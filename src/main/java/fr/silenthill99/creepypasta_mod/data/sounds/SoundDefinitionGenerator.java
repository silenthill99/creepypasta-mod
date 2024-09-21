package fr.silenthill99.creepypasta_mod.data.sounds;

import fr.silenthill99.creepypasta_mod.Main;
import fr.silenthill99.creepypasta_mod.init.ModSoundEvents;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.common.data.SoundDefinitionsProvider;

public class SoundDefinitionGenerator extends SoundDefinitionsProvider {

    public SoundDefinitionGenerator(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Main.MODID, helper);
    }

    @Override
    public void registerSounds() {
        add(ModSoundEvents.LAVENDER, SoundDefinition.definition().with(
                sound(new ResourceLocation(Main.MODID, "lavender")).stream()));
    }
}
