package owo.cursed.gdwm.registries;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import owo.cursed.gdwm.GastersDarkWorldMachine;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GastersDarkWorldMachine.MODID);




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
