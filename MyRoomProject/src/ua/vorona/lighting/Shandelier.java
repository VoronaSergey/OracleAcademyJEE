package ua.vorona.lighting;

import ua.vorona.Material;

public class Shandelier extends Lighting {
	public Shandelier() {
		description = "very brigh";
		materials.add(Material.GLASS);
		materials.add(Material.METAL);
		materials.add(Material.PLASTIC);
		lightbulbNumber = 5;
	}
}
