package extrabiomes.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extrabiomes.Extrabiomes;
import net.minecraft.block.BlockVine;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;

public class BlockCustomVine extends BlockVine {

	public enum BlockType {
		GLORIOSA, SPANISH_MOSS;
	}

	public final BlockType	type;

	public BlockCustomVine(BlockType type) {
		super();
		this.type = type;
		setHardness(0.2F);
		setStepSound(soundTypeGrass);
	}
	
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
    	final String IIconPath = Extrabiomes.TEXTURE_PATH + "vine_" + type.toString().toLowerCase();
		this.blockIcon = iconRegister.registerIcon(IIconPath);
    }

    /*
    @SideOnly(Side.CLIENT)
    public int getBlockColor()
    {
        return 0xffffff;
    }//*/
    
    @SideOnly(Side.CLIENT)

    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        return 0xffffff;
    }

}
