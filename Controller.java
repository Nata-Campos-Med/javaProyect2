package MVC;

import java.sql.SQLException;


public class Controller {

    View vista = new View();

    StudentDAO estudianteDAO;

    Linkage conexion = new Linkage(Continual.CREAR_DB);

    public Controller() throws SQLException {
        this.estudianteDAO = new StudentDAO();
        start();
    }

    public void start() throws SQLException {

        vista.menu();
        vista.setOption(vista.enterOption());

        switch (vista.getOption()) {
            case 1:
                StudentDTO estudiante = new StudentDTO();
                vista.confirmation(true, Continual.INGRESAR_ESTUDIANTE);
                estudiante.setNames(vista.enterName());
                estudiante.setLast_names(vista.enterLastName());
                String fechaTemporal = vista.enterDateB();
                
                estudiante.setDate_b(fechaTemporal);
                String correoTemporal = vista.enterInstMail();
                
                estudiante.setInst_mail(correoTemporal);
                correoTemporal = vista.enterPersMail();
               
               
                estudiante.setPersonal_mail(correoTemporal);
                String numeroTemporal = vista.searchStudentsMail();

                estudiante.setCp_number((estudianteDAO.becomeStringLong(numeroTemporal)));
                numeroTemporal = vista.enterHouseNumber();
                
                estudiante.setHouse_number((estudianteDAO.becomeStringLong(numeroTemporal)));
                vista.skipLine();
                estudiante.setProgram(vista.enterProgram());
                vista.skipLine();
                vista.confirmation(estudianteDAO.addStudent(estudiante), Continual.SE_AGREGO_EL_ESTUDIANTE);
                vista.skipLine();
                start();
                break;
            case 2:

                vista.menuInquiries();
                vista.setQueryOption(vista.enterOption());
                switch (vista.getQueryOption()) {
                    case 1:
                        vista.confirmation(true, Continual.BUSCAR_POR_CORREO_INSTITUCIONAL);
                        correoTemporal = vista.enterInstMail();
                       
                        vista.confirmation(true, Continual.INFORMACION_DEL_ESTUDIANTE);
                        vista.searchStudentsMail(correoTemporal);
                        vista.skipLine();
                        start();
                        break;
                    case 2:
                        vista.confirmation(true, Continual.BUSCAR_POR_APELLIDO);
                        String apellidoTemporal = vista.enterLastName();
                        vista.searchStudentLastName(apellidoTemporal, conexion.consultarRegistros());
                        vista.skipLine();
                        start();
                        break;
                    case 3:
                        vista.confirmation(true, Continual.BUSCAR_POR_PROGRAMA);
                        String programaTemporal = vista.enterProgram();
                        vista.searchStudentProgram(programaTemporal, conexion.consultarRegistros());
                        vista.skipLine();
                        start();
                        break;
                    case 4:
                        vista.confirmation(true, Continual.CONTAR_POR_PROGRAMA);
                        programaTemporal = vista.enterProgram();
                        vista.countStudentsProgram(programaTemporal, conexion.consultarRegistros());
                        vista.skipLine();
                        start();
                        break;
                    case 5:
                        vista.confirmation(true, Continual.BUSCAR_POR_FECHA);
                        fechaTemporal = vista.enterDateB();
                        vista.searchStudentsDateB(fechaTemporal);

                        start();
                        break;
                    case 6:
                        vista.confirmation(true, Continual.BUSCAR_POR_CELULAR);
                        numeroTemporal = vista.searchStudentsMail();
                        vista.searchStudentsCpNumber(numeroTemporal, conexion.consultarRegistros());
                        vista.skipLine();
                        start();
                        break;
                }
            case 3:
                vista.confirmation(true, Continual.MODIFICAR_ESTUDIANTE);
                correoTemporal = vista.enterInstMail();
                StudentDTO estudianteModificar = estudianteDAO.returnStudent(conexion.consultarRegistros(), correoTemporal);
                String correoPersonalTemporal = vista.enterPersMail();
               
                estudianteModificar.setPersonal_mail(correoPersonalTemporal);
                String numeroCelularTemporal = vista.searchStudentsMail();

                estudianteModificar.setCp_number((estudianteDAO.becomeStringLong(numeroCelularTemporal)));
                String numeroFijoTemporal = vista.enterHouseNumber();
               
                estudianteModificar.setHouse_number((estudianteDAO.becomeStringLong(numeroFijoTemporal)));
                estudianteModificar.setProgram(vista.enterProgram());
                estudianteDAO.updateStudent(estudianteModificar);
                vista.confirmation(true, Continual.SE_MODIFICO_EL_ESTUDIANTE);
                vista.skipLine();
                start();
                break;
            case 4:
                vista.confirmation(true, Continual.ELIMINAR_ESTUDIANTE);
                vista.confirmation(estudianteDAO.deleteStudent(vista.enterInstMail()), Continual.SE_ELIMINO_EL_ESTUDIANTE);
                vista.skipLine();
                start();
                break;
            case 5:
                vista.confirmation(true, Continual.EL_DIRECTORIO_DE_LOS_ESTUDIANTES);
                vista.skipLine();
                vista.searchStudentMail(conexion.consultarRegistros());
                vista.skipLine();
                start();
                break;
            case 6:
                vista.confirmation(true, Continual.HASTA_PRONTO);
                

        }

    }
}
