package winterhaha.tutorialmod.item;

import winterhaha.tutorialmod.TutorialMod;
import net.minecraft.item.ItemPickaxe;

public class ItemTutorialPickaxe extends ItemPickaxe {
	
	public ItemTutorialPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
		setUnlocalizedName(TutorialMod.MODID + "." + "god_pickaxe");
		setRegistryName(TutorialMod.MODID,"god_pickaxe");
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}

}
