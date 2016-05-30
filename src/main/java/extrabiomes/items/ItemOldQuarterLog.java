package extrabiomes.items;

import java.util.List;

import extrabiomes.utility.MultiItemBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemOldQuarterLog extends MultiItemBlock
{
    
    public ItemOldQuarterLog(Block block)
    {
        super(block);
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void addInformation(ItemStack itemForTooltip, EntityPlayer playerViewingToolTip, List listOfLines, boolean sneaking) {
    	listOfLines.add("�o�lNo longer Used�r");
    	listOfLines.add("");
    	listOfLines.add("Place in crafting grid to");
    	listOfLines.add("convert to normal logs.");
    }
    
}
