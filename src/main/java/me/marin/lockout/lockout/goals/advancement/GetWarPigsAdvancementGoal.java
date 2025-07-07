package me.marin.lockout.lockout.goals.advancement;

import me.marin.lockout.lockout.interfaces.AdvancementGoal;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.List;

public class GetWarPigsAdvancementGoal extends AdvancementGoal {

    private static final Item ITEM = Items.CHEST;
    private static final List<Identifier> ADVANCEMENTS = List.of(Identifier.of("minecraft", "nether/loot_bastion"));

    public GetWarPigsAdvancementGoal(String id, String data) {
        super(id, data);
    }

    @Override
    public List<Identifier> getAdvancements() {
        return ADVANCEMENTS;
    }

    @Override
    public String getGoalName() {
        return "Loot a Chest in a Bastion Remnant";
    }

    @Override
    public ItemStack getTextureItemStack() {
        return ITEM.getDefaultStack();
    }
}
