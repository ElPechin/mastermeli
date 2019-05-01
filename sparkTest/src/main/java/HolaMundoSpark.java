import static spark.Spark.*;

public class HolaMundoSpark {

    public static void main (String args[]) {
        //se debe setear previo al path inicial.
        port(8080);
        //Path, es la direccion a la que se va a acceder
        get("/hola", (req, res) -> "Hola Mundo" );
        get("/hola/:nombre", (req,res) -> {
            return "Hola " + req.params(":nombre");
        });
        get("/direccion/:depto",(request, response) -> {
            return "Jorge Luis Borges 345 " + request.params(":depto");});
    }
}


