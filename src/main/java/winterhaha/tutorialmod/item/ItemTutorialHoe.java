package winterhaha.tutorialmod.item;

import winterhaha.tutorialmod.TutorialMod;
import net.minecraft.item.ItemHoe;

public class ItemTutorialHoe extends ItemHoe {
	
	public ItemTutorialHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
		setUnlocalizedName(TutorialMod.MODID + "." + "god_hoe");
		setRegistryName(TutorialMod.MODID,"god_hoe");
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}

}
