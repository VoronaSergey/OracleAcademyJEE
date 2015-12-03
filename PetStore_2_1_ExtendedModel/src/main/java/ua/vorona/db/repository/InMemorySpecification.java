package ua.vorona.db.repository;


public interface InMemorySpecification<T> extends BaseSpecification {

	boolean specified(T item);
}
