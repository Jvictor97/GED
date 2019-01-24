package Controle;

public class Gestor extends Usuario{

	public Gestor(String cargo, String segmento, String formacao, String cpf, String nome, String senha, int idade) {
		super(cpf, nome, senha, idade);
		this.cargo = cargo;
		this.segmento = segmento;
		this.formacao = formacao;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	private String cargo; // cargo do usuário
	private String segmento; // segmento da empresa 
	private String formacao; // formação acadêmica
}
