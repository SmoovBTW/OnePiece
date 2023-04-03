package net.smoov.onepiece.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup
{
    public static final ItemGroup ONE_PIECE_GROUP = new ItemGroup("onepieceModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.SEA_PRISM_STONE.get());
        }
    };

}
