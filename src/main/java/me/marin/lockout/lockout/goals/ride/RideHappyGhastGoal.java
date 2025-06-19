package me.marin.lockout.lockout.goals.ride;

import me.marin.lockout.lockout.interfaces.RideEntityGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class RideHappyGhastGoal extends RideEntityGoal {

    private static final ItemStack ITEM_STACK = Items.DRIED_GHAST.getDefaultStack();

    public RideHappyGhastGoal(String id, String data) {
        super(id, data);
    }

    @Override
    public EntityType<?> getEntityType() {
        return EntityType.HAPPY_GHAST;
    }

    @Override
    public String getGoalName() {
        return "Ride a Happy Ghast";
    }

    @Override
    public ItemStack getTextureItemStack() {
        return ITEM_STACK;
    }
}
