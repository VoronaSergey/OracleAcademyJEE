package ua.vorona.furniture;

import ua.vorona.Material;

public class Couch extends Furniture {

	public Couch() {
		description = "very cousy and soft";
		materials.add(Material.WOOD);
		materials.add(Material.TEXTILE);
		widthInSm = 120;
		lengthInSm = 250;
		heightInSm = 80;
	}
}
