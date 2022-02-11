package MVC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import MVC.Continual;

public class View {

    static Scanner read = new Scanner(System.in);
    private int option;
    private int queryOption;

    public View() {
    }

    public View(int opcion, int opcionConsulta) {
        this.option = opcion;
    }

    public void menu() {
        System.out.println("INSTITUTO LA FLORESTA");
        System.out.println("Seleccione tarea a realizar:");
        System.out.println("1. Ingresar estudiante");
        System.out.println("2. Consultas");
        System.out.println("3. Modificar estudiante");
        System.out.println("4. Eliminar Estudiante");
        System.out.println("5. Ver directorio de estudiantes");
        System.out.println("6. Salir");
    }

    public void menuInquiries() {
        System.out.println("Consultas");
        System.out.println("Seleccione consulta a realizar:");
        System.out.println("1. Buscar estudiante por correo electrónico");
        System.out.println("2. Buscar estudiante por apellidos");
        System.out.println("3. Bucar por programa");
        System.out.println("4. Buscar cantidad de estudiantes por programa");
        System.out.println("5. Buscar por fecha de nacimiento");
        System.out.println("6. Buscar por número de celular");
    }

    public int enterOption() {
        System.out.println("Opción:");
        int opcion = read.nextInt();
        read.nextLine();
        System.out.println("");

        return opcion;
    }

    public String enterName() {
        System.out.println("Ingresar nombres: ");
        String name = read.nextLine();
        System.out.println("");

        return name;
    }

    public String enterLastName() {
        System.out.println("Ingresar apellidos:");
        String lastName = read.nextLine();
        System.out.println("");

        return lastName;
    }

    public String enterDateB() {
        System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD):");
        String age = read.nextLine();
        System.out.println("");

