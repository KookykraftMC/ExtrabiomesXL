package extrabiomes.utility;

import extrabiomes.api.Stuff;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs
{
    public CreativeTab(String par2Str)
    {
        super(par2Str);
    }

	@Override
	public Item getTabIconItem() {
		if(Stuff.scarecrow.isPresent()) return Stuff.scarecrow.get();
		else return null;
	}
    
}
