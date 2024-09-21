package fr.silenthill99.creepypasta_mod;

import fr.silenthill99.creepypasta_mod.init.entities.jeffthekiller.JeffTheKiller;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes
{

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.ENTITIES, Main.MODID);

    public static final RegistryObject<EntityType<JeffTheKiller>> JEFF_THE_KILLER = ENTITY_TYPE.register("jeff_the_killer", () -> EntityType.Builder.of(JeffTheKiller::new, EntityClassification.MONSTER).sized(1.0f, 2.0f).build(new ResourceLocation(Main.MODID, "jeff_the_killer").toString()));

}
