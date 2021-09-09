package ch.zli.m223.punchclock.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.service.EntryService;


@Path("/entries")
public class EntryController {

    @Inject
    EntryService entryService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Entry> list() {
        return entryService.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Entry getSingleEntry(@org.jboss.resteasy.annotations.jaxrs.PathParam Long id){
        return entryService.getEntryById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Entry add(Entry entry) {
       return entryService.createEntry(entry);
    }

    @DELETE
    @Path("/{id}")
    public void deleteEntry(@PathParam("id") Long id){
        entryService.delete(id);

    }

    @PUT
    public void update(Entry entry){
        entryService.update(entry);
    }

}
