package io.github.jhutch1979.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab( "tutorialtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_ZIRCON.get());
        }
    };
}
