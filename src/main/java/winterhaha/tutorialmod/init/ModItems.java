package winterhaha.tutorialmod.init;

import winterhaha.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraft.creativetab.CreativeTabs;

@ObjectHolder(TutorialMod.MODID)
public class ModItems {
	
	public static Item FIRST_ITEM = null;
	
	@EventBusSubscriber(modid = TutorialMod.MODID)
	public static class RegistrationHandler{
		
		@SubscribeEvent
		public static void registerItems(Register<Item> event) {
			final Item[]items = {
					new Item().setRegistryName(TutorialMod.MODID,"first_item").setUnlocalizedName(TutorialMod.MODID + "." +"first_item").setCreativeTab(CreativeTabs.MISC)
			};
			
			FIRST_ITEM = items[0];
			
			event.getRegistry().registerAll(items);
		}
	}

}
