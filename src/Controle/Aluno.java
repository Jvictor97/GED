package Controle;

public class Aluno extends Usuario{

	public Aluno(String curso, String ciclo, String cpf, String nome, String senha, int idade) {
		super(cpf, nome, senha, idade);
		this.curso = curso;
		this.ciclo = ciclo;
	}		
	 //metodos set e get 
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
	private String curso;
	private String ciclo;
   
}
