package com.example.Lalandia_Backend;

import com.example.Lalandia_Backend.handlers.DBHandlerTest;
import com.example.Lalandia_Backend.handlers.Serializer;
import com.example.Lalandia_Backend.models.ActivityPlace;
import com.example.Lalandia_Backend.models.Chip;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Denne klasse er APIet endpointet for Chips
 */
@Path("/chips")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ChipResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> GetChips() {
//        @DefaultValue("") @QueryParam("rfID") String ID;
        DBHandlerTest handler = new DBHandlerTest();
        Serializer serializer = new Serializer();

        List<Chip> chips = new ArrayList<Chip>();
        List<String> serializedChips = new ArrayList<String>();


        chips = handler.GetChips();
        serializedChips = serializer.SerializeChips(chips);


//        StringBuilder strbul=new StringBuilder();
//        for(String str : serializedChips)
//        {
//            strbul.append(str);
//            //for adding comma between elements
//            strbul.append(",");
//        }
//        //just for removing last comma
//        //strbul.setLength(strbul.length()-1);
//        String str=strbul.toString();

        return serializedChips;
    }
    @GET
    @Path("/{valChip}")
    public String ValidateChip(@PathParam("valChip")String valChip){

        DBHandlerTest handler = new DBHandlerTest();
        Serializer serializer = new Serializer();

        List<Chip> chips = new ArrayList<Chip>();
        List<String> serializedChips = new ArrayList<String>();


        chips = handler.GetChips();
        serializedChips = serializer.SerializeChips(chips);
        Chip chip = new Chip();




                for (String schip : serializedChips
                ) {
                    if(schip.contains(valChip)){
                        chip.setRfIF(valChip);
//                chip.isEmpty()
//                System.out.println("Chip fundet i string chips");
//                return Response.status(200).entity("getUserById is called, id : " + valChip).build();
                    };
                }





//            return Response.status(400).build();



return chip.getRfIF();




    }

}
