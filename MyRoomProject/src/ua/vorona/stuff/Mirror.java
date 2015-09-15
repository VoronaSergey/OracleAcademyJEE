package ua.vorona.stuff;

import ua.vorona.Material;
import ua.vorona.RoomElement;

public class Mirror extends RoomElement {
	public int length;
	public int width;

	public Mirror() {
		description = "stylish and large";
		materials.add(Material.GLASS);
		length = 180;
		width = 75;
	}
}
