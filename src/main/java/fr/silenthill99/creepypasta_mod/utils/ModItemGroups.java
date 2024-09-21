package fr.silenthill99.creepypasta_mod.utils;

import fr.silenthill99.creepypasta_mod.init.ModBlocks;
import fr.silenthill99.creepypasta_mod.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {
    public static final ItemGroup Creepypastas = new ItemGroup("creepypastas") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SMILE_DOG.get());
        }
    };
}
