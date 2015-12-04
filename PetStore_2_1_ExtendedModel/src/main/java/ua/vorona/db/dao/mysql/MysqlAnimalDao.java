package ua.vorona.db.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ua.vorona.db.dao.AnimalDao;
import ua.vorona.db.model.animal.Animal;

public class MysqlAnimalDao implements AnimalDao {

	private final String URL;
	private static final String SQL_SELECT_ALL_ANIMALS = "SELECT * FROM animals";
	private static final String SQL_SELECT_ANIMAL_BY_ID = "SELECT * FROM animals WHERE id=?";
	private static final String SQL_CREATE_ANIMAL = "INSERT INTO animals VALUES(DEFAULT, ?, ?, ?)";
	private static final String SQL_UPDATE_ANIMAL = "UPDATE animals SET name=?, color=?, feed=? WHERE id=?";
	private static final String SQL_DELETE_ANIMAL = "DELETE FROM animals WHERE id=?";

	public MysqlAnimalDao() {
		URL = "jdbc:mysql://localhost/zooshop?user=root&password=toor";
	}

	public List<Animal> loadAll() {
		List<Animal> animals = new ArrayList<Animal>();
		Connection con = null;
		try {
			con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SQL_SELECT_ALL_ANIMALS);
			while (rs.next()) {
				animals.add(extractAnimal(rs));
			}
		} catch (SQLException ex) {
			System.out.println("Cannot find all animals");
			ex.printStackTrace();
		} finally {
			close(con);
		}
		return animals;
	}

	public Animal findById(long id) {
		Animal result = new Animal();
		Connection con = null;
		try {
			con = getConnection();

			// create a prepared statement
			PreparedStatement pstmt = con
					.prepareStatement(SQL_SELECT_ANIMAL_BY_ID);

			// adjust a prepared statement
			pstmt.setLong(1, id);

			// execute a query (query updates the users table)
			ResultSet rs = pstmt.executeQuery();

			// obtain user if the user have been found
			if (rs.next()) {
				result = extractAnimal(rs);
			} else {
				System.out.println("Cannot find the user with login: " + id);
			}
		} catch (SQLException ex) {
			System.out
					.println("Error occured while finding the user with login: "
							+ id);
			ex.printStackTrace();
		} finally {
			close(con);
		}
		return result;
	}

	public boolean create(Animal animal) {
		boolean result = false;
		Connection con = null;
		try {
			con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(SQL_CREATE_ANIMAL,
					Statement.RETURN_GENERATED_KEYS);
			int k = 1;
			pstmt.setString(k++, animal.getName());
//			pstmt.setString(k++, animal.getColor());
//			pstmt.setString(k++, animal.getFeed());
			int count = pstmt.executeUpdate();
			if (count > 0) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if (rs.next()) {
					animal.setId(rs.getInt(1));
					result = true;
				}
			}
		} catch (SQLException ex) {
			System.out.println("Cannot insert the animal: " + animal);
			ex.printStackTrace();
		} finally {
			close(con);
		}
		return result;

	}

	public boolean update(Animal animal) {
		boolean result = false;
		Connection con = null;
		try {
			con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(SQL_UPDATE_ANIMAL);
			int k = 1;
			pstmt.setString(k++, animal.getName());
//			pstmt.setString(k++, animal.getColor());
//			pstmt.setString(k++, animal.getFeed());
			pstmt.setLong(k++, animal.getId());
			int count = pstmt.executeUpdate();
			if (count > 0) {
				result = true;
			} else {
				System.out.println("Cannot update the user with Id: "
						+ animal.getId());
			}

		} catch (SQLException ex) {
			System.out.println("Error occured while updating the user with login: "
							+ animal.getId());
			ex.printStackTrace();
		} finally {
			close(con);
		}
		return result;
	}

	public boolean delete(Animal animal) {
		boolean result = false;
		Connection con = null;
		try {
			con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(SQL_DELETE_ANIMAL);
			pstmt.setLong(1, animal.getId());
			int count = pstmt.executeUpdate();
			if (count > 0) {
				System.out.println("User with id " + animal.getId()
						+ " was deleted successfully!");
				result = true;
			}
		} catch (SQLException ex) {
			System.out.println("Cannot delete the user with id "
					+ animal.getId());
			ex.printStackTrace();
		} finally {
			close(con);
		}
		return result;
	}

	private Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = DriverManager.getConnection(URL);
		System.out.println("Connection: " + con);
		return con;
	}

	private void close(Connection con) {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException ex) {
			System.out.println("Cannot close a connection");
			ex.printStackTrace();
		}
	}

	private Animal extractAnimal(ResultSet rs) throws SQLException {
		Animal animal = new Animal();
		animal.setId(rs.getInt("id"));
		animal.setName(rs.getString("name"));
//		user.setColor(rs.getString("color"));
//		user.setFeed(rs.getString("feed"));
		return animal;
	}

	// public static void main(String[] args) throws SQLException {
	// Connection con =
	// DriverManager.getConnection("jdbc:mysql://localhost/zooshop?user=root&password=toor");
	//
	// System.out.println(con);
	// List<Animal> animals = new ArrayList<Animal>();
	// Statement stmt = con.createStatement();
	// ResultSet rs = stmt.executeQuery(SQL_SELECT_ALL_ANIMALS);
	// while (rs.next()) {
	// animals.add(extractAnimal(rs));
	// }
	// for (Animal a:animals){
	// System.out.println(a.getName());
	// }
	// }
	//
}
