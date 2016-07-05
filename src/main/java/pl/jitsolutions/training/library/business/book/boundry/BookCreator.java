package pl.jitsolutions.training.library.business.book.boundry;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.jitsolutions.training.library.business.book.entity.Book;

@Stateless
public class BookCreator {
	@PersistenceContext
	private EntityManager entityManager;

	public String save(Book book) {
		entityManager.persist(book);
		return "books?faces-redirect-true";
	}

}
