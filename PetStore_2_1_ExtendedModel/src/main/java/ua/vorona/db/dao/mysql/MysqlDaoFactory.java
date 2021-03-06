package ua.vorona.db.dao.mysql;

import ua.vorona.db.dao.AccessoryDao;
import ua.vorona.db.dao.AnimalDao;
import ua.vorona.db.dao.DaoFactory;
import ua.vorona.db.dao.FeedDao;

public class MysqlDaoFactory extends DaoFactory{

	@Override
	public AnimalDao getAnimalDao() {
		return new MysqlAnimalDao();
	}

	@Override
	public FeedDao getFeedDao() {
		return new MysqlFeedDao();
	}

	@Override
	public AccessoryDao getAccessoryDao() {
		return new MysqlAccessoryDao();
	}
}
