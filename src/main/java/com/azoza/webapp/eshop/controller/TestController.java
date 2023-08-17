package com.azoza.webapp.eshop.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/test")
public class TestController {
    @GET
    public Viewable test(){
        return new Viewable("/frontend/test");
    }
}
