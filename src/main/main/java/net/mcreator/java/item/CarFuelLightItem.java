
package net.mcreator.futuristiccars.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CarFuelLightItem extends Item {
	public CarFuelLightItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
