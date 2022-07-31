package dev.drawethree.ultrabombs.api;

import dev.drawethree.ultrabombs.api.handler.BlockHandler;
import dev.drawethree.ultrabombs.api.handler.SellHandler;
import dev.drawethree.ultrabombs.api.model.Bomb;
import dev.drawethree.ultrabombs.api.service.BackendAPI;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Optional;

public final class UltraBombsAPI extends JavaPlugin {


	private UltraBombsAPI() {
		throw new UnsupportedOperationException("Cannot instantiate UltraBombsAPI!");
	}

	/**
	 * Gives a player specific bomb
	 *
	 * @param bomb   {@link Bomb}
	 * @param amount amount
	 * @param player Player
	 */
	public static void giveBomb(Bomb bomb, int amount, Player player) {
		BackendAPI.getImplementation().giveBomb(bomb, amount, player);
	}

	/**
	 * Returns optional of Bomb based on given name
	 *
	 * @param name name
	 * @return Optional of Bomb
	 */
	public static Optional<Bomb> getBombByName(String name) {
		return BackendAPI.getImplementation().getBombByName(name);
	}

	/**
	 * Set the BlockHandler implementation
	 *
	 * @param handler Implementation of {@link BlockHandler}
	 */
	public static void setBlockHandler(BlockHandler handler) {
		BackendAPI.getImplementation().setBlockHandler(handler);

	}

	/**
	 * Set the SellHandler implementation
	 *
	 * @param handler Implementation of {@link SellHandler}
	 */
	public static void setSellHandler(SellHandler handler) {
		BackendAPI.getImplementation().setSellHandler(handler);
	}

	/**
	 * Gets the current BlockHandler implementation
	 *
	 * @return {@link BlockHandler}
	 */
	public static BlockHandler getBlockHandler() {
		return BackendAPI.getImplementation().getBlockHandler();

	}

	/**
	 * Gets the current SellHandler implementation
	 *
	 * @return {@link BlockHandler}
	 */
	public static SellHandler getSellHandler() {
		return BackendAPI.getImplementation().getSellHandler();
	}

}
