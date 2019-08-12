package winterhaha.tutorialmod.item;

import winterhaha.tutorialmod.TutorialMod;

import net.minecraft.item.Item;

import net.minecraft.creativetab.CreativeTabs;

public class ItemGodRock extends Item {
	public ItemGodRock() {
		setUnlocalizedName(TutorialMod.MODID + "." + "god_rock");
		setRegistryName(TutorialMod.MODID,"god_rock");
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}
}
