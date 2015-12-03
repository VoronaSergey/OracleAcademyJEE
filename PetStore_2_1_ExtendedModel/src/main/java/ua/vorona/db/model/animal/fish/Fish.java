package ua.vorona.db.model.animal.fish;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import ua.vorona.db.model.animal.Animal;

@Entity
public class Fish extends Animal{

	private String body;
	private String nutrition;
	@OneToOne
	private FishType fishType;
	@OneToOne
	private FishSpecies fishSpecies;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getNutrition() {
		return nutrition;
	}

	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	public FishType getFishType() {
		return fishType;
	}

	public void setFishType(FishType fishType) {
		this.fishType = fishType;
	}

	public FishSpecies getFishSpecies() {
		return fishSpecies;
	}

	public void setFishSpecies(FishSpecies fishSpecies) {
		this.fishSpecies = fishSpecies;
	}
}
