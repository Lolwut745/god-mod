package winterhaha.tutorialmod.client;

import winterhaha.tutorialmod.TutorialMod;
import winterhaha.tutorialmod.EventSubscriber;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = TutorialMod.MODID)
public class ModelRegistrationHandler {
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(Item.getItemFromBlock(EventSubscriber.blocks[0]), 0);
		registerModel(EventSubscriber.items[0],0);
		registerModel(EventSubscriber.items[1],0);
		registerModel(EventSubscriber.items[2],0);
		registerModel(EventSubscriber.items[3],0);
		registerModel(EventSubscriber.items[4],0);
		registerModel(EventSubscriber.items[5],0);
		registerModel(EventSubscriber.items[6],0);
		registerModel(EventSubscriber.items[7],0);
		registerModel(EventSubscriber.items[8],0);
		registerModel(EventSubscriber.items[9],0);
	}
	
	private static void registerModel(Item item, int meta) {
			ModelLoader.setCustomModelResourceLocation(item, meta,
							new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}
}
