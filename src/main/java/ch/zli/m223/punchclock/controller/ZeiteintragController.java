package ch.zli.m223.punchclock.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import ch.zli.m223.punchclock.domain.Zeiteintrag;
import ch.zli.m223.punchclock.service.ZeiteintragService;

@Path("/entries")
@Tag(name = "Entries", description = "Handling of entries")
public class ZeiteintragController {

    @Inject
    ZeiteintragService zeiteintragService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Zeiteintrag> list() {
        return zeiteintragService.findAll();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Zeiteintrag add(Zeiteintrag zeiteintrag) {
       return zeiteintragService.createEntry(zeiteintrag);
    }

}
