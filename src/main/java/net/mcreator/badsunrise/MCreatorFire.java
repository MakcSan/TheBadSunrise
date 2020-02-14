package net.mcreator.badsunrise;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;

@Elementsbadsunrise.ModElement.Tag
public class MCreatorFire extends Elementsbadsunrise.ModElement {
	public MCreatorFire(Elementsbadsunrise instance) {
		super(instance, 1);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorFire!");
			return;
		}
		World world = (World) dependencies.get("world");
		if (((world.getDayTime()) > 72000)) {
			badsunriseVariables.WorldVariables.get(world).OnFire = (boolean) (true);
			badsunriseVariables.WorldVariables.get(world).syncData(world);
		}
	}

	@SubscribeEvent
	public void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			World world = event.world;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("world", world);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
