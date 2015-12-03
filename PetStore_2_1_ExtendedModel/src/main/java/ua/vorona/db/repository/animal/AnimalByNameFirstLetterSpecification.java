package ua.vorona.db.repository.animal;

import ua.vorona.db.repository.BaseSqlSpecification;

public class AnimalByNameFirstLetterSpecification implements
		BaseSqlSpecification {

	private char c;

	public AnimalByNameFirstLetterSpecification(char c) {
		this.c = c;
	}

	public String condition() {
		return " WHERE name LIKE \'" + c + "%\'";
	}

}
