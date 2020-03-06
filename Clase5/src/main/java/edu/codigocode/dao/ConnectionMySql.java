package edu.codigocode.dao;
/***
 * 
 * @author dante.panella
 * @desc esta clase  tendra la conexion a la base de datos
 */

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class ConnectionMySql {

	public Connection getConnection() {
		try {
			// pone en contexto el jar descargado de maven y lo deja para su pronta
			// ejecucion
			Class.forName("com.mysql.jdbc.Driver");

			return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/codigocode", "root", "");

		} catch (Exception e) {
			System.out.println("no se pudo conectar a la base datos");
			return null;

		}
	}

}
