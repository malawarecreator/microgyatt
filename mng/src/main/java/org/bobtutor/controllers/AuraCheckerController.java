package org.bobtutor.controllers;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/auracheck")
public class AuraCheckerController {
    @Get 
    @Produces(MediaType.APPLICATION_JSON) 
    public String index(int aura) {
        if (aura > 1000) {
            return "{\"rank\": \"true alpha male\"}";
        }
        return "{\"rank\": \"average beta\"}";
    }
}