package mrhazmat.firelance.init;

import mrhazmat.firelance.FireLance;
import mrhazmat.firelance.item.FireLanceItem;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class FireLanceRegisters {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FireLance.MODID);
	public static final RegistryObject<Item> FIRE_LANCE = REGISTRY.register("fire_lance", () -> new FireLanceItem());
}
