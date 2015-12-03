package ua.vorona.db.dao;

import java.util.List;

import ua.vorona.db.model.animal.Animal;

/**
 * Интерфейс манипуляции данными в таблице animals. Классическая схема - методы
 * CRUD (create, read, update, delete). Однако, иногда пишут только те, которые
 * нужны.<br/>
 * Каждой таблице - свой интерфейс.<br/>
 * Кроме того, если данные методы участвуют в транзакциях, то первым параметром
 * методов пишут соединение (транзакции реализуют на одном и том же соединении).
 * 
 * <pre>
 * void create(Connection con, Animal animal);
 * </pre
 * 
 * @author Vorona Sergey
 * 
 */
public interface AnimalDao {

	List<Animal> loadAll();

	Animal findById(long id);

	boolean create(Animal animal);

	boolean update(Animal animal);

	boolean delete(Animal animal);
}
