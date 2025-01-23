package com.redhat.developers.demos.quarkus.rest;

import com.redhat.developers.demos.quarkus.service.RandomGeneratorService;

//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/random")
public class RandomGeneratorResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        RandomGeneratorService randomGeneratorService = new RandomGeneratorService();
        return Response.ok(randomGeneratorService.createRandomMessage()).build();
    }
}