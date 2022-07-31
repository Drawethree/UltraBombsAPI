package dev.drawethree.ultrabombs.api.handler;

import org.bukkit.block.Block;

import java.util.List;

public interface BlockHandler {

	List<Block> handle(List<Block> originalBlocks);

	String getRequiredPlugin();
}
