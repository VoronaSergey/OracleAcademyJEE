package ua.vorona.db.repository.animal;

import org.hibernate.criterion.Criterion;

import ua.vorona.db.model.animal.Animal;
import ua.vorona.db.repository.HibernateSpecification;
import ua.vorona.db.repository.InMemorySpecification;
import ua.vorona.db.repository.SqlSpecification;

public class AnimalByNameFirstLetterSpecification implements
SqlSpecification, InMemorySpecification<Animal>, HibernateSpecification {

	private char c;

	public AnimalByNameFirstLetterSpecification(char c) {
		this.c = c;
	}

	@Override
	public Criterion toCriteria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean specified(Animal item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toSqlClauses() {
		return " WHERE name LIKE \'" + c + "%\'";
	}

}
