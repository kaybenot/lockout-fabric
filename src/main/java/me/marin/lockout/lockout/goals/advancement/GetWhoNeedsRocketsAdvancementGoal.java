package me.marin.lockout.lockout.goals.advancement;

import me.marin.lockout.lockout.interfaces.AdvancementGoal;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.List;

public class GetWhoNeedsRocketsAdvancementGoal extends AdvancementGoal {

    private static final Item ITEM = Items.WIND_CHARGE;
    private static final List<Identifier> ADVANCEMENTS = List.of(Identifier.of("minecraft", "adventure/who_needs_rockets"));

    public GetWhoNeedsRocketsAdvancementGoal(String id, String data) {
        super(id, data);
    }

    @Override
    public List<Identifier> getAdvancements() {
        return ADVANCEMENTS;
    }

    @Override
    public String getGoalName() {
        return "Use a Wind Charge to Launch Yourself Upward 8 Blocks";
    }

    @Override
    public ItemStack getTextureItemStack() {
        return ITEM.getDefaultStack();
    }
}
