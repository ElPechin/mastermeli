import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Integrante iAdd = (id, nombre, apellido, correo) -> {1,"agustin","crosetto","agustin@mercadolibre.com"};
        List<Integrante> lista = new ArrayList<>();
        Iterator<Integrante> it = lista.iterator();
        System.out.println("Elija un criterio de ordenamiento:");
        System.out.println("1.Nombre   2.Apellido   3.Correo");
        Scanner teclado = new Scanner(System.in);
        String criterio = teclado.nextLine();



    }

    public List<Integrante> listaIntegrantes (){
        List<Integrante> ListaGenerada = new ArrayList<>();
        ListaGenerada.add(new Integrante(1, "Agustin", "Crosetto", "agustin@hotmail.com"));
        ListaGenerada.add(new Integrante(3, "Joel", "Nievas", "joel.nievas@mercadolibre.com"));
        ListaGenerada.add(new Integrante(1, "Agustin", "Crosetto", "agustin.crosetto@mercadolibre.com"));
        ListaGenerada.add(new Integrante(2, "Vera", "Cristian", "cristian.vera@mercadolibre.com);"));
        ListaGenerada.add(new Integrante(3, "Joel", "Nievas Arroyo", "joel.nievas@mercadolibre.com"));
        ListaGenerada.add(new Integrante(4, "Federico Santiago", "Torres", "federicosantiago.torres@mercadolibre.com"));
        ListaGenerada.add(new Integrante(5, "Facundo", "Parra", "facundo.parra@mercadolibre.com"));
        ListaGenerada.add(new Integrante(6, "Matias", "Torreblanca", "matias.torreblanca@mercadolibre.com"));
        ListaGenerada.add(new Integrante(7, "Rodrigo", "Vicente", "rodrigo.vicente@mercadolibre.com"));
        ListaGenerada.add(new Integrante(8, "Matias", "Krenz", "matias.krenz@mercadolibre.com"));
        ListaGenerada.add(new Integrante(9, "Guillermo", "Cook", "guillermo.cook@mercadolibre.com"));
        ListaGenerada.add(new Integrante(10, "Guido", "Michelini", "guido.michelini@mercadolibre.com"));
        ListaGenerada.add(new Integrante(11, "Pedro", "Esequiel Tarazi", "pedro.tarazi@mercadolibre.com"));
        ListaGenerada.add(new Integrante(12, "Diego", "Rodrigo Garbiglia", "diego.garbiglia@mercadolibre.com"));
        ListaGenerada.add(new Integrante(13, "Mariana", "Morelli", "mariana.morelli@mercadolibre.com"));
        ListaGenerada.add(new Integrante(14, "Mauricio", "Clerici", "mauricio.clerici@mercadolibre.com"));
        ListaGenerada.add(new Integrante(15, "Marco", "Martinez", "marco.martinezmolina@mercadolibre.com"));
        ListaGenerada.add(new Integrante(16, "Marco", "Martinelli", "marco.martinelli@mercadolibre.com"));
        ListaGenerada.add(new Integrante(17, "Franco", "Nahuel Capurro", "franco.capurro@mercadolibre.com"));
        ListaGenerada.add(new Integrante(18, "Marcos", "Exequiel Lopez", "marcos.lopez@mercadolibre.com"));
        ListaGenerada.add(new Integrante(19, "Matías", "Farías Falkiewicz", "matias.fariasfalkiewicz@mercadolibre.com"));
        ListaGenerada.add(new Integrante(20, "Mauricio", "Parra Casado", "mauricio.parra@mercadolibre.com"));
        ListaGenerada.add(new Integrante(21, "Juan", "Manuel Beresiarte", "juan.beresiarte@mercadolibre.com"));
        ListaGenerada.add(new Integrante(22, "Matias", "Brond", "matias.brond@mercadolibre.com"));
        ListaGenerada.add(new Integrante(23, "César", "Pablo Morichetti", "cesar.morichetti@mercadolibre.com"));
        ListaGenerada.add(new Integrante(24, "Rodrigo", "Guillermo Luna", "rodrigo.luna@mercadolibre.com"));
        ListaGenerada.add(new Integrante(25, "Juan", "Manuel Sardoy", "juan.sardoy@mercadolibre.com"));
        ListaGenerada.add(new Integrante(26, "Valentín", "Reviglio", "valentin.reviglio@mercadolibre.com"));
        ListaGenerada.add(new Integrante(27, "Federico", "Salas", "federico.salas@mercadolibre.com"));
        ListaGenerada.add(new Integrante(28, "Gastón", "Barbero", "rodrigo.barbero@mercadolibre.com"));
        ListaGenerada.add(new Integrante(29, "Gaston Martin", "Jofre", "gaston.jofre@mercadolibre.com"));
        ListaGenerada.add(new Integrante(30, "Federico", "Silva", "federico.fsilva@mercadolibre.com"));
        ListaGenerada.add(new Integrante(31, "Juan", "Ignacio Filardo", "juan.filardo@mercadolibre.com"));
        ListaGenerada.add(new Integrante(32, "Rodrigo", "Andres Crespillo", "rodrigo.crespillo@mercadolibre.com"));
        ListaGenerada.add(new Integrante(33, "Mario", "Ezequiel Ferreyra", "mario.ferreyra@mercadolibre.com"));
        ListaGenerada.add(new Integrante(34, "Julian", "De Angelis", "alanjulian.deangelis@mercadolibre.com"));
        ListaGenerada.add(new Integrante(35, "Leandro", "Etcharren", "leandro.etcharren@mercadolibre.com"));
        ListaGenerada.add(new Integrante(36, "Bustos", "Figueroa María Cecilia", "cecilia.bustosfigueroa@mercadolibre.com"));
        return ListaGenerada;

    }
}
