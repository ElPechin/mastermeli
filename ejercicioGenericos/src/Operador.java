import java.util.Collection;
import java.util.List;

public class Operador {


    public static  < T extends Comparable <T>> T minimo (T[] array) throws ArrayIndexOutOfBoundsException{
        if(array.length <= 0){
            throw new ArrayIndexOutOfBoundsException("El array está vacío");
        }
        T minimoIntegrante = array[0];
        for(int i=0; i < array.length; i++){
            if(array[i] == null){
                continue;
            }
            if(array[i].compareTo(minimoIntegrante) <= 0){
                minimoIntegrante = array[i];
            }
        }
        return minimoIntegrante;
    }

    public static < T extends Comparable <T>> T maximo (T[] array) throws ArrayIndexOutOfBoundsException {
        if(array.length <= 0){
            throw new ArrayIndexOutOfBoundsException("El array está vacío");
        }
        T maximoIntegrante = array[0];
        for (int i=0; i < array.length; i++){
            if(array[i] == null){
                continue;
            }
            if(array[i].compareTo(maximoIntegrante) > 0){
                maximoIntegrante = array[i];
            }
        }
        return maximoIntegrante;
    }

    public static < T extends Comparable <T>> int getPosicion (T[] array, T objetoAEncontrar){
        int posicion=0;
        if(array.length <= 0){
            throw new ArrayIndexOutOfBoundsException("El array está vacío");
        }
        for(int i=0; i < array.length; i++){
            if(array[i] == null){
                continue;
            }
            if(objetoAEncontrar == array[i]){
                posicion = i;
            }
        }
        return posicion;
    }

    public static < T extends  Comparable <T>> Collection <T> ordenar (T[] array, Integrante.Criterio criterio){
        List<T> listaOrdenada = (List<T>) array[0];
        for
        return listaOrdenada;
    }
}
