package dev.drawethree.ultrabombs.api.handler;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.List;

public interface SellHandler  {

	void sell(Player player, List<Block> blocks);

	default double getPriceForBlocks(List<Block> blocks) {
		return blocks.stream().mapToDouble(this::getPriceForBlock).sum();
	}

	double getPriceForBlock(Block block);

	String getRequiredPlugin();

}
