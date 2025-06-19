package me.marin.lockout.lockout.goals.advancement;

import me.marin.lockout.lockout.interfaces.AdvancementGoal;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.List;

public class GetRevaultingAdvancementGoal extends AdvancementGoal {

    private static final ItemStack ITEM_STACK = Items.OMINOUS_TRIAL_KEY.getDefaultStack();
    private static final List<Identifier> ADVANCEMENTS = List.of(Identifier.of("minecraft", "adventure/revaulting"));

    public GetRevaultingAdvancementGoal(String id, String data)
    {
        super(id, data);
    }

    @Override
    public List<Identifier> getAdvancements() {
        return ADVANCEMENTS;
    }

    @Override
    public String getGoalName() {
        return "Use an ominous trial key on an ominous vault";
    }

    @Override
    public ItemStack getTextureItemStack() {
        return ITEM_STACK;
    }
}
