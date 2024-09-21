package fr.silenthill99.creepypasta_mod.init;

import fr.silenthill99.creepypasta_mod.Main;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENT = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Main.MODID);

    public static final RegistryObject<SoundEvent> LAVENDER = registerSoundEvent("lavender");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENT.register(name, () -> new SoundEvent(new ResourceLocation(Main.MODID, name)));
    }

}
