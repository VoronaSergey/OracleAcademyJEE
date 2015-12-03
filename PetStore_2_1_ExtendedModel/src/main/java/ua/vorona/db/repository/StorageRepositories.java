package ua.vorona.db.repository;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ua.vorona.db.repository.accessory.AccessoryRepository;
import ua.vorona.db.repository.animal.AnimalRepository;
import ua.vorona.db.repository.feed.FeedRepository;

public class StorageRepositories {

	private AnimalRepository animalRepository;
	private FeedRepository feedRepository;
	private AccessoryRepository accessoryRepository;

	public StorageRepositories() {
		SessionFactory sessionFactory;

		try {
			// Create the SessionFactory from hibernate.cfg.xml
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		this.animalRepository = new AnimalRepository(sessionFactory);
		this.feedRepository = new FeedRepository(sessionFactory);
		this.accessoryRepository = new AccessoryRepository(sessionFactory);
	}

	public AnimalRepository getAnimalRepository() {
		return animalRepository;
	}

	public FeedRepository getFeedRepository() {
		return feedRepository;
	}

	public AccessoryRepository getAccessoryRepository() {
		return accessoryRepository;
	}
}
