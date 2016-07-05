package pl.jitsolutions.training.library.business.book.boundry;

import java.util.Calendar;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.jitsolutions.training.library.business.book.entity.Book;
import pl.jitsolutions.training.library.business.book.entity.Language;

@Singleton
@Startup
public class BooksTestDataProvider {

	@PersistenceContext
	private EntityManager entityManager;

	@PostConstruct
	private void init() {
		Book book = new Book();
		book.setTitle("Czarny pryzmat");
		book.setAuthor("Brent Weeks");
		book.setIsbn("12345678");
		Calendar calendar = Calendar.getInstance();
		calendar.set(1998, Calendar.DECEMBER, 12);
		book.setReleaseDate(calendar.getTime());
		book.setBookstand(10);
		book.setShelf(15);
		book.setQuantity(10);
		book.setLanguage(Language.POLAND);
		entityManager.persist(book);
		Book book1 = new Book();
		book1.setTitle("Gra o Tron");
		book1.setAuthor("George RR Martin");
		book1.setIsbn("1232378");
		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(1998, Calendar.DECEMBER, 10);
		book1.setReleaseDate(calendar1.getTime());
		book1.setBookstand(14);
		book1.setShelf(1);
		book1.setQuantity(3);
		book.setLanguage(Language.POLAND);
		Book book2 = new Book();
		book2.setTitle("Gra o Tron");
		book2.setAuthor("George RR Martin");
		book2.setIsbn("1232378");
		calendar1.set(1998, Calendar.JANUARY, 10);
		book2.setReleaseDate(calendar1.getTime());
		book2.setBookstand(12);
		book2.setShelf(4);
		book2.setQuantity(14);
		book.setLanguage(Language.GERMANY);
		entityManager.persist(book1);

	}

}
