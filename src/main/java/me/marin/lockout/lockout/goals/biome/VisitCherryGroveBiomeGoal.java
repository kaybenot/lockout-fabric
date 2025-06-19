package me.marin.lockout.lockout.goals.biome;

import me.marin.lockout.lockout.interfaces.VisitBiomeGoal;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.List;

public class VisitCherryGroveBiomeGoal extends VisitBiomeGoal {

    private static final ItemStack ITEM_STACK = Items.CHERRY_LEAVES.getDefaultStack();

    public VisitCherryGroveBiomeGoal(String id, String data) {
        super(id, data);
    }

    @Override
    public List<Identifier> getBiomes() {
        return List.of(
                Identifier.of("minecraft", "cherry_grove")
        );
    }

    @Override
    public String getGoalName() {
        return "Find Cherry Grove";
    }

    @Override
    public ItemStack getTextureItemStack() {
        return ITEM_STACK;
    }
}
