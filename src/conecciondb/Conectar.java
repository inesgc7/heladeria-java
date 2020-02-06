package conecciondb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conectar {

    private static final String db = "heladeria";
    private static final String user = "inesgc";
    private static final String password = "secreto";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/" + db + "?useTimezone=true&serverTimezone=GMT%2B8";

    private static Connection conexion;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }

}