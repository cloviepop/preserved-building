package preservedbuilding;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class PreservedBuilding implements ModInitializer {

	public static final String MOD_ID = "preserved-building";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModBlocks.initialize();
	}



	public static class ModBlocks {

		public static Block register(Block block, String name) {
			// Register the block and its item.
			Identifier id = new Identifier("preserved-building", name);

			BlockItem blockItem = new BlockItem(block, new Item.Settings());
			Registry.register(Registries.ITEM, id, blockItem);

			return Registry.register(Registries.BLOCK, id, block);
		}

		public static void initialize() {
		}


		public static final Block AZURITE_STONE = register(new Block(FabricBlockSettings.create().strength(100.0F, 1200.0F).sounds(BlockSoundGroup.STONE).requiresTool()), "azurite_stone");
		public static final Block AZURITE_STAIRS = register(new StairsBlock(AZURITE_STONE.getDefaultState(), FabricBlockSettings.copyOf(AZURITE_STONE)), "azurite_stone_stairs");
		public static final Block AZURITE_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(AZURITE_STONE)), "azurite_stone_slab");
		public static final Block AZURITE_WALL = register(new WallBlock(FabricBlockSettings.copyOf(AZURITE_STONE)), "azurite_stone_wall");
		public static final Block POWDER_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE).luminance(state -> 2)), "powder_chiseled_azurite_stone");
		public static final Block DIKE_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE).luminance(state -> 6)), "dike_chiseled_azurite_stone");
		public static final Block DREAM_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE).luminance(state -> 6)), "dream_chiseled_azurite_stone");
		public static final Block DEEP_LIGHT_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE).luminance(state -> 2)), "deep_light_chiseled_azurite_stone");
		public static final Block AZURITE_BRICKS = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "azurite_stone_bricks");
		public static final Block SHIMMERING_AZURITE_BRICKS = register(new Block(FabricBlockSettings.copyOf(FabricBlockSettings.copyOf(AZURITE_STONE)).luminance(5)), "shimmering_azurite_stone_bricks");

		public static final Block BLACK_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "black_chiseled_azurite_stone");
		public static final Block BLUE_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "blue_chiseled_azurite_stone");
		public static final Block BROWN_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "brown_chiseled_azurite_stone");
		public static final Block CYAN_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "cyan_chiseled_azurite_stone");
		public static final Block GRAY_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "gray_chiseled_azurite_stone");
		public static final Block GREEN_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "green_chiseled_azurite_stone");
		public static final Block LIGHT_BLUE_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "light_blue_chiseled_azurite_stone");
		public static final Block LIGHT_GRAY_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "light_gray_chiseled_azurite_stone");
		public static final Block LIME_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "lime_chiseled_azurite_stone");
		public static final Block MAGENTA_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "magenta_chiseled_azurite_stone");
		public static final Block ORANGE_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "orange_chiseled_azurite_stone");
		public static final Block PINK_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "pink_chiseled_azurite_stone");
		public static final Block PURPLE_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "purple_chiseled_azurite_stone");
		public static final Block RED_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "red_chiseled_azurite_stone");
		public static final Block WHITE_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "white_chiseled_azurite_stone");
		public static final Block YELLOW_CHISELED_AZURITE_STONE = register(new Block(FabricBlockSettings.copyOf(AZURITE_STONE)), "yellow_chiseled_azurite_stone");

		public static final Block AZURITE_GLASS = register(new GlassBlock(FabricBlockSettings.create().strength(100.0F, 1200.0F).sounds(BlockSoundGroup.GLASS).nonOpaque().requiresTool()), "azurite_glass");
		public static final Block TINTED_AZURITE_GLASS = register(new TintedGlassBlock(FabricBlockSettings.copyOf(AZURITE_GLASS)), "tinted_azurite_glass");


	}
}