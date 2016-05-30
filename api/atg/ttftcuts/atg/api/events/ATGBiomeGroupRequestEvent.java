package ttftcuts.atg.api.events;

import java.util.List;

import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.world.biome.BiomeGenBase;

public class ATGBiomeGroupRequestEvent extends Event {

	public BiomeGenBase biome;
	public List<String> groups;
	
	public ATGBiomeGroupRequestEvent(BiomeGenBase biome) {
		this.biome = biome;
		this.groups = null;
	}
}
