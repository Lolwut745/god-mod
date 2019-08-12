package winterhaha.tutorialmod.item;

import winterhaha.tutorialmod.TutorialMod;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemTutorialArmor extends ItemArmor {
	
	public ItemTutorialArmor(ArmorMaterial material, EntityEquipmentSlot equipmentSlot, String unlocalizedName, String registryName) {
		super(material, 0, equipmentSlot);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
	}

}
