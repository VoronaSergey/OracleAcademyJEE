package ua.vorona.stuff;

import ua.vorona.Material;
import ua.vorona.RoomElement;

public class IroningBoard extends RoomElement {
	public int boardLengthInSm;
	public int boardWidthInSm;

	public IroningBoard() {
		description = "very cousy and soft";
		materials.add(Material.WOOD);
		materials.add(Material.TEXTILE);
		materials.add(Material.METAL);
		materials.add(Material.PLASTIC);
		boardLengthInSm = 120;
		boardWidthInSm = 30;
	}
}
