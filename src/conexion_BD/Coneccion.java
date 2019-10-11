package conexion_BD;
import java.sql.*;

public class Coneccion
{

    public String bd = "scc";
    public String login = "postgres";
    public String password ="equipo5";

    /////los nuevos
    public final String host = "Jdbc:postgresql://192.168.3.2:5432/scc";
    public Connection conexion = null;
	////
    public Statement sentencia;
	public ResultSet resultado;

    public Coneccion()// constructor
    {
       try  // todo bien
        {
           Class.forName("org.postgresql.Driver");//Se registra el Driver jdbc de MySQL
            conexion = DriverManager.getConnection(host+bd,login,password);
        }//fin todo bien
         catch (Exception e) // error de conexion
        {
            System.exit(0);
        }
    }//fin del constructor
 }


