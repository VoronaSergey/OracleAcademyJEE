package ua.vorona.plant;

import ua.vorona.Material;

public class Cactus extends Plant {

	public Cactus() {
		description = "tall and soft";
		materials.add(Material.ORGANIC);
		heightInSm = 100;
	}
}
