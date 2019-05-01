import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        try {

            String paises = readUrl("https://api.mercadolibre.com/sites");
            //le paso los paises y creo un arreglo de los paises como clase.
            Pais[] listaPaises = new Gson().fromJson(paises, Pais[].class);
            System.out.println("\n");
            for (Pais pais : listaPaises){
                System.out.println(pais.getId() + " - " + pais.getName());
            }
            System.out.println("\n");

            System.out.println("Ingrese el codigo de pais que desea: ");
            Scanner scanner = new Scanner(System.in);
            String codPais = scanner.nextLine();

            String data = readUrl("https://api.mercadolibre.com/sites/" + codPais + "/categories");
            System.out.println("\n");

            //le paso la data, y como una arreglo de Categoria la clase.
            Category[] categories = new Gson().fromJson(data, Category[].class);
            int i = 1;
            List<String> categoriaAMostrar= new ArrayList<String>();
            for(Category category : categories){
                System.out.println(i + " - " + category.getName() + " - " + category.getId());
                i++;
                categoriaAMostrar.add(category.getId());

            }
            System.out.println("\n");
            System.out.println("Escriba la categoria deseada a obtener informacion: ");
            String categoria = scanner.nextLine();
            String infoCategoria = readUrl("https://api.mercadolibre.com/categories/MLA1953" );
            DetalleCategoria[] detalleCategorias = new Gson().fromJson(infoCategoria, DetalleCategoria[].class);
            for(DetalleCategoria detalleCategoria: detalleCategorias){
                System.out.println(detalleCategoria.getId() + detalleCategoria.getName() + detalleCategoria.getPermalink() +
                        detalleCategoria.getTotalItemsCategory() + detalleCategoria.getPicture());
            }

        } catch (IOException e) {
            System.out.println("Ocurrio un error al traer las categorias");
            e.printStackTrace();
        }

    }

    private static String readUrl (String urlString) throws IOException{

        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            URLConnection urlConnection = url.openConnection();
            //se pasa una key, y
            urlConnection.setRequestProperty("Accept", "application/json");
            urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
            //Creo un input stream reader, con lo que me trae urlConnection, pero necesito la codificacion
            // por cuestiones de escritura de la api que recibe, ahroa en Reader poseo un BufferReader.
            reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
            int read=0;
            //Creo un objeto java, streamBuffer, en vez de un bufferreader. para facilitacion de trabajo por ser tipo string
            StringBuffer buffer = new StringBuffer();
            //creo un array de char, de 1024 porq es el estandar de ese arreglo que estoy leyendo
            char[] chars = new char[1024];
            //Leer cuantos caracteres quiero leer de reader
            while( (read = reader.read(chars)) != -1){
                buffer.append(chars, 0, read);
            }
            return buffer.toString();
            //la responsabilidad de corregir la url es del usuario, el cual debe de verificar
            // que envia, entonces, que lo resuelva el usuario
        } /*catch (MalformedURLException e) {
            e.printStackTrace();
        } */
            //le aviso al cliente que no puedo dar de alta la conexion, lo aviso en un throw, IOException
            /*catch (IOException e) {
            e.printStackTrace();
        }*/ finally {
            //cerrar la coneccion abierta de urlConnection
            if(reader != null){
                reader.close();
            }
        }
    }


}
