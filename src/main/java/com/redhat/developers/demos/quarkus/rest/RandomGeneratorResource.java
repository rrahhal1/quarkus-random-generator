package com.redhat.developers.demos.quarkus.rest;

import com.redhat.developers.demos.quarkus.service.RandomGeneratorService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



@Path("/random")
public class RandomGeneratorResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        RandomGeneratorService randomGeneratorService = new RandomGeneratorService();
        return Response.ok(randomGeneratorService.createRandomMessage()).build();
    }
}