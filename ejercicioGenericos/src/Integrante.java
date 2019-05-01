public class Integrante implements Comparable<Integrante> {

    public  enum Criterio{
        NOMBRE, APELLIDO, CORREO
    }

    public static Criterio criterio;
    private String nombre;
    private String apellido;
    private String correo;
    private int id;

    public Integrante(int id, String nombre,  String apellido, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.apellido = apellido;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public int compareTo(Integrante o) {

            switch (criterio){
                case NOMBRE:
                    return this.nombre.compareTo(o.nombre);
                case APELLIDO:
                    return this.apellido.compareTo(o.apellido);
                case CORREO:
                    return this.correo.compareTo(o.correo);

            }
            return 0;

    }

}
