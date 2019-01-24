package Controle;

public class Estagiario extends Usuario{

	public Estagiario(String segmento, String ciclo, String cpf, String nome, String senha, int idade) {
		super(cpf, nome, senha, idade);
		this.segmento = segmento;
		this.ciclo = ciclo;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
	private String segmento; // segmento da empresa
	private String ciclo; // ciclo do usuário

}