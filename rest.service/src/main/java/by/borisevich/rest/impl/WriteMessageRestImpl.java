package by.borisevich.rest.impl;

import by.borisevich.rest.WriteMessageRest;
import by.borisevich.service.WriteMessageService;

import javax.ws.rs.core.Response;

/**
 * Created by dima on 10/28/16.
 */
public class WriteMessageRestImpl implements WriteMessageRest {

    private WriteMessageService writeMessageService;


    public WriteMessageRestImpl() {
    }

    public Response handlePost(String input) {
        System.out.println("Handle POST");
        try {
            writeMessageService.write(input);
        } catch (Exception e) {
            System.out.println("Catch block");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Problem with database").build();
        }
        return Response.ok().build();
    }

    public Response handleGet(String id) {
        System.out.println("Handle GET");
        return Response.ok().build();
    }

    public WriteMessageService getWriteMessageService() {
        return writeMessageService;
    }

    public void setWriteMessageService(WriteMessageService writeMessageService) {
        this.writeMessageService = writeMessageService;
    }
}
