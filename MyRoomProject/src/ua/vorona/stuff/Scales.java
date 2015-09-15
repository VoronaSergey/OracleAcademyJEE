package ua.vorona.stuff;

import ua.vorona.Material;
import ua.vorona.RoomElement;

public class Scales extends RoomElement {
	public int maxWeightInKg;
	
	public Scales(){
		description = "handy for weight conrol";
		materials.add(Material.PLASTIC);
		materials.add(Material.GLASS);
		materials.add(Material.METAL);
		maxWeightInKg = 150;
	}
}
