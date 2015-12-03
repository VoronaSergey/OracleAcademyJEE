package ua.vorona.db.dao;

/**
 * Абстрактная фабрика получения реализаций DAOFactory.<br/>
 * С помощью данного класса можно осуществить переключение с одной DB на другую.<br/>
 * 
 * @author Vorona Sergey
 * 
 */

public abstract class DaoFactory {
	/**
	 * Закрытое поле класса, которое хранит объект DAOFactory
	 */
	private static DaoFactory instance;

	/**
	 * Метод получения объекта DAOFactory. Какая именно реализация DAOFactory
	 * будет возвращена определяют настройки фабрики.
	 * 
	 * @return экземпляр потомка DAOFactory, имя которого содержится в
	 *         {@link #daoFactoryFCN}
	 */
	public static synchronized DaoFactory getInstance() throws Exception {
		if (instance == null) {
			Class<?> clazz = Class.forName(DaoFactory.daoFactoryFCN);
			instance = (DaoFactory) clazz.newInstance();
		}
		return instance;
	}

	/**
	 * Конструктор для возможности наследовать данный класс.<br/>
	 */
	protected DaoFactory() {
		// nothing to do
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	/**
	 * Содержит полное квалифицированное имя класса, объект которого будет
	 * возвращать {@link #getInstance()}
	 */
	private static String daoFactoryFCN;

	public static void setDaoFactoryFCN(String daoFactoryFCN) {
		instance = null;
		DaoFactory.daoFactoryFCN = daoFactoryFCN;
	}

	/**
	 * Метод получения DAO для сущности User.
	 * 
	 * @return реализация UserDAO, которую определяют настройки фабрики
	 *         {@link DaoFactory}.
	 */
	public abstract AnimalDao getAnimalDao();

	public abstract FeedDao getFeedDao();

	public abstract ToolDao getToolDao();

}
