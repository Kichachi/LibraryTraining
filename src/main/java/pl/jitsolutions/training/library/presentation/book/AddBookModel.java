package pl.jitsolutions.training.library.presentation.book;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import pl.jitsolutions.training.library.business.book.entity.Book;

@ViewScoped
@Named
public class AddBookModel implements Serializable {
	private Book book = new Book();

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
