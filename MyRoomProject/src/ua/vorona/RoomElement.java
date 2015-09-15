package ua.vorona;

import java.util.ArrayList;
import java.util.List;

public abstract class RoomElement {

	public String description;
	public List<Material> materials = new ArrayList<>();

	public String toString() {
		String result = this.getClass().getSimpleName() + " which is "
				+ description + " and consist from ";
		for (Material material : this.materials) {
			result += material + " ";
		}
		return result;
	}
}
