package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    // Propiedades
    private static Connection conn = null;
 
    // Constructor
    private conexion(){ 
		String url = 
		"jdbc:oracle:thin:@localhost:1521:xe";
		
		String driver = 
		"oracle.jdbc.driver.OracleDriver";
		
		String usuario = "Modulo2";
		String password = "kloklo";
	  
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection
			(url, usuario, password);
		}
		catch (ClassNotFoundException 
				| SQLException e){
			e.printStackTrace();
		}
	} // Fin constructor

	// Métodos
	public static Connection getConnection(){
		if (conn == null){
			new conexion();
		}
	  
		return conn;
	} // Fin getConnection

	public static Connection conectar() {
Connection con = null;
		
		String driver = 
		"oracle.jdbc.driver.OracleDriver";
		
		String usuario = "Modulo2";
		String password = "kloklo";
		String url 
		= "jdbc:oracle:thin:@localhost:1521:xe";

		try
		{
			Class.forName(driver);

			con = DriverManager.getConnection
			(url,usuario,password);
			
			if(con != null ){
				System.out.println("Conectado");
			}
		}
		catch(ClassNotFoundException 
				| SQLException e)
		{
			System.out.println
			("No se pudo conectar a BD");
			
			e.printStackTrace();
		}
		return con;
	}

}