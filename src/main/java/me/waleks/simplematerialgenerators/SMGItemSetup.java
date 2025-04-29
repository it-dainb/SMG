package me.waleks.simplematerialgenerators;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.waleks.simplematerialgenerators.items.BrokenGenerator;
import me.waleks.simplematerialgenerators.items.GeneratorMultiblock;
import me.waleks.simplematerialgenerators.items.MaterialGenerator;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public final class SMGItemSetup {

    private SMGItemSetup() {}

    public static void setup(@Nonnull SimpleMaterialGenerators plugin) {
        new GeneratorMultiblock(SMGItems.SMG_ITEM_CATEGORY, SMGItems.SMG_GENERATOR_MULTIBLOCK).register(plugin);

		/*	Template for adding more items
		new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
			SMGItems.SMG_GENERATOR_,
			RecipeType.ENHANCED_CRAFTING_TABLE,
			new ItemStack[] {
				null, null, null,
				null, null, null,
		 		null, null, null
		 	})
		.setItem(Material.)
		.setRate(1)
		.register(plugin);
		*/

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_COBBLESTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE),
				new ItemStack(Material.SMOOTH_STONE),
                new ItemStack(Material.LAVA_BUCKET), new ItemStack(Material.IRON_PICKAXE),
				new ItemStack(Material.WATER_BUCKET),
                new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE),
				new ItemStack(Material.SMOOTH_STONE)
            })
            .setItem(Material.COBBLESTONE)
            .setRate(4)
            .register(plugin);

        new BrokenGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_STONE_BROKEN,
            RecipeType.SMELTERY,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_COBBLESTONE, null, null,
                null, null, null,
                null, null, null
            }).register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_STONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.STONE), SlimefunItems.SOLDER_INGOT, new ItemStack(Material.STONE),
                SlimefunItems.SOLDER_INGOT, SMGItems.SMG_GENERATOR_STONE_BROKEN, SlimefunItems.SOLDER_INGOT,
                new ItemStack(Material.STONE), SlimefunItems.SOLDER_INGOT, new ItemStack(Material.STONE)
            })
            .setItem(Material.STONE)
            .setRate(8)
            .register(plugin);

        new BrokenGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SMOOTH_STONE_BROKEN,
            RecipeType.SMELTERY,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_STONE, null, null,
                null, null, null,
                null, null, null
            }).register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SMOOTH_STONE,
            RecipeType.SMELTERY,
            new ItemStack[] {
                new ItemStack(Material.SMOOTH_STONE), SlimefunItems.STEEL_INGOT, new ItemStack(Material.SMOOTH_STONE),
                new ItemStack(Material.IRON_BARS), SMGItems.SMG_GENERATOR_SMOOTH_STONE_BROKEN,
				new ItemStack(Material.IRON_BARS),
                new ItemStack(Material.SMOOTH_STONE), SlimefunItems.STEEL_INGOT, new ItemStack(Material.SMOOTH_STONE)
            })
            .setItem(Material.SMOOTH_STONE)
            .setRate(12)
            .register(plugin);

        new BrokenGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_GRAVEL_BROKEN,
            RecipeType.GRIND_STONE,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_COBBLESTONE, null, null,
                null, null, null,
                null, null, null
            }).register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_GRAVEL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.STONE_BRICKS), SlimefunItems.BILLON_INGOT, new ItemStack(Material.STONE_BRICKS),
                SlimefunItems.BILLON_INGOT, SMGItems.SMG_GENERATOR_GRAVEL_BROKEN, SlimefunItems.BILLON_INGOT,
                new ItemStack(Material.STONE_BRICKS), SlimefunItems.BILLON_INGOT, new ItemStack(Material.STONE_BRICKS)
            })
            .setItem(Material.GRAVEL)
            .setRate(8)
            .register(plugin);

        new BrokenGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SAND_BROKEN,
            RecipeType.ORE_CRUSHER,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_GRAVEL, null, null,
                null, null, null,
                null, null, null
            }).register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SAND,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.SANDSTONE), SlimefunItems.DURALUMIN_INGOT, new ItemStack(Material.SANDSTONE),
                SlimefunItems.DURALUMIN_INGOT, SMGItems.SMG_GENERATOR_SAND_BROKEN, SlimefunItems.DURALUMIN_INGOT,
                new ItemStack(Material.SANDSTONE), SlimefunItems.DURALUMIN_INGOT, new ItemStack(Material.SANDSTONE)
            })
            .setItem(Material.SAND)
            .setRate(8)
            .register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_GLASS,
            RecipeType.SMELTERY,
            new ItemStack[] {
                SlimefunItems.BRONZE_INGOT, SlimefunItems.GOLD_8K, SlimefunItems.BRONZE_INGOT,
                SlimefunItems.BRASS_INGOT, SMGItems.SMG_GENERATOR_SAND, SlimefunItems.BRASS_INGOT,
                null, null, null
            })
            .setItem(Material.GLASS)
            .setRate(12)
            .register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_NETHERRACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT,
                SMGItems.SMG_GENERATOR_STONE, new ItemStack(Material.LAVA_BUCKET), SMGItems.SMG_GENERATOR_STONE,
                SMGItems.SMG_GENERATOR_STONE, SlimefunItems.COMPOSTER, SMGItems.SMG_GENERATOR_STONE
            })
            .setItem(Material.NETHERRACK)
            .setRate(10)
            .register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SOUL_SAND,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SlimefunItems.STEEL_INGOT, new ItemStack(Material.SPIDER_EYE), SlimefunItems.STEEL_INGOT,
                new ItemStack(Material.ROTTEN_FLESH), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.BONE),
                SMGItems.SMG_GENERATOR_SAND, SlimefunItems.COMPOSTER, SMGItems.SMG_GENERATOR_SAND
            })
            .setItem(Material.SOUL_SAND)
            .setRate(8)
            .register(plugin);

	new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
	    SMGItems.SMG_GENERATOR_WOOD,
	    RecipeType.ENHANCED_CRAFTING_TABLE,
	        new ItemStack[] {
	        new ItemStack(Material.OAK_LOG), new ItemStack(Material.OAK_SAPLING), new ItemStack(Material.OAK_LOG),
	        new ItemStack(Material.OAK_SAPLING), SlimefunItems.LUMBER_AXE, new ItemStack(Material.OAK_SAPLING),
	        new ItemStack(Material.OAK_LOG), new ItemStack(Material.OAK_SAPLING), new ItemStack(Material.OAK_LOG)
	    })
	.setItem(Material.CHARCOAL)
	.setRate(6)
	.register(plugin);
        
        new SlimefunItem(SMGItems.SMG_ITEM_CATEGORY,
	    SMGItems.SMG_CHARCOAL_BLOCK,
	    RecipeType.COMPRESSOR,
	    new ItemStack[] {
                new ItemStack(Material.CHARCOAL, 9), null, null,
                null, null, null,
                null, null, null
	})
	.register(plugin);
 
	new BrokenGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_CHARCOAL_BROKEN,
            RecipeType.SMELTERY,
            new ItemStack[] {
                new SlimefunItemStack(SMGItems.SMG_GENERATOR_WOOD, 1), null, null,
                null, null, null,
                null, null, null
            })
        .register(plugin);
	    
    	new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
	    SMGItems.SMG_GENERATOR_CHARCOAL,
	    RecipeType.ENHANCED_CRAFTING_TABLE,
	    new ItemStack[] {
		SMGItems.SMG_CHARCOAL_BLOCK,  SlimefunItems.CARBON, SMGItems.SMG_CHARCOAL_BLOCK,
		SlimefunItems.CARBON,  SMGItems.SMG_GENERATOR_CHARCOAL_BROKEN,  SlimefunItems.CARBON,
		SMGItems.SMG_CHARCOAL_BLOCK,  SlimefunItems.CARBON, SMGItems.SMG_CHARCOAL_BLOCK
	    })
	    .setItem(Material.CHARCOAL)
	    .setRate(8)
	    .register(plugin);

        new BrokenGenerator(SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_COAL_BROKEN,
            RecipeType.COMPRESSOR,
            new ItemStack[] {
                new SlimefunItemStack(SMGItems.SMG_GENERATOR_CHARCOAL, 9), null, null,
                null, null, null,
                null, null, null
            })
        .register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
			SMGItems.SMG_GENERATOR_COAL,
			RecipeType.ENHANCED_CRAFTING_TABLE,
			new ItemStack[] {
				new ItemStack(Material.COAL_BLOCK), SlimefunItems.COMPRESSED_CARBON, new ItemStack(Material.COAL_BLOCK),
                SlimefunItems.COMPRESSED_CARBON, SMGItems.SMG_GENERATOR_COAL_BROKEN, SlimefunItems.COMPRESSED_CARBON,
                new ItemStack(Material.COAL_BLOCK), SlimefunItems.COMPRESSED_CARBON, new ItemStack(Material.COAL_BLOCK)
		 	})
		.setItem(Material.COAL)
		.setRate(12)
		.register(plugin);

        new BrokenGenerator(SMGItems.SMG_ITEM_CATEGORY,
			SMGItems.SMG_GENERATOR_COAL_BLOCK_BROKEN,
			RecipeType.PRESSURE_CHAMBER,
			new ItemStack[] {
				new SlimefunItemStack(SMGItems.SMG_GENERATOR_COAL, 9), null, null,
                null, null, null,
                null, null, null
		 	})
		.register(plugin);

        new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
			SMGItems.SMG_GENERATOR_COAL_BLOCK,
			RecipeType.ENHANCED_CRAFTING_TABLE,
			new ItemStack[] {
				SlimefunItems.CARBON_CHUNK, SlimefunItems.CARBONADO, SlimefunItems.CARBON_CHUNK,
                SMGItems.SMG_GENERATOR_COAL, SMGItems.SMG_GENERATOR_COAL_BLOCK_BROKEN, SMGItems.SMG_GENERATOR_COAL,
                SlimefunItems.CARBON_CHUNK, SlimefunItems.CARBONADO, SlimefunItems.CARBON_CHUNK
		 	})
		.setItem(Material.COAL_BLOCK)
		.setRate(20)
		.register(plugin);
    }
}
