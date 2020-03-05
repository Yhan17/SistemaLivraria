package br.unitins.books.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.books.model.Usuario;

@Named("usuarioController")
@ViewScoped
public class UsuarioController implements Serializable {

	private static final long serialVersionUID = -563227102506849534L;

	private Usuario usuario;
	private List<Usuario> listaUsuario ;


	public void incluir() {
		listaUsuario.add(getUsuario());
		limpar();
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
