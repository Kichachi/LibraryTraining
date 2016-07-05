package pl.jitsolutions.training.library.business.book.boundry;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pl.jitsolutions.training.library.business.book.entity.Book;

@Stateless
public class BooksProvider {
	@PersistenceContext
	private EntityManager entityManager;

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Book> getBooks() {
		TypedQuery<Book> query = entityManager.createNamedQuery(Book.GET_BOOKS, Book.class);
		// query.setParameter("language", Language.POLAND);

		return query.getResultList();
	}
}
