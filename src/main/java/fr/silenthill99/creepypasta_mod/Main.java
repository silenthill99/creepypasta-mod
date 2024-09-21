package fr.silenthill99.creepypasta_mod;

import fr.silenthill99.creepypasta_mod.init.ModBlocks;
import fr.silenthill99.creepypasta_mod.init.ModItems;
import fr.silenthill99.creepypasta_mod.init.ModSoundEvents;
import fr.silenthill99.creepypasta_mod.init.ModTileEntity;
import fr.silenthill99.creepypasta_mod.init.entities.jeffthekiller.JeffTheKiller;
import fr.silenthill99.creepypasta_mod.init.entities.jeffthekiller.JeffTheKillerRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "creepypasta_mod";

    public Main() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        bus.addListener(this::onEntityAttributeCreation);


        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModTileEntity.TILE_ENTITIES.register(bus);
        ModSoundEvents.SOUND_EVENT.register(bus);
        ModEntityTypes.ENTITY_TYPE.register(bus);
    }

    private void setup(FMLCommonSetupEvent event) {

    }

    private void clientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.JEFF_THE_KILLER.get(), JeffTheKillerRenderer::new);
    }

    private void onEntityAttributeCreation(EntityAttributeCreationEvent event)
    {
        event.put(ModEntityTypes.JEFF_THE_KILLER.get(), JeffTheKiller.createAttributes().build());
    }

}
