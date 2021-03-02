package com.jtrent238.doritosmod;

import com.jtrent238.doritosmod.items.ItemDoritosBag;
import com.jtrent238.doritosmod.items.ItemDoritosChip;

import dangerzone.BaseMod;
import dangerzone.Crafting;
import dangerzone.items.Items;

public class DoritosModMain extends BaseMod{
	
		//See DangerZoneBase, Items, and Blocks. They have examples of everything...
		//This is just here to help you get everything set up.
		//This is it. This is where you start your mod!
		
		public static int chipAmount = (int) 0.5F;
		public static int chipSaturation = 2;
		public static int numChipsBag = 9;
		private static String MODID = "doritosmod";
		
		/*
		 * Doritos Bags
		 */
		public static final ItemDoritosBag dorito_bag_nachocheese = new ItemDoritosBag(DoritosModMain.MODID  + "NachoCheeseBag", DoritosModMain.MODID + "res/items/nacho_cheese_bag.png", chipAmount * numChipsBag);
		public static final ItemDoritosBag dorito_bag_coolranch = new ItemDoritosBag(DoritosModMain.MODID  + "CoolRanchBag", DoritosModMain.MODID + "res/items/cool_ranch_bag.png", chipAmount * numChipsBag);
		public static final ItemDoritosBag dorito_bag_toastedcorn = new ItemDoritosBag(DoritosModMain.MODID  + "ToastedCornBag", DoritosModMain.MODID + "res/items/toasted_corn_bag.png", chipAmount * numChipsBag);
		public static final ItemDoritosBag dorito_bag_spicynacho = new ItemDoritosBag(DoritosModMain.MODID  + "SpicyNachoBag", DoritosModMain.MODID + "res/items/spicy_nacho_bag.png", chipAmount * numChipsBag);
		public static final ItemDoritosBag dorito_bag_spicysweetchili = new ItemDoritosBag(DoritosModMain.MODID  + "SpicySweetChiliBag", DoritosModMain.MODID + "res/items/spicy_sweet_chili_bag.png", chipAmount * numChipsBag);
		public static final ItemDoritosBag dorito_bag_taco = new ItemDoritosBag(DoritosModMain.MODID  + "TacoBag", DoritosModMain.MODID + "res/items/taco_bag.png", chipAmount * numChipsBag);
		public static final ItemDoritosBag dorito_bag_tapatio = new ItemDoritosBag(DoritosModMain.MODID  + "TapatioBag", DoritosModMain.MODID + "res/items/tapatio_bag.png", chipAmount * numChipsBag);
		public static final ItemDoritosBag dorito_bag_jackranchwingsdiped = new ItemDoritosBag(DoritosModMain.MODID  + "JackRanchWingDipedBag", DoritosModMain.MODID + "res/items/jack_ranch_wing_diped_bag.png", chipAmount * numChipsBag);
		public static final ItemDoritosBag dorito_bag_flamas = new ItemDoritosBag(DoritosModMain.MODID  + "FlamasBag", DoritosModMain.MODID + "res/items/flamas_bag.png", chipAmount * numChipsBag);
		public static final ItemDoritosBag dorito_bag_dinamitafieryhabanero = new ItemDoritosBag(DoritosModMain.MODID  + "DinamitaFieryHabaneroBag", DoritosModMain.MODID + "res/items/dinamita_fiery_habanero_bag.png", chipAmount * numChipsBag);
		public static final ItemDoritosBag dorito_bag_dinamitachilelimon = new ItemDoritosBag(DoritosModMain.MODID  + "DinamitaChileLimonBag", DoritosModMain.MODID + "res/items/dinamita_fiery_chile_limon_bag.png", chipAmount * numChipsBag);
		public static final ItemDoritosBag dorito_bag_wasabi = new ItemDoritosBag(DoritosModMain.MODID  + "WasabiBag", DoritosModMain.MODID + "res/items/wasabi_bag.png", chipAmount * numChipsBag);
		public static final ItemDoritosBag dorito_bag_blaze = new ItemDoritosBag(DoritosModMain.MODID  + "BlazeBag", DoritosModMain.MODID + "res/items/blaze_bag.png", chipAmount * numChipsBag);
				
