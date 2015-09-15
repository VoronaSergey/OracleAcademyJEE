package ua.vorona.stuff;

import ua.vorona.Material;
import ua.vorona.RoomElement;

public class Iron extends RoomElement {
	String maker;

	public Iron() {
		description = "reliable and good-working";
		materials.add(Material.METAL);
		materials.add(Material.PLASTIC);
		maker = "Braun";
	}
}
