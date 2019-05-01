import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import static spark.Spark.*;

public class SparkRestEjemplo {

    public static void main(String[] args) {

        final IntegranteService integranteServiceMap = new IntegranteServiceMapImpl();

        //Agregar un integrante
        post("/integrante", ((request, response) -> {
            //...
            response.type("application/json");
            Integrante integrante = new Gson().fromJson(request.body(), Integrante.class);
            integranteServiceMap.addIntegrante(integrante);
            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS));
        }));

        //Obtener la lista de integrantes
        get("/integrante",(request, response) -> {
            response.type("application/json");
            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, new Gson().toJsonTree(integranteServiceMap.getIntegrantes())));
        });

        //Obtener un solo integrante
        get("/integrante/:id", (request, response) -> {
            response.type("application/json");
            if(integranteServiceMap.existIntegrante(request.params("id"))) {
                return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, new Gson().toJsonTree(integranteServiceMap.getIntegrante(request.params(":id")))));
            }
            else{
                return new Gson().toJson(new StandardResponse(StatusResponse.ERROR, "Error, el id no existe." +
                        request.params(":id")));
            }
        });

        //Editar un integrante
        put("/integrante", (request, response) -> {
            response.type("application/json");
            try {
                Integrante integrante = new Gson().fromJson(request.body(), Integrante.class);
                Integrante integranteEditado = integranteServiceMap.editIntegrante(integrante);
                if (integranteEditado != null) {
                    return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, new Gson().toJsonTree(integranteEditado)));
                } else {
                    return new Gson().toJson(new StandardResponse(StatusResponse.ERROR, "Error al editar el integrante" +
                            request.params(":id")));
                }
            } catch (IntegranteException e) {
                throw new IntegranteException("No se puede modificar.");
            }
        });

        //Eliminar un integrante
        delete("/integrante/:id", (request, response) -> {
            integranteServiceMap.deleteIntegrante(request.params(":id"));
            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, "Integrante con id " + request.params(":id") + " Borrado"));
        });

        //Si existe determiando id
        options("/integrante/:id", (request, response) -> {
            response.type("application/json");
            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, new Gson().toJsonTree(integranteServiceMap.existIntegrante(request.params(":id"))
            ? "El integrante existe." : "El integrante no existe.")));

        });

    }


}
