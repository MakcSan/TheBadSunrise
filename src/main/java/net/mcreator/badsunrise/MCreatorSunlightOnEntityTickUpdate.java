package net.mcreator.badsunrise;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

@Elementsbadsunrise.ModElement.Tag
public class MCreatorSunlightOnEntityTickUpdate extends Elementsbadsunrise.ModElement {
	public MCreatorSunlightOnEntityTickUpdate(Elementsbadsunrise instance) {
		super(instance, 6);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorSunlightOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorSunlightOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorSunlightOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorSunlightOnEntityTickUpdate!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.canBlockSeeSky(new BlockPos((int) x, (int) (y - 1), (int) z))) && (((world.getBlockState(new BlockPos((int) x, (int) (y - 1),
				(int) z))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock()) || (((world.getBlockState(new BlockPos((int) x,
				(int) (y - 1), (int) z))).getBlock() == Blocks.GRASS_PATH.getDefaultState().getBlock()) || ((world.getBlockState(new BlockPos(
				(int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.MYCELIUM.getDefaultState().getBlock()))))) {
			if ((badsunriseVariables.WorldVariables.get(world).OnFire)) {
				world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), MCreatorGrasstoDirt.block.getDefaultState(), 3);
				world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y - 1), (int) z),
						world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock());
			}
		}
	}
}
