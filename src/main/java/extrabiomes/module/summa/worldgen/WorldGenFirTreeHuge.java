/**
 * This work is licensed under the Creative Commons
 * Attribution-ShareAlike 3.0 Unported License. To view a copy of this
 * license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 */

package extrabiomes.module.summa.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class WorldGenFirTreeHuge extends WorldGenAbstractTree
{   
    //This class is 100% broken

    public WorldGenFirTreeHuge(boolean doNotify)
    {
        super(doNotify);
    }

    @Override
    public boolean generate(World world, Random rand, int x, int y, int z)
    {
        return true;
    }
    
    public boolean generate(World world, long seed, int x, int y, int z)
    {
        return true;
    }
    
    public static long getLastSeed()
    {
        return 0L;
    }
}
