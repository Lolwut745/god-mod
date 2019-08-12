package winterhaha.tutorialmod.block;

import winterhaha.tutorialmod.TutorialMod;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDemonBlock extends Block {
	
	public BlockDemonBlock() {
		
		super(Material.ROCK);
		setRegistryName("demon_block");
		setUnlocalizedName(TutorialMod.MODID + "." + "demon_block" );
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
		setSoundType(SoundType.STONE);
	}

}

