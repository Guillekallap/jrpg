import java.sql.*;
import javax.swing.*;

public class Javaconnect {
	Connection conn= null;
	public static Connection ConnecrDb(){
		try{
			Class.forName("org.sqlite.JDBC");// standard de conexion
			Connection conn = DriverManager.getConnection("jdbc:sqlite:bdd.sqlite");
			JOptionPane.showMessageDialog(null, "Conexion Establecida");
			return conn;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null , e);
			return null;
		}
	}
	
}
