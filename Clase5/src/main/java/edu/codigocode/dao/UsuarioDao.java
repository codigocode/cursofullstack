package edu.codigocode.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import edu.codigocode.modelo.Usuario;

@Component
public class UsuarioDao {

	public boolean guardoUsuario(Usuario user) {

		// interactuar contra la base datos
		try {
			ConnectionMySql conn = new ConnectionMySql(); // nos creamos el objeto que connecta contra la base de datos

			// generamos la conexion
			Connection con = conn.getConnection();

			// statament --> invocacion o llamada --->
			// con.createStatament() --> creamos la peticion o llamada a la base dadtos
			Statement st = (Statement) con.createStatement();

			// st ---> execute , ejecutamos una conslta a base de datos
			return st.execute("insert into usuarios (id,nombre,mail,password) values (" + user.getId() + ",'"
					+ user.getNombre() + "','" + user.getMail() + "','" + user.getPassword() + "' )");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			return true;
		}
	}

	public Usuario obtenoUsuario(int id) {
		try {
			ConnectionMySql conn = new ConnectionMySql();
			Connection cnx = conn.getConnection();
			
			Statement st = (Statement) cnx.createStatement();
			
			String query = "select * from usuarios where id =" + id ;
			
			ResultSet rs =  st.executeQuery(query);
			Usuario u = new Usuario();
			while(rs.next()) {
				u.setId(rs.getInt("id"));
				u.setNombre(rs.getString("nombre"));
				u.setMail(rs.getString("mail"));
				u.setPassword(rs.getString("password"));
				
			}
				return u;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("no se pudo obtener el usuario");
			return null;
		}

	}

	public List<Usuario> todosLosUsuarios() {

		return null;
	}
}
