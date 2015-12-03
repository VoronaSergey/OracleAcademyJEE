package ua.vorona.db.dao;

/**
 * ����������� ������� ��������� ���������� DAOFactory.<br/>
 * � ������� ������� ������ ����� ����������� ������������ � ����� DB �� ������.<br/>
 * 
 * @author Vorona Sergey
 * 
 */

public abstract class DaoFactory {
	/**
	 * �������� ���� ������, ������� ������ ������ DAOFactory
	 */
	private static DaoFactory instance;

	/**
	 * ����� ��������� ������� DAOFactory. ����� ������ ���������� DAOFactory
	 * ����� ���������� ���������� ��������� �������.
	 * 
	 * @return ��������� ������� DAOFactory, ��� �������� ���������� �
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
	 * ����������� ��� ����������� ����������� ������ �����.<br/>
	 */
	protected DaoFactory() {
		// nothing to do
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	/**
	 * �������� ������ ����������������� ��� ������, ������ �������� �����
	 * ���������� {@link #getInstance()}
	 */
	private static String daoFactoryFCN;

	public static void setDaoFactoryFCN(String daoFactoryFCN) {
		instance = null;
		DaoFactory.daoFactoryFCN = daoFactoryFCN;
	}

	/**
	 * ����� ��������� DAO ��� �������� User.
	 * 
	 * @return ���������� UserDAO, ������� ���������� ��������� �������
	 *         {@link DaoFactory}.
	 */
	public abstract AnimalDao getAnimalDao();

	public abstract FeedDao getFeedDao();

	public abstract ToolDao getToolDao();

}
