package net.winter.testingmod.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TESTING_TAB = new CreativeModeTab("testingtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.IOLITE.get());
        }
    };
}
