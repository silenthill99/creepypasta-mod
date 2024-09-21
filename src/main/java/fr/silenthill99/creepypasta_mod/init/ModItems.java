package fr.silenthill99.creepypasta_mod.init;

import fr.silenthill99.creepypasta_mod.Main;
import fr.silenthill99.creepypasta_mod.ModEntityTypes;
import fr.silenthill99.creepypasta_mod.utils.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> LAVENDER = ITEMS.register("lavender_town", () -> new MusicDiscItem(1, ModSoundEvents.LAVENDER, new Item.Properties().stacksTo(1).tab(ModItemGroups.Creepypastas)));
    public static final RegistryObject<Item> SMILE_DOG = ITEMS.register("smile_dog", () -> new Item(new Item.Properties().tab(ModItemGroups.Creepypastas).stacksTo(1)));
    public static final RegistryObject<ForgeSpawnEggItem> JEFF_THE_KILLER_SPAWN_EGG = ITEMS.register("jeff_the_killer_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.JEFF_THE_KILLER, 0xffffff, 0xff0000, new Item.Properties().tab(ModItemGroups.Creepypastas)));

}
