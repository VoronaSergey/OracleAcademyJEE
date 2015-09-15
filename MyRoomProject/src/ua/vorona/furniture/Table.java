package ua.vorona.furniture;

import ua.vorona.Material;

public class Table extends Furniture {

	public Table() {
		description = "for computer and papers";
		materials.add(Material.WOOD);
		widthInSm = 120;
		lengthInSm = 80;
		heightInSm = 60;
	}
}
