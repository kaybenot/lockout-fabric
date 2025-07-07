package me.marin.lockout.lockout.goals.advancement;

import me.marin.lockout.lockout.interfaces.AdvancementGoal;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.List;

public class GetShearBrillianceAdvancementGoal extends AdvancementGoal {

    private static final Item ITEM = Items.WOLF_ARMOR;
    private static final List<Identifier> ADVANCEMENTS = List.of(Identifier.of("minecraft", "husbandry/remove_wolf_armor"));

    public GetShearBrillianceAdvancementGoal(String id, String data) {
        super(id, data);
    }

    @Override
    public List<Identifier> getAdvancements() {
        return ADVANCEMENTS;
    }

    @Override
    public String getGoalName() {
        return "Remove Wolf Armor from a Wolf Using Shears";
    }

    @Override
    public ItemStack getTextureItemStack() {
        return ITEM.getDefaultStack();
    }
}
