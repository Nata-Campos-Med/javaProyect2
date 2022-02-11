package MVC;

import java.sql.ResultSet;
import java.sql.SQLException;
import MVC.Linkage;

public class StudentDAO {

    Linkage linkage;
    Continual continual = new Continual();

    public StudentDAO() throws SQLException {
        this.linkage = new Linkage();

    }

    public StudentDTO returnStudent(ResultSet respuesta, String correo) throws SQLException {
        StudentDTO estudiante = new StudentDTO();
        while (respuesta.next()) {
            if (respuesta.getString("correoInstitucional").equals(correo)) {
                estudiante.setNames(respuesta.getString("nombre"));
                estudiante.setLast_names(respuesta.getString("apellido"));
                estudiante.setDate_b(respuesta.getString("fechaNacimiento"));
                estudiante.setInst_mail(respuesta.getString("correoInstitucional"));
                estudiante.setPersonal_mail(respuesta.getString("correoPersonal"));
                estudiante.setCp_number(Long.parseLong(respuesta.getString("numeroCelular")));
                estudiante.setHouse_number(Long.parseLong(respuesta.getString("numeroFijo")));
                estudiante.setProgram(respuesta.getString("programaAcademico"));

            }
        }
        return estudiante;

    }

    public boolean StudentMail(String correo, ResultSet resultado) throws SQLException {

        while (resultado.next()) {
            if (resultado.getString("correoInstitucional").equals(correo)) {
                return true;

            }

        }
        return false;

    }

    public boolean addStudent(StudentDTO estudiante) throws SQLException {
        if (!StudentMail(estudiante.getInst_mail(), linkage.consultarRegistros())) {
            String celular = String.valueOf(estudiante.getCp_number());
            String fijo = String.valueOf(estudiante.getHouse_number());
            String sentencia = String.format(Continual.AGREGAR_ESTUDIANTE, estudiante.getNames(), estudiante.getLast_names(), estudiante.getDate_b(), estudiante.getInst_mail(), estudiante.getPersonal_mail(), celular, fijo, estudiante.getProgram());
            linkage.ejecutarSentenciaSQL(sentencia);
            return true;
        }
        return false;
    }

    public boolean updateStudent(StudentDTO estudiante) throws SQLException {
        String celular = String.valueOf(estudiante.getCp_number());
        String fijo = String.valueOf(estudiante.getHouse_number());
       // System.out.println(estudiante.toString());
        String sentencia = String.format(Continual.ACTUALIZAR_ESTUDIANTE, estudiante.getPersonal_mail(), celular, fijo, estudiante.getProgram(), estudiante.getInst_mail());
        linkage.ejecutarSentenciaSQL(sentencia);

        return true;
    }

    public boolean deleteStudent(String eliminar) throws SQLException {
        if (StudentMail(eliminar, linkage.consultarRegistros())) {
            String sentencia = String.format(Continual.ELIMINAR_ESTUDIANTE_CONSULTA, eliminar);
            linkage.ejecutarSentenciaSQL(sentencia);
            return true;
        } else {
            return false;
        }
    }
    
    public static Long becomeStringLong(String numero) {
        try {
            return Long.valueOf(numero);

        } catch (Exception e) {

            return null;
        }
    }

}
