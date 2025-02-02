package com.redhat.developers.demos.quarkus.rest;

import com.redhat.developers.demos.quarkus.service.RandomGeneratorService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/")//was random
public class RandomGeneratorResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        RandomGeneratorService randomGeneratorService = new RandomGeneratorService();
        return Response.ok(randomGeneratorService.createRandomMessage()).build();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response handleWebhook(String payload) {
        System.out.println("Received Webhook: " + payload);
        return Response.ok().build();  // Rerffnffff 200 OK to GitHub
    }

}