package winterhaha.tutorialmod;

import winterhaha.tutorialmod.TutorialMod;
import winterhaha.tutorialmod.block.BlockDemonBlock;
import winterhaha.tutorialmod.item.ItemGodRock;
import winterhaha.tutorialmod.item.ItemTutorialAxe;
import winterhaha.tutorialmod.item.ItemTutorialHoe;
import winterhaha.tutorialmod.item.ItemTutorialPickaxe;
import winterhaha.tutorialmod.item.ItemTutorialShovel;
import winterhaha.tutorialmod.item.ItemTutorialSword;
import winterhaha.tutorialmod.material.TutorialMaterials;
import winterhaha.tutorialmod.item.ItemTutorialArmor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.inventory.EntityEquipmentSlot;

import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = TutorialMod.MODID)
public class EventSubscriber {

	public static final Block[] blocks = {
			new BlockDemonBlock()
	};
	
	public static final Item[] items = {
			new ItemGodRock(),
			new ItemTutorialAxe(TutorialMaterials.TUTORIAL_AXE,"tutorialmod.god_axe","tutorialmod:god_axe"),
			new ItemTutorialHoe(TutorialMaterials.TUTORIAL_HOE),
			new ItemTutorialPickaxe(TutorialMaterials.TUTORIAL_PICKAXE),
			new ItemTutorialShovel(TutorialMaterials.TUTORIAL_SHOVEL),
			new ItemTutorialSword(TutorialMaterials.TUTORIAL_SWORD),
			new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.HEAD,"helmetTutorial", "tutorial_helmet"),
			new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.CHEST,"chestplateTutorial", "tutorial_chestplate"),
			new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.LEGS,"leggingsTutorial", "tutorial_leggings"),
			new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.FEET,"bootsTutorial", "tutorial_boots"),
			
	};
	
	public static final Item[] itemBlocks = {
			new ItemBlock(blocks[0]).setRegistryName(blocks[0].getRegistryName())
	};
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		event.getRegistry().registerAll(blocks);
	};
	
	
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	};
	
}
