package net.smoov.onepiece.item;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.smoov.onepiece.OnePiece;

import static net.minecraft.client.util.SearchTreeManager.ITEMS;


public class ModItems
{
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, OnePiece.MOD_ID);

    public static final RegistryObject<Item> SEA_PRISM_STONE = Items.register("sea_prism_stone",
            () -> new Item(new Item.Properties().group(ModItemGroup.ONE_PIECE_GROUP)));


    public static void register(IEventBus eventBus)
    {
        Items.register(eventBus);
    }
}
