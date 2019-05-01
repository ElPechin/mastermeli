package main;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import java.util.LinkedList;
import java.util.List;

@Path("/service/")
public class MainRest extends Application {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Alumno> getData(){
        List<Alumno> result = new LinkedList<Alumno>();
        result.add(new Alumno("Pablo","pablo@mail.com"));
        result.add(new Alumno("Peter","peter@mail.com"));
        return result;
    }

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    public void save(Alumno alumno){
        System.out.println(alumno.toString()+ "created");
    }
}
