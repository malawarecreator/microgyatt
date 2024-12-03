package org.bobtutor.controllers;


import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
@Controller("/")
public class HomeController {
    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public String index(String name) {
        if (name.equals("benjamin")) {
            return "{\"name-rank\": \"true alpha male\"}";
        }
        return "{\"name-rank\": \"average beta\"}";
    }
}

