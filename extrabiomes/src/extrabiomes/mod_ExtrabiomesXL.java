/**
 * Copyright (c) Scott Killen and MisterFiber, 2012
 * 
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license
 * located in /MMPL-1.0.txt
 */

package extrabiomes;

import java.util.Map;
import java.util.Random;

import scottkillen.mods.extrabiomes.Extrabiomes;

import net.minecraft.src.BaseMod;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import cpw.mods.fml.common.network.NetworkMod;

@NetworkMod
public class mod_ExtrabiomesXL extends BaseMod {

	@Override
	public int addFuel(int id, int damage) {
		return Extrabiomes.addFuel(id, damage);
	}

	@Override
	public void addRenderer(Map map) {
		Extrabiomes.addRenderer(map);
	}

	public boolean clientSideRequired() {
		return true;
	}

	@Override
	public void generateSurface(World world, Random random, int chunkX,
			int chunkZ)
	{
		Extrabiomes.generateSurface(world, random, chunkX, chunkZ);
	}

	@Override
	public String getPriorities() {
		return Extrabiomes.getPriorities();
	}

	@Override
	public String getVersion() {
		return Extrabiomes.getVersion();
	}

	@Override
	public void load() {
		Extrabiomes.onLoad(this);
	}

	@Override
	public void modsLoaded() {
		Extrabiomes.onModsLoaded(this);
	}

	public boolean serverSideRequired() {
		return true;
	}

	@Override
	public void takenFromCrafting(EntityPlayer player,
			ItemStack itemstack, IInventory var3)
	{
		Extrabiomes.takenFromCrafting(player, itemstack, var3);
	}
}