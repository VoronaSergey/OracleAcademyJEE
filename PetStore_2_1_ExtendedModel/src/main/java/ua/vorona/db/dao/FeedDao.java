package ua.vorona.db.dao;

import java.util.List;

import ua.vorona.db.model.feed.Feed;

public interface FeedDao {

	List<Feed> loadAll();

	Feed findById(long id);

	void create(Feed animal);

	boolean update(Feed feed);

	boolean delete(Feed feed);
}
