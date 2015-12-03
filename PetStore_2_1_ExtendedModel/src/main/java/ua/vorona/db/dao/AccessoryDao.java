package ua.vorona.db.dao;

import ua.vorona.db.model.accessory.Accessory;

public interface AccessoryDao {

	void create(Accessory tool);

	Accessory read(long id);

	boolean update(Accessory tool);

	boolean delete(Accessory tool);
}
