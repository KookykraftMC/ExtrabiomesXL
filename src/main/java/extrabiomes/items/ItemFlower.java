package extrabiomes.items;

import java.util.List;

import extrabiomes.blocks.BlockCustomFlower;
import extrabiomes.utility.MultiItemBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemFlower extends MultiItemBlock
{
	public final int	group;
	public final int	max_meta;
	private final BlockCustomFlower block;
	
    public ItemFlower(Block block)
    {
        super(block);
		this.block = (BlockCustomFlower)block;

		this.group = this.block.group;

		//LogHelper.finer("ItemFlower - " + id + ", " + ( b != null ? b : "null" ) + ", group = " + group);
		
		max_meta = this.block.getGroupTypes().size();
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
    	return block.getUnlocalizedName(itemstack.getItemDamage());
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void addInformation(ItemStack itemForTooltip, EntityPlayer playerViewingToolTip, List listOfLines, boolean sneaking) {
    	block.addInformation(itemForTooltip.getItemDamage(), listOfLines);
    }
    
}
