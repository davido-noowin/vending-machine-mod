package com.davido.vendingmachinemod;

import com.davido.vendingmachinemod.block.ModBlocks;
import com.davido.vendingmachinemod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DavidosVendingMachineMod.MODID);

    public static final Supplier<CreativeModeTab> DAVIDOS_VENDING_MACHINE_MOD_TAB = CREATIVE_MODE_TAB.register("davidos_vending_machine_mod_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.CANNED_DRINK.get()))
                    .title(Component.translatable("creativetab.davidosvendingmachinemod.vending_machine_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CANNED_DRINK);
                        output.accept(ModItems.SENZEE);
                        output.accept(ModBlocks.VENDING_MACHINE_CASING);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
