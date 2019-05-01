package main;

public class Alumno {
    private String nombre;
    private String correo;

    public Alumno(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "main.Alumno{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
