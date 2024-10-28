package com.finnnosam.finnnosamoverhaul.item;

import com.finnnosam.finnnosamoverhaul.fOverhaul;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, fOverhaul.MOD_ID);

public static final RegistryObject<Item> TESTERINGS = ITEMS.register("testerings",
        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
