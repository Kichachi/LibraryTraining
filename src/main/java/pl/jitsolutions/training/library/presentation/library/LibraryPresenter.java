package pl.jitsolutions.training.library.presentation.library;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LibraryPresenter {

	public String addBook() {
		return "addBook?faces-redirect-true";
	}

}
