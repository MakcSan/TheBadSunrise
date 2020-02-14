package net.mcreator.badsunrise;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

@Elementsbadsunrise.ModElement.Tag
public class MCreatorGrasstoDirtBlockDestroyedByPlayer extends Elementsbadsunrise.ModElement {
	public MCreatorGrasstoDirtBlockDestroyedByPlayer(Elementsbadsunrise instance) {
		super(instance, 5);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorGrasstoDirtBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorGrasstoDirtBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if ((!(((entity.getDisplayName().getFormattedText())).equals("Dev")))) {
			if (entity instanceof PlayerEntity && !world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
						"An Error has occured! this block is not supporsed pick up! contact to Makcsan the mod owner!"), (false));
			}
		}
	}
}
