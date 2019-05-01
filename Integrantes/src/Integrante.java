import java.util.ArrayList;
import java.util.List;

public class Integrante {
    private String nombre;
    private int id;
    private String apellido;
    private String correo;

    public Integrante(int id, String nombre,  String apellido, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.apellido = apellido;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
