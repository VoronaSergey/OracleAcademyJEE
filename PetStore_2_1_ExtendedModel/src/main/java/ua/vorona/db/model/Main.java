package ua.vorona.db.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ua.vorona995.accessory.Accessory;
import ua.vorona995.accessory.AccessoryType;
import ua.vorona995.animal.Animal;
import ua.vorona995.animal.AnimalType;
import ua.vorona995.animal.bird.Bird;
import ua.vorona995.animal.bird.BirdSpecies;
import ua.vorona995.animal.bird.BirdType;
import ua.vorona995.feed.Feed;
import ua.vorona995.feed.FeedType;

public class Main {

	public static void main(String[] args) {
		Item i = new Item();
		i.setName("Lion");
		i.setPrice(1000);

		Type t1 = new Type();
		t1.setType("Kiski");

		i.setType(t1);
		Accessory a = new Accessory();
		a.setAccessoryName("sdfsxds");
		AccessoryType at = new AccessoryType();
		at.setName("Scissors");
		a.setAccessoryType(at);
		
		Accessory a2 = new Accessory();
		a2.setAccessoryName("sdfsxds");
		a.setAccessoryType(at);
		
		Feed f1 = new Feed();
		f1.setFeedName("corn");
		FeedType ft=new FeedType();
		ft.setName("seeds");
		f1.setFeedType(ft);
		
		Animal an1 = new Animal();
		an1.setName("elephant");
		AnimalType animalType=new AnimalType();
		animalType.setName("hobbotos");
		an1.setAnimalType(animalType);
		
		BirdSpecies birdSpecies=new BirdSpecies();
		birdSpecies.setName("crows");
		BirdType birdType=new BirdType();
		birdType.setName("black");
		Bird bird=new Bird();
		bird.setFeatherColor("black");
		bird.setBirdSpecies(birdSpecies);
		bird.setBirdType(birdType);
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session1 = sessionFactory.openSession();
		session1.beginTransaction();
		session1.save(i);
		session1.save(t1);
		session1.save(a);
		session1.save(at);
		
		session1.save(f1);
		session1.save(ft);
		
		session1.save(an1);
		session1.save(animalType);
		
		session1.save(bird);
		session1.save(birdType);
		session1.save(birdSpecies);

		session1.getTransaction().commit();
		session1.close();
	}
}
