package winterhaha.tutorialmod.material;


import winterhaha.tutorialmod.TutorialMod;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;


public class TutorialMaterials {
	
	public static final ToolMaterial TUTORIAL_TOOL = EnumHelper.addToolMaterial(TutorialMod.MODID + ":" + "tutorial_tool", 3, 1000000, 20.0F, 10.0F, 15);
	public static final ToolMaterial TUTORIAL_AXE = EnumHelper.addToolMaterial(TutorialMod.MODID + ":" + "god_axe", 3, 1000000, 20.0F, 10.0F, 15);
	public static final ToolMaterial TUTORIAL_HOE = EnumHelper.addToolMaterial(TutorialMod.MODID + ":" + "god_hoe", 3, 1000000, 20.0F, 10.0F, 15);
	public static final ToolMaterial TUTORIAL_PICKAXE = EnumHelper.addToolMaterial(TutorialMod.MODID + ":" + "god_pickaxe", 3, 1000000, 20.0F, 10.0F, 15);
	public static final ToolMaterial TUTORIAL_SHOVEL = EnumHelper.addToolMaterial(TutorialMod.MODID + ":" + "god_shovel", 3, 1000000, 20.0F, 10.0F, 15);
	public static final ToolMaterial TUTORIAL_SWORD = EnumHelper.addToolMaterial(TutorialMod.MODID + ":" + "god_dagger", 3, 1000000, 20.0F, 100000000000.0F, 15);
	public static final ArmorMaterial TUTORIAL_ARMOR = EnumHelper.addArmorMaterial(TutorialMod.MODID + "." + "tutorial_armor", TutorialMod.MODID + ":tutorial", 1000000000, new int[] {4,10,5,4}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);

}
