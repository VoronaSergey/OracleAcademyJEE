package ua.vorona.helper;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.vorona.model.Book;
import ua.vorona.model.Library;

public class ControllerHelper {
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected Library library = Library.getInstance();
	protected Map<String, String[]> reqParameterMap;
	protected OutputStream os;
	protected PrintStream writer;

	public ControllerHelper(HttpServletRequest request,
			HttpServletResponse response) {
		this.request = request;
		this.response = response;
		reqParameterMap = request.getParameterMap();
	}

	private void initPrintStream() throws IOException {
		os = response.getOutputStream();
		writer = new PrintStream(os, true);
	}

	public void doGet() throws IOException {
		initPrintStream();
		if (reqParameterMap.isEmpty()) {
			for (Book book : library.getAllBooks().values()) {
				writer.println(book);
			}
		}
		for (String k : reqParameterMap.keySet()) {
			if (k.equals("id")) {
				Book b = library.getBookById(Integer.parseInt(reqParameterMap
						.get(k)[0]));
				writer.println(b);
			}
			if (k.equals("author")) {
				List<Book> books = library.getBooksByAuthor((reqParameterMap
						.get(k)[0]));
				for (Book b : books) {
					writer.println(b);
				}
			}
			if (k.equals("key")) {
				Set<String> authors = library.getAuthors();
				for (String author : authors) {
					writer.println(author);
				}
			}
		}
	}

	public void doPost() throws IOException {
		System.out.println("doPost()");
		initPrintStream();
		String order = null;
		TreeMap<String, Book> sortedLibrary = null;
		for (String k : reqParameterMap.keySet()) {
			if (k.equals("sort")) {
				sortedLibrary = library.sortBooks(reqParameterMap.get(k)[0]);
			}
			if (k.equals("order")) {
				order = reqParameterMap.get(k)[0];
			}
		}
		if (order != null && order.equals("desc")) {
			for (Book book : sortedLibrary.descendingMap().values()) {
				writer.println(book);
			}
		} else {
			for (Book book : sortedLibrary.values()) {
				writer.println(book);
			}
		}
	}

	public void doPut() throws IOException {
		initPrintStream();
		Book newBook = new Book();
		for (String k : reqParameterMap.keySet()) {
			if (k.equals("id")) {
				newBook.setId(Integer.parseInt(reqParameterMap.get(k)[0]));
			}
			if (k.equals("author")) {
				newBook.setAuthor(reqParameterMap.get(k)[0]);
			}
			if (k.equals("name")) {
				newBook.setName(reqParameterMap.get(k)[0]);
			}
		}
		Library.addBook(newBook);
	}

	public void doDelete() throws IOException {
		initPrintStream();
		for (String k : reqParameterMap.keySet()) {
			if (k.equals("id")) {
				boolean result = Library.deleteBookById(Integer
						.parseInt(reqParameterMap.get(k)[0]));
				writer.println(result);
			}
		}
	}
}
