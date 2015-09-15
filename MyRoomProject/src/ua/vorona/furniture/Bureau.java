package ua.vorona.furniture;

import ua.vorona.Material;

public class Bureau extends Furniture {
	public Bureau() {
		description = "for bedclothes";
		materials.add(Material.WOOD);
		widthInSm = 80;
		lengthInSm = 100;
		heightInSm = 60;
	}
}
