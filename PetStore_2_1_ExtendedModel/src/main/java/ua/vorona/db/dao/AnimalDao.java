package ua.vorona.db.dao;

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

	boolean create(Animal animal);

	boolean update(Animal animal);

	boolean delete(Animal animal);
}
