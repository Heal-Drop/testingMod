package net.winter.testingmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.winter.testingmod.Item.ModCreativeModeTab;
import net.winter.testingmod.Item.ModItems;
import net.winter.testingmod.TestingMod;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TestingMod.MOD_ID);


    public static final RegistryObject<Block> IOLITE_BLOCK = registerBlock("iolite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.TESTING_TAB);

    public static final RegistryObject<Block> IOLITE_ORE = registerBlock("iolite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 6)), ModCreativeModeTab.TESTING_TAB);
    public static final RegistryObject<Block> DEEPSLATE_IOLITE_ORE = registerBlock("deepslate_iolite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(4, 7)), ModCreativeModeTab.TESTING_TAB);
    public static final RegistryObject<Block> NETHERRACK_IOLITE_ORE = registerBlock("netherrack_iolite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops(),
                    UniformInt.of(5, 8)), ModCreativeModeTab.TESTING_TAB);
    public static final RegistryObject<Block> ENDSTONE_IOLITE_ORE = registerBlock("endstone_iolite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(7, 10)), ModCreativeModeTab.TESTING_TAB);

    private static <T extends Block> RegistryObject <T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);

        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register (IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
