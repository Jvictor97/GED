/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

public class Usuario {

	public Usuario(String cpf, String nome, String senha, int idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
		this.idade = idade;
		this.numProjetos = 0;
	}	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumProjetos() {
		return numProjetos;
	}

	public void setNumProjetos(int numProjetos) {
		this.numProjetos = numProjetos;
	}
	
	public void addNum_Projetos(){ // incrementa o numero de projetos em que o 
		numProjetos++;			   // usuário é lider
	}

	public void decrementaNum_Projetos(){ // decrementa o numero de projetos em 
		numProjetos--;					  // que o usuário é lider
	}
	protected String cpf;
	protected String nome;
	protected String senha;
	protected int idade;
	protected int numProjetos;
}
