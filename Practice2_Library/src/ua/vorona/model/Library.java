package ua.vorona.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Library {

	private static Map<Integer, Book> books = new TreeMap<>();

	private static Library instance;

	private Library() {

	}

	public static synchronized final Library getInstance() {
		if (instance == null) {
			instance = new Library();
			fillLibrary();
		}
		return instance;
	}

	public Map<Integer, Book> getAllBooks() {
		return books;
	}

	public Book getBookById(int id) {
		return books.get(id);
	}

	public List<Book> getBooksByAuthor(String author) {
		List<Book> result = new ArrayList<>();
		for (Book book : books.values()) {
			if ((book.getAuthor()).toLowerCase().equals(author.toLowerCase())) {
				result.add(book);
			}
		}
		return result;
	}

	public Set<String> getAuthors() {
		Set<String> result = new TreeSet<String>();
		for (Book book : books.values()) {
			result.add(book.getAuthor());
		}
		return result;
	}

	public TreeMap<String, Book> sortBooks(String key) {
		TreeMap<String, Book> sortedBooks = new TreeMap<>();
		if (key.equals("author")) {
			for (Book book : books.values()) {
				sortedBooks.put(book.getAuthor(), book);
			}
		}
		if (key.equals("name")) {
			for (Book book : books.values()) {
				sortedBooks.put(book.getName(), book);
			}
		}
		return sortedBooks;
	}

	public static synchronized boolean addBook(Book book) {
		books.put(book.getId(), book);
		return true;
	}

	public static synchronized boolean deleteBookById(int id) {
		Book result = books.remove(id);
		return result == null ? false : true;
	}

	private static void fillLibrary() {
		Library.addBook(new Book(1000, "Robinzon Kruzo", "Defo Daniel"));
		Library.addBook(new Book(1001, "Voina i mir", "Tolstoy Lev"));
		Library.addBook(new Book(1002, "Prestuplenie i nakazanie",
				"Dostoevskiy Fedor"));
		Library.addBook(new Book(1003, "Igrok", "Dostoevskiy Fedor"));
		Library.addBook(new Book(1004, "Idiot", "Dostoevskiy Fedor"));
		Library.addBook(new Book(1005, "Bratiya Karamazovi",
				"Dostoevskiy Fedor"));
		Library.addBook(new Book(1006, "Anna Karenina", "Tolstoy Lev"));
		Library.addBook(new Book(1007, "Mertvie dushi", "Gogol Nikolay"));
		Library.addBook(new Book(1008, "Tihiy Don", "Sholohov Mihail"));
		Library.addBook(new Book(1009, "Granatovij braslet", "Kuprin Aleksandr"));
		Library.addBook(new Book(1010, "Revizor", "Gogol Nikolay"));
		Library.addBook(new Book(1011, "Olesja", "Kuprin Aleksandr"));
		Library.addBook(new Book(1012, "Taras Bulba", "Gogol Nikolay"));
		Library.addBook(new Book(1013, "Master i Margarita", "Bulgakov Mihail")); //
		Library.addBook(new Book(1014, "Sobachie serdce", "Bulgakov Mihail"));
		Library.addBook(new Book(1015, "Oblomov", "Goncharov Ivan"));
		Library.addBook(new Book(1016, "Vechera na hutore bliz Dikanki",
				"Gogol Nikolay"));
	}
}
