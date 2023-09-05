
package ejemplomysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Operaciones {
    
    final String  tabla = "datos";
    
    public void guardar(Connection conexion){
        try {
 
        PreparedStatement consulta;
        
        consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + 
                "(CEDULA,NACIONALIDAD,NOMBRE) VALUES(?,?,?)");
        
        consulta.setInt(1, 1234567);
        consulta.setString(2, "BOGOTANO");
        consulta.setString(3, "NESTOR");
        
        
        consulta.executeUpdate();
        
        System.out.println("Escritura exitosa");
        
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
