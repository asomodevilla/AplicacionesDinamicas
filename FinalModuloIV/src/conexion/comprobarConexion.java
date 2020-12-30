package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class comprobarConexion {
    public static void main(String[] args) 
	{
		try {
			Connection conn = DriverManager.getConnection
			(
				"jdbc:oracle:thin:@localhost:1521:xe" , 
				"Modulo2", 
				"kloklo"
			);
		 		
            if (conn != null) {
                System.out.println("Conexi�n correcta!");
            } else {
                System.out.println("Fallo en la conexi�n!");
            }
        } catch (SQLException e) {
            System.err.format(
				"SQL State: %s\n%s", 
				e.getSQLState(), 
				e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
		}
	}

}
