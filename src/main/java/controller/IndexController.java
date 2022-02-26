package controller;


import model.MehsulModel;
import persistence.service.Mehsulxidmeti;
import persistence.service.MehsulxidmetiImp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/index")
public class IndexController {

    @Path("/hello")
    @GET
    public void sayHello(){
        System.out.println("Hello World!!!");
    }


    private Mehsulxidmeti mehsulXidmeti = new MehsulxidmetiImp();

    @Path("/get")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<MehsulModel> getAllmehsullar() {

        return mehsulXidmeti.getAllmehsullar();
        }


    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void addMehsullar(MehsulModel novu) {

        MehsulModel mehsul = new MehsulModel();

        mehsulXidmeti.addMehsullar(novu);

        }
    @Path("/update")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void updateMehsullar(MehsulModel novu) {

        mehsulXidmeti.updateMehsullar(novu);

        }

    @Path("/{kod}")
    @DELETE
    public void delete (@PathParam("kod") Integer kod){

        mehsulXidmeti.deleteMehsullar(kod);
    }


}

