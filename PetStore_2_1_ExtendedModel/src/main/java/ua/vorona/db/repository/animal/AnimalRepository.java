package ua.vorona.db.repository.animal;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ua.vorona.db.model.animal.Animal;
import ua.vorona.db.repository.BaseRepository;
import ua.vorona.db.repository.BaseSpecification;

public class AnimalRepository implements BaseRepository<Animal> {

	private final SessionFactory sessionFactory;

	public AnimalRepository(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Animal> query(BaseSpecification specification) {
		Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        
		return null;
	}
//	public List<Animal> findAll(){
//        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        List<Animal> result = session.createQuery("from Book").list();
//        session.getTransaction().commit();
//        return result;
//    }
	public void create(Animal animal) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(animal);
		session.getTransaction().commit();
	}

	public void update(Animal animal) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(animal);
		session.getTransaction().commit();
	}

	public void delete(Animal animal) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.delete(animal);
		session.getTransaction().commit();
	}
}
