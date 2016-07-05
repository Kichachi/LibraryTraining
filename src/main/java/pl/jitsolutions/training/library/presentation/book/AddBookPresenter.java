package pl.jitsolutions.training.library.presentation.book;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pl.jitsolutions.training.library.business.book.boundry.BookCreator;

@Named
@RequestScoped
public class AddBookPresenter {

	@Inject
	private BookCreator bookCreator;
	@Inject
	private AddBookModel addBookModel;

	public String save() {
		bookCreator.save(addBookModel.getBook());
		return "books?faces-redirect-true";

	}
}
