package net.mcreator.badsunrise;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

@Elementsbadsunrise.ModElement.Tag
public class MCreatorGrasstoDirtUpdateTick extends Elementsbadsunrise.ModElement {
	public MCreatorGrasstoDirtUpdateTick(Elementsbadsunrise instance) {
		super(instance, 4);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorGrasstoDirtUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorGrasstoDirtUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorGrasstoDirtUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorGrasstoDirtUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((badsunriseVariables.WorldVariables.get(world).OnFire)) {
			if (((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock()) || ((world
					.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.GRASS_PATH.getDefaultState().getBlock())) || ((world
					.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.MYCELIUM.getDefaultState().getBlock()))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), MCreatorGrasstoDirt.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getDefaultState(), 3);
			}
			if (((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock()) || ((world
					.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.GRASS_PATH.getDefaultState().getBlock())) || ((world
					.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.MYCELIUM.getDefaultState().getBlock()))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), MCreatorGrasstoDirt.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getDefaultState(), 3);
			}
			if (((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock()) || ((world
					.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.GRASS_PATH.getDefaultState().getBlock())) || ((world
					.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.MYCELIUM.getDefaultState().getBlock()))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), MCreatorGrasstoDirt.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getDefaultState(), 3);
			}
			if (((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock()) || ((world
					.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.GRASS_PATH.getDefaultState().getBlock())) || ((world
					.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.MYCELIUM.getDefaultState().getBlock()))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), MCreatorGrasstoDirt.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getDefaultState(), 3);
			}
			if (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock()) || ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.GRASS_PATH
					.getDefaultState().getBlock())) || ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.MYCELIUM
					.getDefaultState().getBlock()))) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), MCreatorGrasstoDirt.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getDefaultState(), 3);
			}
			if (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock()) || ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.GRASS_PATH
					.getDefaultState().getBlock())) || ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.MYCELIUM
					.getDefaultState().getBlock()))) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), MCreatorGrasstoDirt.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getDefaultState(), 3);
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), MCreatorGrasstoDirt.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getDefaultState(), 3);
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK.getDefaultState()
					.getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), MCreatorGrasstoDirt.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getDefaultState(), 3);
			}
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getDefaultState(), 3);
		} else {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getDefaultState(), 3);
		}
	}
}
