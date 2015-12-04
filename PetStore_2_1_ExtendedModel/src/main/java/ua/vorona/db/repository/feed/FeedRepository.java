package ua.vorona.db.repository.feed;

import java.util.List;

import org.hibernate.SessionFactory;

import ua.vorona.db.model.feed.Feed;
import ua.vorona.db.repository.BaseRepository;
import ua.vorona.db.repository.BaseSpecification;

public class FeedRepository implements BaseRepository<Feed> {

	private final SessionFactory sessionFactory;

	public FeedRepository(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void create(Feed item) {
		// TODO Auto-generated method stub
	}

	public void delete(Feed item) {
		// TODO Auto-generated method stub
	}

	public void update(Feed item) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Feed> query(BaseSpecification specification) {
		// TODO Auto-generated method stub
		return null;
	}
}
