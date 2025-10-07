package net.RogueKnightX2.expedition.item;

import net.RogueKnightX2.expedition.Expedition;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Expedition.MODID);

    public static final DeferredItem<Item> ESSENCESTONE = ITEMS.register("essence_stone",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
