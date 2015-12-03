package ua.vorona.db.repository.animal;

import org.hibernate.criterion.Criterion;

import ua.vorona.db.model.Item;
import ua.vorona.db.repository.HibernateSpecification;
import ua.vorona.db.repository.InMemorySpecification;
import ua.vorona.db.repository.SqlSpecification;

public class AnimalByIdSpecification <Animal> implements SqlSpecification, InMemorySpecification<Animal>, HibernateSpecification  {

	private int id;

	public AnimalByIdSpecification(int id) {
		this.id = id;
	}

	public String toSqlClauses() {
		return " WHERE id=" + id;
	}

	public Criterion toCriteria() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean specified(Animal animal) {
		return id==((Item) animal).getId();
	}
}