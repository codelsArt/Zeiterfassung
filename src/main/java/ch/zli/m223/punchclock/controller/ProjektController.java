package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Projekt;
import ch.zli.m223.punchclock.domain.Projektleiter;
import ch.zli.m223.punchclock.service.ProjektService;
import ch.zli.m223.punchclock.service.ProjektleiterService;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/projekt")
@Tag(name = "Projekt", description = "Handling of projekt")
public class ProjektController {
    @Inject
    ProjektService projektService;
//Alle Projekte ausgeben
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Projekt> list() {
        return projektService.findAll();
    }
//Ein neues Projekt erstellen
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Projekt add(Projekt projekt) {
        return projektService.createProjekt(projekt);
    }


}
