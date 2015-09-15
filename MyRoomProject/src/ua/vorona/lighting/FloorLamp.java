package ua.vorona.lighting;

import ua.vorona.Material;

public class FloorLamp extends Lighting {
	public FloorLamp() {
		description = "for reading before sleeping";
		materials.add(Material.PAPER);
		materials.add(Material.METAL);
		lightbulbNumber = 2;
	}
}
