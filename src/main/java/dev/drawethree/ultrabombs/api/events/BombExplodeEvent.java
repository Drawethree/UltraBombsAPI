package dev.drawethree.ultrabombs.api.events;

import dev.drawethree.ultrabombs.api.model.Bomb;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

public final class BombExplodeEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();

	private final Bomb bomb;
	private final Player player;
	private final Location location;
	private List<Block> affectedBlocks;
	private boolean cancelled;

	public BombExplodeEvent(Bomb bomb, Player player, Location location, List<Block> affectedBlocks) {
		this.bomb = bomb;
		this.player = player;
		this.location = location;
		this.affectedBlocks = affectedBlocks;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public Bomb getBomb() {
		return bomb;
	}

	public Player getPlayer() {
		return player;
	}

	public Location getLocation() {
		return location;
	}

	public List<Block> getAffectedBlocks() {
		return affectedBlocks;
	}

	public void setAffectedBlocks(List<Block> affectedBlocks) {
		this.affectedBlocks = affectedBlocks;
	}

	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
}
