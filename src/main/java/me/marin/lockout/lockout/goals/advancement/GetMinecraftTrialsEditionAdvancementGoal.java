package me.marin.lockout.lockout.goals.advancement;

import me.marin.lockout.lockout.interfaces.AdvancementGoal;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.List;

public class GetMinecraftTrialsEditionAdvancementGoal extends AdvancementGoal {

    private static final Item ITEM = Items.CHISELED_TUFF;
    private static final List<Identifier> ADVANCEMENTS = List.of(Identifier.of("minecraft", "adventure/minecraft_trials_edition"));

    public GetMinecraftTrialsEditionAdvancementGoal(String id, String data) {
        super(id, data);
    }

    @Override
    public String getGoalName() {
        return "Step Foot in a Trial Chamber";
    }

    @Override
    public ItemStack getTextureItemStack() {
        return ITEM.getDefaultStack();
    }

    @Override
    public List<Identifier> getAdvancements() {
        return ADVANCEMENTS;
    }
}
