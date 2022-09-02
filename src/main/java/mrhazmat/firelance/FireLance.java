package mrhazmat.firelance;

import mrhazmat.firelance.init.FireLanceEntities;
import mrhazmat.firelance.init.FireLanceRegisters;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

@Mod("firelance")
public class FireLance {
	public static final String MODID = "firelance";

	public FireLance() {

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		FireLanceRegisters.REGISTRY.register(bus);
		FireLanceEntities.REGISTRY.register(bus);
	}
}