package MVC;

public class StudentDTO {

    private String inst_mail, personal_mail, program, names, last_names, date_b;
    private long cp_number, house_number;
       

    public StudentDTO() {
    }

    public StudentDTO(String correoInstitucional, String correoPersonal, long numeroCelular, long numeroFijo, String programaAcademico, String nombre, String apellido, String fechaNacimiento) {

        this.inst_mail = correoInstitucional;
        this.personal_mail = correoPersonal;
        this.cp_number = numeroCelular;
        this.house_number = numeroFijo;
        this.program = programaAcademico;
        this.names = nombre;
        this.last_names = apellido;
        this.date_b = fechaNacimiento;
    }

    public String getInst_mail() {
        return inst_mail;
    }

    public void setInst_mail(String correoInstitucional) {
        this.inst_mail = correoInstitucional;
    }

    public String getPersonal_mail() {
        return personal_mail;
    }

    public void setPersonal_mail(String correoPersonal) {
        this.personal_mail = correoPersonal;
    }

    public long getCp_number() {
        return cp_number;
    }

    public void setCp_number(long numeroCelular) {
        this.cp_number = numeroCelular;
    }

    public long getHouse_number() {
        return house_number;
    }

    public void setHouse_number(long numeroFijo) {
        this.house_number = numeroFijo;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String programaAcademico) {
        this.program = programaAcademico;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String nombre) {
        this.names = nombre;
    }

    public String getLast_names() {
        return last_names;
    }

    public void setLast_names(String apellido) {
        this.last_names = apellido;
    }

    public String getDate_b() {
        return date_b;
    }

    public void setDate_b(String fechaNacimiento) {
        this.date_b = fechaNacimiento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombres: ").append(names).append("\n");
        sb.append("Apellidos: ").append(last_names).append("\n");
        sb.append("Fecha nacimiento: ").append(date_b).append("\n");
        sb.append("Correo institucional: ").append(inst_mail).append("\n");
        sb.append("Correo personal: ").append(personal_mail).append("\n");
        sb.append("Número de teléfono celular: ").append(cp_number).append("\n");
        sb.append("Número de teléfono fijo: ").append(house_number).append("\n");
        sb.append("Programa académico: ").append(program);
        return sb.toString();
    }

}
