package esprit.tn.services;

import esprit.tn.entities.Logement;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("logement")
public class LogementWS {
    public static List<Logement> logements = new ArrayList<Logement>();

    public LogementWS(){
        logements.add(new Logement(1, "Hammmamet", "Nabeul", "A", "B", 12, "C"));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public  List<Logement> get(){
        return logements;
    }

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public void add(Logement L){
        System.out.println(L);
        logements.add(L);
    }
}
