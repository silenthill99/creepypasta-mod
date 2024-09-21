package fr.silenthill99.creepypasta_mod.data.models;

import fr.silenthill99.creepypasta_mod.Main;
import fr.silenthill99.creepypasta_mod.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

public class ItemModelGenerator extends ItemModelProvider {
    public ItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Main.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ModItems.JEFF_THE_KILLER_SPAWN_EGG.getId().getPath(), new ResourceLocation(
                "item/template_spawn_egg"));
        simpleItem(ModItems.SMILE_DOG);
        simpleItem(ModItems.LAVENDER);
    }

    private void simpleItem(RegistryObject<Item> item) {
        withExistingParent(item.getId().getPath(), mcLoc("item/generated"))
                .texture("layer0", "item/" + item.getId().getPath());
    }
}
