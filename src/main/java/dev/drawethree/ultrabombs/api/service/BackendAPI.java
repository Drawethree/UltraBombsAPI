package dev.drawethree.ultrabombs.api.service;

import dev.drawethree.ultrabombs.api.handler.BlockHandler;
import dev.drawethree.ultrabombs.api.handler.SellHandler;
import dev.drawethree.ultrabombs.api.model.Bomb;
import org.bukkit.entity.Player;

import java.util.Optional;

public abstract class BackendAPI {

	private static BackendAPI implementation;

	public static void setImplementation(BackendAPI implementation) {
		BackendAPI.implementation = implementation;
	}

	public static BackendAPI getImplementation() {
		if (implementation == null) {
			throw new IllegalStateException("No API implementation set. Is UltraBackpacks enabled?");
		}

		return implementation;
	}

	public abstract void giveBomb(Bomb bomb, int amount, Player player);

	public abstract Optional<Bomb> getBombByName(String name);

	public abstract void setBlockHandler(BlockHandler handler);

	public abstract void setSellHandler(SellHandler handler);

	public abstract BlockHandler getBlockHandler();

	public abstract SellHandler getSellHandler();

}
