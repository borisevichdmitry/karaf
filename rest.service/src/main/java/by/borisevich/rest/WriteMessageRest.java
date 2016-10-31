package by.borisevich.rest;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by dima on 10/28/16.
 */
@Path("/message")
public interface WriteMessageRest {

    @POST
    @Path("/")
    Response handlePost(@QueryParam("text") String input);

    @GET
    @Path("/{id}")
    Response handleGet(@PathParam(value = "id") String id);
}
