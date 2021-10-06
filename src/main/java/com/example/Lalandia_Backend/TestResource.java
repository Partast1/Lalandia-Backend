package com.example.Lalandia_Backend;

import com.example.Lalandia_Backend.handlers.ChipValidator;
import com.example.Lalandia_Backend.handlers.DBHandlerTest;
import com.example.Lalandia_Backend.handlers.Serializer;
import com.example.Lalandia_Backend.models.Chip;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/test/{valChip}")
public class TestResource {

//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String ValidateChip(@PathParam("valChip")String valChip) {

//        DBHandlerTest handler = new DBHandlerTest();
//        Serializer serializer = new Serializer();
//
//        List<Chip> chips = new ArrayList<Chip>();
//        List<String> serializedChips = new ArrayList<String>();
//
//
//        chips = handler.GetChips();
//        serializedChips = serializer.SerializeChips(chips);
//        String test2 = "he";

//
//        try {
//            for (String sChip : serializedChips
//            ) {
//                if(sChip.contains(valChip)){
//                    test2 = valChip;
////                    System.out.println("Chip fundet i string chips");
////                return Response.status(200).entity("getUserById is called, id : " + valChip).build();
//
//                }
//                else{
//                    test2 ="virker ikke!!!";
////                    return Response.status(400).build();
//                }
//
//            }
//
//
////            if(chip.getRfIF() == valChip){
//////                return Response.status(200).entity("getUserById is called, id : " + valChip).build();
////                return "Fundet";
////            }
////            else{
//////                return Response.status(400).build();
////                return "ikke Fundet";
////
////            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }
//        return test2;

    @GET
    public Response ValidateChip(@PathParam("valChip")String valChip){

        ChipValidator chipValidator = new ChipValidator();

        Boolean verified = chipValidator.ValidateChip(valChip);

        if(verified == true){
            return Response.status(200).build();

        }
        else{
            return Response.status(400).build();
        }


    }
}
