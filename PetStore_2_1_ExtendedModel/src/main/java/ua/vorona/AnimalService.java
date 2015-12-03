package ua.vorona;

import java.util.List;

import javax.persistence.Entity;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ua.vorona.db.dao.AnimalDao;
import ua.vorona.db.dao.DaoFactory;
import ua.vorona.db.model.animal.Animal;

@Entity
@Path("/animals")
public class AnimalService {

	private static final SessionFactory sessionFactory = new Configuration()
			.configure().buildSessionFactory();

	@GET
	@Produces("application/json")
	public Response getAll() throws Exception {
		// вынести вверх
		DaoFactory.setDaoFactoryFCN("ua.vorona.db.dao.mysql.MysqlDaoFactory");
		DaoFactory daoFactory = DaoFactory.getInstance();
		AnimalDao animalDao = daoFactory.getAnimalDao();
		List<Animal> animals = animalDao.loadAll();
		return Response.ok(animals, MediaType.APPLICATION_JSON_TYPE).build();
	}

	// not working METHOD
	// public Response add(@QueryParam("name") String name,
	// @QueryParam("color") String color, @QueryParam("feed") String feed) {
	// StorageSession session = StorageSession.getInstance();
	// System.out.println("I was here!");
	// Animal newAnimal = session.getAnimalDao().create(
	// new Animal(name, color, feed));
	// return Response.ok(newAnimal, MediaType.APPLICATION_JSON_TYPE).build();
	// }

	// clear this!

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response add(Animal animal) throws Exception {
		// DaoFactory.setDaoFactoryFCN("ua.vorona.db.dao.mysql.MysqlDaoFactory");
		// DaoFactory daoFactory = DaoFactory.getInstance();
		// AnimalDao animalDao = daoFactory.getAnimalDao();
		// boolean result = animalDao.create(animal);
		// if (result) {
		// return Response.ok(animal, MediaType.APPLICATION_JSON_TYPE).build();
		// } else {
		// return null;
		// }
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(animal);
		session.getTransaction().commit();
		session.close();
		return Response.ok(animal, MediaType.APPLICATION_JSON_TYPE).build();
	}

	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	public Response update(Animal animal) throws Exception {
		// DaoFactory.setDaoFactoryFCN("ua.vorona.db.dao.mysql.MysqlDaoFactory");
		// DaoFactory daoFactory = DaoFactory.getInstance();
		// AnimalDao animalDao = daoFactory.getAnimalDao();
		// boolean result = animalDao.update(animal);
		// if (result) {
		// return Response.ok(animal, MediaType.APPLICATION_JSON_TYPE).build();
		// } else {
		//		return null;
		// }
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(animal);
		session.getTransaction().commit();
		session.close();
		return Response.ok(animal, MediaType.APPLICATION_JSON_TYPE).build();
	}

	@Path("{id}")
	@DELETE
	@Produces("application/json")
	public Response delete(@PathParam("id") long id) throws Exception {
		DaoFactory.setDaoFactoryFCN("ua.vorona.db.dao.mysql.MysqlDaoFactory");
		DaoFactory daoFactory = DaoFactory.getInstance();
		AnimalDao animalDao = daoFactory.getAnimalDao();
		Animal animalToDelete = animalDao.findById(id);
		boolean result = animalDao.delete(animalToDelete);
		if (result) {
			return Response.ok(animalToDelete, MediaType.APPLICATION_JSON_TYPE)
					.build();
		} else {
			return null;
		}
	}
}
