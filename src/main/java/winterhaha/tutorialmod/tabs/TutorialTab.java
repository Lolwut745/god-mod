package winterhaha.tutorialmod.tabs;

import winterhaha.tutorialmod.TutorialMod;
import winterhaha.tutorialmod.EventSubscriber;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class TutorialTab extends CreativeTabs {
	
	public TutorialTab() {
		super(TutorialMod.MODID);
		
	}

	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(EventSubscriber.items[0]);
	}
	
}