		/*
		 * Doritos chips
		 */
		public static final ItemDoritosChip dorito_chip_nachocheese = new ItemDoritosChip(DoritosModMain.MODID  + "NachoCheesechip", DoritosModMain.MODID + "res/items/nacho_cheese_chip.png", chipAmount);
		public static final ItemDoritosChip dorito_chip_coolranch = new ItemDoritosChip(DoritosModMain.MODID  + "CoolRanchchip", DoritosModMain.MODID + "res/items/cool_ranch_chip.png", chipAmount);
		public static final ItemDoritosChip dorito_chip_toastedcorn = new ItemDoritosChip(DoritosModMain.MODID  + "ToastedCornchip", DoritosModMain.MODID + "res/items/toasted_corn_chip.png", chipAmount);
		public static final ItemDoritosChip dorito_chip_spicynacho = new ItemDoritosChip(DoritosModMain.MODID  + "SpicyNachochip", DoritosModMain.MODID + "res/items/spicy_nacho_chip.png", chipAmount);
		public static final ItemDoritosChip dorito_chip_spicysweetchili = new ItemDoritosChip(DoritosModMain.MODID  + "SpicySweetChilichip", DoritosModMain.MODID + "res/items/spicy_sweet_chili_chip.png", chipAmount);
		public static final ItemDoritosChip dorito_chip_taco = new ItemDoritosChip(DoritosModMain.MODID  + "Tacochip", DoritosModMain.MODID + "res/items/taco_chip.png", chipAmount);
		public static final ItemDoritosChip dorito_chip_tapatio = new ItemDoritosChip(DoritosModMain.MODID  + "Tapatiochip", DoritosModMain.MODID + "res/items/tapatio_chip.png", chipAmount);
		public static final ItemDoritosChip dorito_chip_jackranchwingsdiped = new ItemDoritosChip(DoritosModMain.MODID  + "JackRanchWingDipedchip", DoritosModMain.MODID + "res/items/jack_ranch_wing_diped_chip.png", chipAmount);
		public static final ItemDoritosChip dorito_chip_flamas = new ItemDoritosChip(DoritosModMain.MODID  + "Flamaschip", DoritosModMain.MODID + "res/items/flamas_chip.png", chipAmount);
		public static final ItemDoritosChip dorito_chip_dinamitafieryhabanero = new ItemDoritosChip(DoritosModMain.MODID  + "DinamitaFieryHabanerochip", DoritosModMain.MODID + "res/items/dinamita_fiery_habanero_chip.png", chipAmount);
		public static final ItemDoritosChip dorito_chip_dinamitachilelimon = new ItemDoritosChip(DoritosModMain.MODID  + "DinamitaChileLimonchip", DoritosModMain.MODID + "res/items/dinamita_fiery_chile_limon_chip.png", chipAmount);
		public static final ItemDoritosChip dorito_chip_wasabi = new ItemDoritosChip(DoritosModMain.MODID  + "Wasabichip", DoritosModMain.MODID + "res/items/wasabi_chip.png", chipAmount);
		public static final ItemDoritosChip dorito_chip_blaze = new ItemDoritosChip(DoritosModMain.MODID  + "Blazechip", DoritosModMain.MODID + "res/items/blaze_chip.png", chipAmount);
		//NAME MUST END IN "Main" so loader can find it...
		//NAME MUST END IN "Main" so loader can find it...
		//NAME MUST END IN "Main" so loader can find it...
		public DoritosModMain (){
			super();
		}
		
		public String getModName()
		{
			return "Doritos Mod Version 1.0.0.0";
		}
		
		//Copy-paste the same string from Dangerzone.versionstring at the top of the DangerZone.java file.
		//DO NOT just return DangerZone.versionstring. That defeats the purpose, which is a compatibility check so as to not frustrate the player!
		//Make sure you update this string with each new version you update to.
		public String versionBuiltWith()
		{
			return "2.0";
		}
		
		//This is where all your registration happens.
		public void registerThings(){
			Items.registerItem(dorito_bag_nachocheese);
			Items.registerItem(dorito_bag_coolranch);
			Items.registerItem(dorito_bag_toastedcorn);
			Items.registerItem(dorito_bag_spicynacho);
			Items.registerItem(dorito_bag_spicysweetchili);
			Items.registerItem(dorito_bag_taco);
			Items.registerItem(dorito_bag_tapatio);
			Items.registerItem(dorito_bag_jackranchwingsdiped);
			Items.registerItem(dorito_bag_flamas);
			Items.registerItem(dorito_bag_dinamitafieryhabanero);
			Items.registerItem(dorito_bag_dinamitachilelimon);
			Items.registerItem(dorito_bag_wasabi);
			Items.registerItem(dorito_bag_blaze);
			
			Items.registerItem(dorito_chip_nachocheese);
			Items.registerItem(dorito_chip_coolranch);
			Items.registerItem(dorito_chip_toastedcorn);
			Items.registerItem(dorito_chip_spicynacho);
			Items.registerItem(dorito_chip_spicysweetchili);
			Items.registerItem(dorito_chip_taco);
			Items.registerItem(dorito_chip_tapatio);
			Items.registerItem(dorito_chip_jackranchwingsdiped);
			Items.registerItem(dorito_chip_flamas);
			Items.registerItem(dorito_chip_dinamitafieryhabanero);
			Items.registerItem(dorito_chip_dinamitachilelimon);
			Items.registerItem(dorito_chip_wasabi);
			Items.registerItem(dorito_chip_blaze);
			
			Crafting.registerCraftingRecipe(dorito_chip_nachocheese, dorito_chip_nachocheese, dorito_chip_nachocheese, dorito_chip_nachocheese, dorito_chip_nachocheese, dorito_chip_nachocheese, dorito_chip_nachocheese, dorito_chip_nachocheese, dorito_chip_nachocheese, dorito_bag_nachocheese, 1, true);
			Crafting.registerCraftingRecipe(dorito_bag_nachocheese, null, null, null, null, null, null, null, null, dorito_chip_nachocheese, 9, false);
		}
		
		//You probably won't need this routine unless you care which OTHER mods are installed.
		//This is called AFTER all mods are loaded and registered.
		//It needs to exist, just leave it empty.
		public void postLoadProcessing(){
			//System.out.printf("Demo mod printf! postLoadProcessing()\n");
			//System.out.printf("Block 1 name is: %s\n", Blocks.BlockArray[1].uniquename);
			//System.out.printf("Renderdistance is: %d\n", DangerZone.renderdistance);
		}

	}