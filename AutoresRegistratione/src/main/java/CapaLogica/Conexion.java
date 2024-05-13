package CapaLogica;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;
public class Conexion {
    //crear una variable de tipo conexion
    static Connection conn=null;
    //crear funcion tipo coneccion
    public static Connection conectar(){
        //declarar una variable de tipo url
        //en esta variable se va a cargar la conexion
        String url = "jdbc:sqlserver://localhost\\demondcn\\SQLEXPRESS:1433;databaseName=AutoresDba;TrustServerCertificate=True;";
        //Declarar un manejador de errores
        try{
            //aqui cargara la url del drive de la dba
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch(ClassNotFoundException e){
            //mostrar un mensaje de error
            JOptionPane.showMessageDialog(null,"Error de sql" + e.getMessage());
        }
        try{
            conn=DriverManager.getConnection(url,"sa","1234");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conecion del DriverManager"+ e.getMessage());
        }
        return conn;
    }
}
