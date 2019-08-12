package winterhaha.tutorialmod.item;

import winterhaha.tutorialmod.TutorialMod;
import net.minecraft.item.ItemSpade;

public class ItemTutorialShovel extends ItemSpade {
	
	public ItemTutorialShovel(ToolMaterial material) {
		super(material);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
		setUnlocalizedName(TutorialMod.MODID + "." + "god_shovel");
		setRegistryName(TutorialMod.MODID,"god_shovel");
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}

}
