package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Arbeiter;
import ch.zli.m223.punchclock.service.ArbeiterService;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/arbeiter")
@Tag(name = "Arbeiter", description = "Handling of arbeiter")
public class ArbeiterController {
    @Inject
    ArbeiterService arbeiterService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Arbeiter> list() {
        return arbeiterService.findAll();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Arbeiter add(Arbeiter arbeiter) {
        return arbeiterService.createArbeiter(arbeiter);
    }


}
