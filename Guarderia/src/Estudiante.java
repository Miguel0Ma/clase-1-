public class Estudiante {
    private String nombre;
    private String edad;
    private String genero;
    private String documentoIdentidad;
    private String nombreAcudiente;
    private String numeroAcudiente;

    public String getEdad(){
        return edad;
    }
    public void setEdad(String edad){
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getGenero(){
        return genero;

    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getDocumentoIdentidad(){
        return documentoIdentidad;
    }
    public void setDocumentoIdentidad(String documentoIdentidad){
        this.documentoIdentidad = documentoIdentidad;
    }
    public String getNombreAcudiente(){
        return nombreAcudiente;
    }
    public void setNombreAcudiente(String nombreAcudiente){
        this.nombreAcudiente = nombreAcudiente;
    }
    public String getNumeroAcudiente(){
        return numeroAcudiente;
    }
    public void setNumeroAcudiente(String numeroAcudiente){
        this.numeroAcudiente = numeroAcudiente;
    }
    public Estudiante(String nombre, String edad, String genero, String documentoIdentidad, String nombreAcudiente,
                      String numeroAcudiente){
        this.nombre = nombre;
        this.edad = edad;
        this.genero= genero;
        this.documentoIdentidad = documentoIdentidad;
        this.nombreAcudiente= nombreAcudiente;
        this.numeroAcudiente= numeroAcudiente;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", genero='" + genero + '\'' +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                ", nombreAcudiente='" + nombreAcudiente + '\'' +
                ", numeroAcudiente='" + numeroAcudiente + '\'' +
                '}';
    }
}
