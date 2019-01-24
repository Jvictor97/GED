/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Valéria
 */
public class ConnectionFactory {
	public Connection getConnection() {
        try {
            return DriverManager.getConnection(
          "jdbc:mysql://johnny.heliohost.org/jvictor9_sklib", "jvictor9_sklib", "sketchlibrary2.0");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