        return age;
    }

    public String enterInstMail() {
        System.out.println("Ingresar correo institucional:");
        String instMail = read.nextLine();
        System.out.println("");

        return instMail;
    }

    public String enterPersMail() {
        System.out.println("Ingresar correo personal:");
        String enterCpNumber = read.nextLine();
        System.out.println("");

        return enterCpNumber;
    }

    public String searchStudentsMail() {
        System.out.println("Ingresar número de celular:");
        String cPNumber = read.nextLine();
        System.out.println("");

        return cPNumber;
    }

    public String enterHouseNumber() {
        System.out.println("Ingresar número fijo:");
        String houseNumber = read.nextLine();

        return houseNumber;
    }

    public String enterProgram() {
        System.out.println("Ingresar programa:");
        String programa = read.nextLine();

        return programa;
    }

    public void confirmation(boolean estado, String metodo) {
        if (estado) {
            System.out.println(metodo);

        }
    }

    public void confirmation(boolean estado, Object metodo) {
        if (estado) {
            System.out.println(metodo);

        }
    }

    public void searchStudentMail(ResultSet resultado) {
        try {
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("apellido"));
                System.out.println(resultado.getString("fechaNacimiento"));
                System.out.println(resultado.getString("CorreoInstitucional"));
                System.out.println(resultado.getString("CorreoPersonal"));
                System.out.println(resultado.getString("numeroCelular"));
                System.out.println(resultado.getString("numeroFijo"));
                System.out.println(resultado.getString("programaAcademico"));
                System.out.println("");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void searchStudentsMail(String correo) {

        try {
            Linkage conexion = new Linkage();
            ResultSet result = conexion.consultarRegistros(String.format(Continual.BUSCAR_ESTUDIANTE_CORREO, correo));
            int c = 0;
            while (result.next()) {
                if (result.getString("CorreoInstitucional").equals(correo)) {
                    System.out.print(result.getString("nombre"));
                    System.out.println(result.getString("apellido"));
                    System.out.println(result.getString("fechaNacimiento"));
                    System.out.println(result.getString("CorreoInstitucional"));
                    System.out.println(result.getString("CorreoPersonal"));
                    System.out.println(result.getString("numeroCelular"));
                    System.out.println(result.getString("numeroFijo"));
                    System.out.println(result.getString("programaAcademico"));
                    System.out.println("");
                    c += 1;
                } else if (c == 0 && !result.next()) {
                    System.out.println(Continual.NO_REGISTRADO);
                    System.out.println("");

                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void searchStudentLastName(String apellido, ResultSet resultado) {

        try {
            int c = 0;
            while (resultado.next()) {
                if (resultado.getString("apellido").equals(apellido)) {
                    System.out.print(resultado.getString("nombre"));
                    System.out.println(resultado.getString("apellido"));
                    System.out.println(resultado.getString("fechaNacimiento"));
                    System.out.println(resultado.getString("CorreoInstitucional"));
                    System.out.println(resultado.getString("CorreoPersonal"));
                    System.out.println(resultado.getString("numeroCelular"));
                    System.out.println(resultado.getString("numeroFijo"));
                    System.out.println(resultado.getString("programaAcademico"));
                    System.out.println("");
                    c += 1;
                } else if (c == 0 && !resultado.next()) {
                    System.out.println(Continual.CONSULTA_NO_ENCONTRADA);
                    System.out.println("");

                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void searchStudentProgram(String programa, ResultSet resultado) {

        try {
            int c = 0;
            while (resultado.next()) {
                if (resultado.getString("programaAcademico").equals(programa)) {
                    System.out.println(resultado.getString("apellido") + " " + resultado.getString("nombre"));
                    System.out.println("");
                    c += 1;
                } else if (c == 0 && !resultado.next()) {
                    System.out.println(Continual.CONSULTA_NO_ENCONTRADA);
                    System.out.println("");

                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void countStudentsProgram(String programa, ResultSet resultado) {

        try {
            int c = 0;
            while (resultado.next()) {
                if (resultado.getString("programaAcademico").equals(programa)) {
                    c += 1;
                }
            }
            System.out.println(Continual.CUANTOS_ESTUDIANTES + " " + programa + " " + c);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void searchStudentsDateB(String fecha) {

        try {
            Linkage conexion = new Linkage();
            ResultSet resultado = conexion.consultarRegistros(String.format(Continual.BUSCAR_ESTUDIANTE_FECHA, fecha));
            int c = 0;
            while (resultado.next()) {
                if (resultado.getString("fechaNacimiento").equals(fecha)) {
                    System.out.println(resultado.getString("nombre"));
                    System.out.println(resultado.getString("apellido"));
                    System.out.println(resultado.getString("fechaNacimiento"));
                    System.out.println(resultado.getString("CorreoInstitucional"));
                    System.out.println(resultado.getString("CorreoPersonal"));
                    System.out.println(resultado.getString("numeroCelular"));
                    System.out.println(resultado.getString("numeroFijo"));
                    System.out.println(resultado.getString("programaAcademico"));
                    System.out.println("");
                    c += 1;
                } else if (c == 0 && !resultado.next()) {
                    System.out.println(Continual.CONSULTA_NO_ENCONTRADA);
                    System.out.println("");

                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void searchStudentsCpNumber(String programa, ResultSet resultado) {

        try {
            int c = 0;
            while (resultado.next()) {
                if (resultado.getString("numeroCelular").equals(programa)) {
                    System.out.print(resultado.getString("apellido") + " ");
                    System.out.print(resultado.getString("nombre") + " " + resultado.getString("programaAcademico"));
                    System.out.println("");
                    c += 1;
                } else if (c == 0 && !resultado.next()) {
                    System.out.println(Continual.CONSULTA_NO_ENCONTRADA);
                    System.out.println("");

                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void skipLine() {
        System.out.println("");
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getQueryOption() {
        return queryOption;
    }

    public void setQueryOption(int queryOption) {
        this.queryOption = queryOption;
    }

}

 class Continual{
    public static final String INGRESAR_ESTUDIANTE = Utility.obtainProperties("INGRESAR_ESTUDIANTE");
    public static final String SE_AGREGO_EL_ESTUDIANTE = Utility.obtainProperties("SE_AGREGO_EL_ESTUDIANTE");
    public static final String BUSCAR_ESTUDIANTE = Utility.obtainProperties("BUSCAR_ESTUDIANTE");
    public static final String INFORMACION_DEL_ESTUDIANTE = Utility.obtainProperties("INFORMACION_DEL_ESTUDIANTE");
    public static final String MODIFICAR_ESTUDIANTE = Utility.obtainProperties("MODIFICAR_ESTUDIANTE");
    public static final String ELIMINAR_ESTUDIANTE = Utility.obtainProperties("ELIMINAR_ESTUDIANTE");
    public static final String SE_ELIMINO_EL_ESTUDIANTE = Utility.obtainProperties("SE_ELIMINO_EL_ESTUDIANTE");
    public static final String EL_DIRECTORIO_DE_LOS_ESTUDIANTES = Utility.obtainProperties("EL_DIRECTORIO_DE_LOS_ESTUDIANTES");
    public static final String HASTA_PRONTO = Utility.obtainProperties("HASTA_PRONTO");
    public static final String SE_MODIFICO_EL_ESTUDIANTE = Utility.obtainProperties("SE_MODIFICO_EL_ESTUDIANTE");
    public static final String EDAD_MINIMA = "EDAD_MINIMA";
    public static final String FORMATO_FECHA = Utility.obtainProperties("FORMATO_FECHA");
    public static final String URL = Utility.obtainProperties("URL");
    public static final String CONSULTA_NO_ENCONTRADA = Utility.obtainProperties("CONSULTA_NO_ENCONTRADA");
    public static final String BUSCAR_POR_CORREO_INSTITUCIONAL = Utility.obtainProperties("BUSCAR_POR_CORREO_INSTITUCIONAL");
    public static final String NO_REGISTRADO = Utility.obtainProperties("NO_REGISTRADO");
    public static final String BUSCAR_POR_APELLIDO = Utility.obtainProperties("BUSCAR_POR_APELLIDO");
    public static final String BUSCAR_POR_PROGRAMA = Utility.obtainProperties("BUSCAR_POR_PROGRAMA");
    public static final String CONTAR_POR_PROGRAMA = Utility.obtainProperties("CONTAR_POR_PROGRAMA");
    public static final String RESULTADO_CONTAR_POR_PROGRAMA = Utility.obtainProperties("RESULTADO_CONTAR_POR_PROGRAMA");
    public static final String BUSCAR_POR_FECHA = Utility.obtainProperties("BUSCAR_POR_FECHA");
    public static final String BUSCAR_POR_CELULAR = Utility.obtainProperties("BUSCAR_POR_CELULAR");
    public static final String BUSCAR_ESTUDIANTE_CORREO = Utility.obtainProperties("BUSCAR_ESTUDIANTE_CORREO");
    public static final String BUSCAR_ESTUDIANTE_APELLIDOS = Utility.obtainProperties("BUSCAR_ESTUDIANTE_APELLIDOS");
    public static final String BUSCAR_ESTUDIANTE_PROGRAMA = Utility.obtainProperties("BUSCAR_ESTUDIANTE_PROGRAMA");
    public static final String BUSCAR_ESTUDIANTE_FECHA = Utility.obtainProperties("BUSCAR_ESTUDIANTE_FECHA");
    public static final String BUSCAR_ESTUDIANTE_CELULAR = Utility.obtainProperties("BUSCAR_ESTUDIANTE_CELULAR");
    public static final String AGREGAR_ESTUDIANTE = Utility.obtainProperties("AGREGAR_ESTUDIANTE");
    public static final String ACTUALIZAR_ESTUDIANTE = Utility.obtainProperties("ACTUALIZAR_ESTUDIANTE");
    public static final String LISTAR_ESTUDIANTES = Utility.obtainProperties("LISTAR_ESTUDIANTES");
    public static final String CONTAR_ESTUDIANTES = Utility.obtainProperties("CONTAR_ESTUDIANTES");
    public static final String CONTAR_ESTUDIANTES_PROGRAMA = Utility.obtainProperties("CONTAR_ESTUDIANTES_PROGRAMA");
    public static final String CREAR_DB = Utility.obtainProperties("CREAR_DB");
    public static final String CONTIENE = Utility.obtainProperties("CONTIENE");
    public static final String CUANTOS_ESTUDIANTES = Utility.obtainProperties("CUANTOS_ESTUDIANTES");
    public static final String ELIMINAR_ESTUDIANTE_CONSULTA = Utility.obtainProperties("ELIMINAR_ESTUDIANTE_CONSULTA");


}

