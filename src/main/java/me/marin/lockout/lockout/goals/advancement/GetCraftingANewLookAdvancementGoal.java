package me.marin.lockout.lockout.goals.advancement;

import me.marin.lockout.lockout.interfaces.AdvancementGoal;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.List;

public class GetCraftingANewLookAdvancementGoal extends AdvancementGoal {

    private static final Item ITEM = Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE;
    private static final List<Identifier> ADVANCEMENTS = List.of(Identifier.of("minecraft", "adventure/trim_with_any_armor_pattern"));

    public GetCraftingANewLookAdvancementGoal(String id, String data) {
        super(id, data);
    }

    @Override
    public List<Identifier> getAdvancements() {
        return ADVANCEMENTS;
    }

    @Override
    public String getGoalName() {
        return "Craft Trimmed Armor at a Smithing Table";
    }

    @Override
    public ItemStack getTextureItemStack() {
        return ITEM.getDefaultStack();
    }
}
