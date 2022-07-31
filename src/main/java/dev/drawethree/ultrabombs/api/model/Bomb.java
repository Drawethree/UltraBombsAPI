package dev.drawethree.ultrabombs.api.model;

import org.bukkit.Sound;
import org.bukkit.inventory.ItemStack;

public interface Bomb {

	String getName();

	int getRadius();

	ItemStack getItem();

	Sound getDropSound();

	Sound getExplodeSound();

	int getExplosionDelay();
}
