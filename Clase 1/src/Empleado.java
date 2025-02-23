import java.util.Date;

public class Empleado {

    private String nombre;
    private String identificacion;
    private String correo;
    private String fechaContratacion;
    private String telefono;
    private String puesto;

    public String getIdentificacion(){
        return identificacion;
    }
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }
    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Empleado(String nombre, String identificacion, String correo
            , Date fechaContratacion, String
            telefono, String puesto) {
        this.nombre = nombre;
        this.identificacion=identificacion;
        this.correo=correo;
        this.telefono=telefono;
        this.puesto=puesto;
        this.fechaContratacion=fechaContratacion;



    }
}
