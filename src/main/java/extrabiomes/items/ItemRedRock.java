package extrabiomes.items;

import extrabiomes.utility.MultiItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ItemRedRock extends MultiItemBlock
{
    
    public ItemRedRock(Block block)
    {
        super(block);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        int metadata = itemstack.getItemDamage();
        if (metadata > 2)
            metadata = 2;
        itemstack = itemstack.copy();
        itemstack.setItemDamage(metadata);
        return super.getUnlocalizedName(itemstack);
    }
    
}
