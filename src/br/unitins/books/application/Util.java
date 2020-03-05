package br.unitins.books.application;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Util {
	private Util(){
		
	}
	public static void addErrorMessage(String mensagem) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, null));
	}
}
