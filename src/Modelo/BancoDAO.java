/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controle.*;
import Controle.Estagiario;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Modelo.ConnectionFactory;
import java.lang.IllegalArgumentException;
import java.util.concurrent.Callable;

public class BancoDAO implements Callable{
	public BancoDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Aluno aluno){
		String sql = "insert into usuarios" +
				     "(cpf,nome, tipo, senha, idade, numProj, curso, ciclo)" +
					 "values(?,?,?,?,?,?,?,?)";
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1,aluno.getCpf());
			stmt.setString(2, aluno.getNome());
			stmt.setString(3,"Aluno");
			stmt.setString(4, aluno.getSenha());
			stmt.setInt(5, aluno.getIdade());
			stmt.setInt(6, aluno.getNumProjetos());
			stmt.setString(7, aluno.getCurso());
			stmt.setString(8, aluno.getCiclo());
			//executando a gravacao
			stmt.execute();
			JOptionPane.showMessageDialog(null,"Contato inserido no Banco!");
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	public void adiciona(Gestor gestor){
		
	}
	public void adiciona(Estagiario estagiario){
		
	}
	public void adiciona(Mestre mestre){
		
	}	
	
	
	public Usuario call(){
		Aluno aluno = null;
		try{
			String select = "select * from usuarios where cpf=? and senha=?";
			PreparedStatement stmt = connection.prepareStatement(select);
			stmt.setString(1, cpf);
			stmt.setString(2, senha);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			

				JOptionPane.showMessageDialog(null, "Usuario Encontrado!");
			if ((rs.getString("tipo")).equals("Aluno")){
				aluno = new Aluno(
					rs.getString("cpf"),
					rs.getString("curso"),
					rs.getString("ciclo"),
					rs.getString("nome"),
					rs.getString("senha"),
					rs.getInt("idade")				
				);
			}

			rs.close();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		return aluno;
		
	}
	
	public Usuario busca(String cpf, String senha){
		this.cpf = cpf;
		this.senha = senha;
		return call();
	}
	private String cpf;
	private String senha;
	private Connection connection;
}
