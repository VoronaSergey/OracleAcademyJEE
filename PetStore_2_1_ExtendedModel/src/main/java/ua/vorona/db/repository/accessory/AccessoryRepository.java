package ua.vorona.db.repository.accessory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ua.vorona.db.model.accessory.Accessory;
import ua.vorona.db.repository.BaseRepository;
import ua.vorona.db.repository.BaseSpecification;

public class AccessoryRepository implements BaseRepository<Accessory> {

	private final SessionFactory sessionFactory;

	public AccessoryRepository(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void create(Accessory item) {
		Session session = sessionFactory.getCurrentSession();
	}

	public void delete(Accessory item) {
		// TODO Auto-generated method stub
	}

	public void update(Accessory item) {
		// TODO Auto-generated method stub
	}

	public List<Accessory> query(BaseSpecification specification) {
		// TODO Auto-generated method stub
		return null;
	}
}
	