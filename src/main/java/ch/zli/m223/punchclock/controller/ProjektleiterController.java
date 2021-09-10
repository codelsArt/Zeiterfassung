package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Arbeiter;
import ch.zli.m223.punchclock.domain.Projektleiter;
import ch.zli.m223.punchclock.service.ArbeiterService;
import ch.zli.m223.punchclock.service.ProjektleiterService;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/projektleiter")
@Tag(name = "Projektleiter", description = "Handling of projektleiter")
public class ProjektleiterController {
    @Inject
    ProjektleiterService projektleiterService;
//Alle Projektleiter ausgeben
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Projektleiter> list() {
        return projektleiterService.findAll();
    }
//Ein neuer Projektleiter erstellen
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Projektleiter add(Projektleiter projektleiter) {
        return projektleiterService.createProjektleiter(projektleiter);
    }


}
