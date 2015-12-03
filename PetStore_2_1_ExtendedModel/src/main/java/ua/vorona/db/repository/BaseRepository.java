package ua.vorona.db.repository;

import java.util.List;

public interface BaseRepository<T> {

	// Return void or boolean???
	void create(T item);

	void delete(T item);

	void update(T item);

	List<T> query(BaseSpecification specification);
}
