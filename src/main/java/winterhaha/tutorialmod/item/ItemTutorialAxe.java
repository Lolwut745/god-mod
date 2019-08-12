package winterhaha.tutorialmod.item;

import winterhaha.tutorialmod.TutorialMod;
import net.minecraft.item.ItemAxe;

public class ItemTutorialAxe extends ItemAxe {
	
	public ItemTutorialAxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
		setUnlocalizedName(TutorialMod.MODID + "." + "god_axe");
		setRegistryName(TutorialMod.MODID,"god_axe");
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}
	
	public ItemTutorialAxe(ToolMaterial material, String unlocalizedName, String registryName) {
		this(material, 8.0F, -3.1F);
	}
	

}
