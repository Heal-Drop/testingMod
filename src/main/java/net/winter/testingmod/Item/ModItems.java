package net.winter.testingmod.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.winter.testingmod.TestingMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestingMod.MOD_ID);

    //Zircon registry
    public static final RegistryObject <Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TESTING_TAB)));
    public static final RegistryObject <Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TESTING_TAB)));

    //Iolite registry
    public static final RegistryObject <Item> IOLITE = ITEMS.register("iolite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TESTING_TAB)));
    public static final RegistryObject <Item> RAW_IOLITE = ITEMS.register("raw_iolite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TESTING_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
