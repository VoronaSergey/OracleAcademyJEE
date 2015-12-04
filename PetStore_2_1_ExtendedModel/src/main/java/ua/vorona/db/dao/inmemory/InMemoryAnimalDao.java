package ua.vorona.db.dao.inmemory;

import java.util.ArrayList;
import java.util.List;

import ua.vorona.db.model.animal.Animal;

public class InMemoryAnimalDao implements AnimalDao{
	private final List<Animal> animals = new ArrayList<Animal>();

	public InMemoryAnimalDao() {
		fillAnimals();
	}
    
	public List<Animal> loadAll() {
		return animals;
	}

	public Animal findById(long id) {
		Animal result = null;
		for (Animal item : animals) {
			if (item.getId() == id) {
				result = item;
			}
		}
		return result;
	}

	public Animal create(Animal item) {
		animals.add(item);
		item.setId(animals.size());
		return item;

	}

	public Animal update(Animal item) {
		Animal animal = findById(item.getId());
		if (animal != null) {
			animal.setName(item.getName());
		}
		return animal;
	}

	public boolean delete(Animal item) {
		return animals.remove(item);
	}
	
	private void fillAnimals(){
		Animal a1=new Animal();
		a1.setName("cat");
		create(a1);
		Animal a2=new Animal();
		a2.setName("dog");
		create(a2);
		Animal a3=new Animal();
		a3.setName("horse");
		create(a3);
		Animal a4=new Animal();
		a4.setName("parrot");
		create(a4);
		Animal a5=new Animal();
		a5.setName("snake");
		create(a5);
		Animal a6=new Animal();
		a6.setName("crow");
		create(a6);
	}
}
