package ua.vorona.db.dao;

import ua.vorona.db.model.accessory.Accessory;

public interface AccessoryDao {

	void create(Accessory accessory);

	Accessory read(long id);

	boolean update(Accessory accessory);

	boolean delete(Accessory accessory);
}
