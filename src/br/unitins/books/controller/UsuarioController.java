package br.unitins.books.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.books.application.Util;
import br.unitins.books.model.Usuario;

@Named("usuarioController")
@ViewScoped
public class UsuarioController implements Serializable {

	private static final long serialVersionUID = -563227102506849534L;

	private Usuario usuario;
	private List<Usuario> listaUsuario ;

	
	private int proximoId() {
		int resultado = 0;
		for (Usuario usuario : listaUsuario) {
			if(usuario.getId() > resultado)
				resultado = usuario.getId();
		}
		/*		
				
				
				
				*/
		return ++resultado;
	}

	public void incluir() {
		//O trim() elimina espaçõs antes e depois da String(java 1.8)
		/*	Solução java 13:
			if(getUsuario().getNome().isBlank())
			*/
		if(getUsuario().getNome().trim().equals("")) {
			Util.addErrorMessage("Preencha as informações");
			
		}else {
		getUsuario().setId(proximoId());
		listaUsuario.add(getUsuario());
		limpar();
		}
	}

	public void limpar() {
		usuario = null;
	}

	public void alterar() {
		//Metodo para obter o indice34
		int index = listaUsuario.indexOf(getUsuario());
		listaUsuario.set(index, getUsuario());
		limpar();
	}

	public void remover() {
		listaUsuario.remove(getUsuario());
		limpar();
	
	}
	public void editar(Usuario usu) {
		setUsuario(usu.getClone());
	}

	public Usuario getUsuario() {
		if (usuario == null)
			usuario = new Usuario();
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListaUsuario() {
		if(listaUsuario == null) {
			listaUsuario = new ArrayList<Usuario>();
		}
		return listaUsuario;
	}
}
