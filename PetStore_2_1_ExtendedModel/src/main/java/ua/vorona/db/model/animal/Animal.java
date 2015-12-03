package ua.vorona.db.model.animal;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import ua.vorona.db.model.Item;

@Entity
public class Animal extends Item {

	private String sex;
	@OneToOne
	private AnimalType animalType;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public AnimalType getAnimalType() {
		return animalType;
	}

	public void setAnimalType(AnimalType animalType) {
		this.animalType = animalType;
	}
}
