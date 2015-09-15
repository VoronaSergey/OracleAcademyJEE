package ua.vorona.electronics;

import ua.vorona.Material;

public class WiFiRouter extends Electronics {
	public WiFiRouter() {
		description = "gate to the Internet";
		materials.add(Material.PLASTIC);
		materials.add(Material.METAL);
		maker = "TP-LINK";
	}
}
