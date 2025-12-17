package com.davido.vendingmachinemod.item;

import com.davido.vendingmachinemod.DavidosVendingMachineMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DavidosVendingMachineMod.MODID);

    public static final DeferredItem<Item> CANNED_DRINK = ITEMS.register("emptydrink",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SENZEE = ITEMS.register("senzee",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
