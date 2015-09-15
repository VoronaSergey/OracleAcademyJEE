package ua.vorona.electronics;

import ua.vorona.Material;

public class TVSet extends Electronics {
	public TVSet() {
		description = "time-eater";
		materials.add(Material.PLASTIC);
		materials.add(Material.METAL);
		materials.add(Material.GLASS);
		maker = "Panasonic";
	}
}
