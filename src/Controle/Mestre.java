
package Controle;

public class Mestre extends Usuario{ 

	public Mestre(String formacao, String curso, String setor, String cpf,
				  String nome, String senha, int idade) {
		super(cpf, nome, senha, idade);
		this.formacao = formacao;
		this.curso = curso;
		this.setor = setor;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	private String formacao;  
	private String curso;
	private String setor;
}
