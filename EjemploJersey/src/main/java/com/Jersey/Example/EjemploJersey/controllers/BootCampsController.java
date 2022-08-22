package com.Jersey.Example.EjemploJersey.controllers;

import com.Jersey.Example.EjemploJersey.model.BootCamper;
import com.Jersey.Example.EjemploJersey.service.BotcamperService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootCampsController {
BotcamperService bootcamperService;

public BootCampsController(BotcamperService bootcamerService) {
    this.bootcamperService = bootcamerService;
    this.bootcamperService.addBootCams(new BootCamper("Guido"));
    this.bootcamperService.addBootCams(new BootCamper("Fabian"));
    this.bootcamperService.addBootCams(new BootCamper("Molina"));
    this.bootcamperService.addBootCams(new BootCamper("German"));
    this.bootcamperService.addBootCams(new BootCamper("Beder"));
}
@GET
    @Path("/bootcamper")
    @Produces("application/json")
    public List<BootCamper> getBootCamps() {
    return bootcamperService.getAll();
}
@POST
@Path("/bootcamper")
@Produces("application/json")
@Consumes("application/json")
    public Response addBootCams(BootCamper bootCamper) {
    bootcamperService.addBootCams(bootCamper);
    return Response.created(URI.create("/bootcamper"+bootCamper.getName())).build();
  

}

}

