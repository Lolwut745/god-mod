package winterhaha.tutorialmod.item;

import winterhaha.tutorialmod.TutorialMod;
import net.minecraft.item.ItemSword;

public class ItemTutorialSword extends ItemSword {
	
	public ItemTutorialSword(ToolMaterial material) {
		super(material);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
		setUnlocalizedName(TutorialMod.MODID + "." + "god_dagger");
		setRegistryName(TutorialMod.MODID,"god_dagger");
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}

}
