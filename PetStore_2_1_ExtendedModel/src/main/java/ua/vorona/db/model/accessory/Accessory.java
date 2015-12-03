package ua.vorona.db.model.accessory;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import ua.vorona.db.model.Item;

@Entity
public class Accessory extends Item {

	private String accessoryName;
	@OneToOne
	private AccessoryType accessoryType;

	public String getAccessoryName() {
		return accessoryName;
	}

	public void setAccessoryName(String accessoryName) {
		this.accessoryName = accessoryName;
	}

	public AccessoryType getAccessoryType() {
		return accessoryType;
	}

	public void setAccessoryType(AccessoryType accessoryType) {
		this.accessoryType = accessoryType;
	}
}
