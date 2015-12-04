package ua.vorona.db.dao.inmemory;

import java.util.List;

import ua.vorona.db.model.animal.Animal;

/**
 * ��������� ����������� ������� � ������� animals. ������������ ����� - ������
 * CRUD (create, read, update, delete). ������, ������ ����� ������ ��, �������
 * �����.<br/>
 * ������ ������� - ���� ���������.<br/>
 * ����� ����, ���� ������ ������ ��������� � �����������, �� ������ ����������
 * ������� ����� ���������� (���������� ��������� �� ����� � ��� �� ����������).
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

	Animal create(Animal animal);

	Animal update(Animal animal);

	boolean delete(Animal animal);
}
