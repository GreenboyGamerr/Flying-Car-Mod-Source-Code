
package net.mcreator.futuristiccars.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CarFuelHeavyItem extends Item {
	public CarFuelHeavyItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
