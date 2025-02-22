package me.waleks.simplematerialgenerators.items;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.blocks.BlockPosition;
import io.github.thebusybiscuit.slimefun4.libraries.paperlib.PaperLib;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.HashMap;
import java.util.Map;

public class MaterialGenerator extends SlimefunItem {

    private static final Map<BlockPosition, Integer> generatorProgress = new HashMap<>();

    private int rate = 2;
    private ItemStack item;

    @ParametersAreNonnullByDefault
    public MaterialGenerator(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        addItemHandler(new BlockTicker() {

            @Override
            @ParametersAreNonnullByDefault
            public void tick(Block b, SlimefunItem sf, Config data) {
                MaterialGenerator.this.tick(b);
            }

            @Override
            public boolean isSynchronized() {
                return true;
            }
        });
    }

    public void tick(@Nonnull Block b) {
        Block[] targetBlocks = {
            b.getRelative(BlockFace.UP),
            b.getRelative(BlockFace.DOWN),
            b.getRelative(BlockFace.EAST),
            b.getRelative(BlockFace.WEST),
            b.getRelative(BlockFace.NORTH),
            b.getRelative(BlockFace.SOUTH)
        };

        for (Block targetBlock : targetBlocks) {
            if (targetBlock.getType() == Material.CHEST || targetBlock.getType() == Material.HOPPER) {
                BlockState state = PaperLib.getBlockState(targetBlock, false).getState();
                if (state instanceof InventoryHolder) {
                    Inventory inv = ((InventoryHolder) state).getInventory();
                    if (inv.firstEmpty() != -1) {
                        final BlockPosition pos = new BlockPosition(b);
                        int progress = generatorProgress.getOrDefault(pos, 0);

                        if (progress >= this.rate) {
                            progress = 0;
                            inv.addItem(this.item);
                        } else {
                            progress++;
                        }
                        generatorProgress.put(pos, progress);
                    }
                }
                break;
            }
        }
    }

    public final MaterialGenerator setItem(@Nonnull Material material) {
        this.item = new ItemStack(material);
        return this;
    }

    public final MaterialGenerator setRate(int rateTicks) {
        this.rate = Math.max(rateTicks, 2);
        return this;
    }
}

