package MVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Linkage {

    
    private Connection connetion;
    
    public Linkage() throws SQLException{
        conectar();
        
    }

    public Linkage(String crearDB) {
        try {
            this.connetion = DriverManager.getConnection(Continual.URL);
            PreparedStatement pstm = this.connetion.prepareStatement(crearDB);
            pstm.execute();
            this.connetion.close();
        } catch (SQLException exception) {
            
        }
    }

    
    
    public void conectar() throws SQLException {
        this.connetion = DriverManager.getConnection(Continual.URL);
    }

    
    
    public void desconectar() {
        try {
            this.connetion.close();
        } catch (SQLException sqlException) {
            System.err.println(sqlException);
        }
    }
   
    
    public int ejecutarSentenciaSQL(String sentencia) throws SQLException {
        PreparedStatement pst = this.connetion.prepareStatement(sentencia);
        return pst.executeUpdate();
    }

    
    public ResultSet consultarRegistros() throws SQLException {
        PreparedStatement pst = this.connetion.prepareStatement(Continual.LISTAR_ESTUDIANTES);
        ResultSet respuesta = pst.executeQuery();
        return respuesta;
    }
    
    public ResultSet consultarRegistros(String sentencia) throws SQLException {
        PreparedStatement pst = this.connetion.prepareStatement(sentencia);
        ResultSet respuesta = pst.executeQuery();
        return respuesta;
    }
}
