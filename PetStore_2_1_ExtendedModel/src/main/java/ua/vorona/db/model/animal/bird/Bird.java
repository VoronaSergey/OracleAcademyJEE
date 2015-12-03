package ua.vorona.db.model.animal.bird;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import ua.vorona.db.model.animal.Animal;

@Entity
public class Bird extends Animal {
	private String featherColor;
	@OneToOne
	private BirdType birdType;
	@OneToOne
	private BirdSpecies birdSpecies;

	public String getFeatherColor() {
		return featherColor;
	}

	public void setFeatherColor(String featherColor) {
		this.featherColor = featherColor;
	}

	public BirdType getBirdType() {
		return birdType;
	}

	public void setBirdType(BirdType birdType) {
		this.birdType = birdType;
	}

	public BirdSpecies getBirdSpecies() {
		return birdSpecies;
	}

	public void setBirdSpecies(BirdSpecies birdSpecies) {
		this.birdSpecies = birdSpecies;
	}

}
