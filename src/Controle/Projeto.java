package Controle;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Projeto implements Serializable{
	public Projeto(List <Usuario> participantes, Usuario lider, String nome, String descricao){
		// chamados os metodos para atribuir valores
		setParticipantes(participantes); 
		setLider(lider);
		setNome(nome);
		setDescricao(descricao);
	}
	public boolean procuraUsuario(String IdDoParticipante){
		for (Usuario participante: participantes){ // percorre a List de usuarios
			// caso seja encontrado o login do usuario dentre os participantes do projeto
			
			
		//VERIFICAR!!!!!!!!!!!!!	//if(participante.getId == IdDoParticipante))
				return true; // retorna true, o que insere 'projeto' na List 'meusProjetos'
		}
		return false; // caso não encontre, retorna false
	}
	public void setParticipantes(List <Usuario> participantes){ // insere valor em participantes
		this.participantes = participantes;	
	}	
	public void setLider(Usuario lider){ // insere valor em lider
		this.lider = lider;
	}
	public void setNome(String nome){ // insere valor em nome
		this.nome = nome;
	}
	public void setDescricao(String descricao){ // insere valor em descricao
		this.descricao = descricao;
	}
	public List <Usuario> getParticipantes(){ // retorna participantes
		return participantes;
	}
	public Usuario getLider(){ // retorna lider
		return lider;
	}
	public String getNome(){ // retorna nome
		return nome;
	}
	public String getDescricao(){ // retorna descricao
		return descricao;
	}
	// atributos da classe projeto
	private List <Usuario> participantes;
	private Usuario lider;
	private String nome;
	private String descricao;
}