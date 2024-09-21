package fr.silenthill99.creepypasta_mod.init.entities.jeffthekiller;

import fr.silenthill99.creepypasta_mod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class JeffTheKillerRenderer extends MobRenderer<JeffTheKiller, JeffTheKillerModel<JeffTheKiller>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entities/jeff_the_killer.png");

    public JeffTheKillerRenderer(EntityRendererManager manager) {
        super(manager, new JeffTheKillerModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(JeffTheKiller p_110775_1_) {
        return TEXTURE;
    }
}
