package ua.vorona.furniture;

import ua.vorona.Material;

public class Cupboard extends Furniture {

	public Cupboard() {
		description = "for various stuff";
		materials.add(Material.WOOD);
		materials.add(Material.GLASS);
		widthInSm = 80;
		lengthInSm = 300;
		heightInSm = 210;
	}
}
