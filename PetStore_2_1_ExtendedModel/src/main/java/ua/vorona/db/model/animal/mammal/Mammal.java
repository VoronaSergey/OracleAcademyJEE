package ua.vorona.db.model.animal.mammal;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import ua.vorona.db.model.animal.Animal;

@Entity
public class Mammal extends Animal {
	
	private String appearance;
	private String bodyCovers;
	private String nutrition;
	@OneToOne
	private MammalType mammalType;
	@OneToOne
	private MammalSpecies mammalSpecies;

	public String getAppearance() {
		return appearance;
	}

	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}

	public String getBodyCovers() {
		return bodyCovers;
	}

	public void setBodyCovers(String bodyCovers) {
		this.bodyCovers = bodyCovers;
	}

	public String getNutrition() {
		return nutrition;
	}

	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	public MammalType getMammalType() {
		return mammalType;
	}

	public void setMammalType(MammalType mammalType) {
		this.mammalType = mammalType;
	}

	public MammalSpecies getMammalSpecies() {
		return mammalSpecies;
	}

	public void setMammalSpecies(MammalSpecies mammalSpecies) {
		this.mammalSpecies = mammalSpecies;
	}

}
