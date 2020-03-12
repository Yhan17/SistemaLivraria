package br.unitins.books.model;

public enum TipoUsuario {
	ADMINISTRADOR(1, "Administrador"),FUNCIONARIO(2, "Funcionario"),CLIENTE(3, "Cliente");
	private int id;
	private String label;
	
	 private TipoUsuario (int id, String label) {
		this.id = id;
		this.label = label;
	}

	public int getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}
	 
	 
}
