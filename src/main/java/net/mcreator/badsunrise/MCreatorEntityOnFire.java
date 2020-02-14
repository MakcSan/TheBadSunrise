package net.mcreator.badsunrise;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;

@Elementsbadsunrise.ModElement.Tag
public class MCreatorEntityOnFire extends Elementsbadsunrise.ModElement {
	public MCreatorEntityOnFire(Elementsbadsunrise instance) {
		super(instance, 2);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorEntityOnFire!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorEntityOnFire!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorEntityOnFire!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorEntityOnFire!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorEntityOnFire!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((badsunriseVariables.WorldVariables.get(world).OnFire) && (world.canBlockSeeSky(new BlockPos((int) x, (int) y, (int) z))))) {
			if ((!(((!(world.isDaytime())) || (world.isRaining())) || (world.isThundering())))) {
				entity.setFire((int) 5);
			}
		}
	}
}
