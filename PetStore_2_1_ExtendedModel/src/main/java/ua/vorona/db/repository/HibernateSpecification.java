package ua.vorona.db.repository;

import org.hibernate.criterion.Criterion;

public interface HibernateSpecification extends BaseSpecification {

	Criterion toCriteria();
}
