package ua.vorona.electronics;

import ua.vorona.Material;

public class Laptop extends Electronics {
	public Laptop() {
		description = "fast and powerful";
		materials.add(Material.PLASTIC);
		materials.add(Material.METAL);
		maker = "Lenovo";
	}
}
