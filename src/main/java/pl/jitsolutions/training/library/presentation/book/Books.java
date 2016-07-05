package pl.jitsolutions.training.library.presentation.book;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pl.jitsolutions.training.library.business.book.boundry.BooksProvider;
import pl.jitsolutions.training.library.business.book.entity.Book;

@Named
@RequestScoped
public class Books {
	@EJB
	private BooksProvider booksProvider;
	private List<Book> books;

	@PostConstruct
	public void init() {
		books = booksProvider.getBooks();

	}

	public List<Book> getBooks() {
		return books;
	}

}
