package br.unitins.books.model;

import java.time.LocalDate;

public class Usuario extends Entity<Usuario> {

	private String nome;
	private String login;
	private String senha;
	private String email;
	private LocalDate dataNasc;
	private TipoUsuario funcao;

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoUsuario getFuncao() {
		return funcao;
	}

	public void setFuncao(TipoUsuario funcao) {
		this.funcao = funcao;
	}

}
