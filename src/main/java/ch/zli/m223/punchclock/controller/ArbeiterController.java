package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.ViewModel.LoginViewModel;
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

    //Alle Arbeiter werden ausgegeben
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Arbeiter> list() {
        return arbeiterService.findAll();
    }

    //Arbeiter anhand eMail und Passwort finden
    @POST
    @Path("/arbeiter")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Arbeiter Arbeiter(LoginViewModel loginViewModel){
        var arbeiter = arbeiterService.findArbeiter(loginViewModel.getUsername(), loginViewModel.getPassword());
        return arbeiter;
    }

    //Einen neuen Arbeiter erstellen
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Arbeiter add(Arbeiter arbeiter) {
        return arbeiterService.createArbeiter(arbeiter);
    }
}
