package ua.vorona.lighting;

import ua.vorona.Material;

public class TableLamp extends Lighting {
	public TableLamp() {
		description = "for work on computer";
		materials.add(Material.PLASTIC);
		lightbulbNumber = 1;
	}
}
