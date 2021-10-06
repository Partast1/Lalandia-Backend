package com.example.Lalandia_Backend;

import com.example.Lalandia_Backend.Implementations.ActivityPlaceImpl;
import com.example.Lalandia_Backend.handlers.DBHandlerTest;
import com.example.Lalandia_Backend.handlers.Serializer;
import com.example.Lalandia_Backend.handlers.ServerHandler;
import com.example.Lalandia_Backend.models.ActivityPlace;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Denne klasse er APIet endpointet for Activities
 */

@Path("/activities")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ActivityResource {
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<String> GetActivities() {
//        DBHandlerTest handler = new DBHandlerTest();
//        Serializer serializer = new Serializer();
//
//        List<ActivityPlace> activities = new ArrayList<ActivityPlace>();
//        activities = handler.GetActivityPlaces();
//        List<String> serializedActivities = new ArrayList<String>();
//        serializedActivities = serializer.SerializeActivities(activities);
//        return serializedActivities;
//}
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<String> GetActivities() {
    DBHandlerTest handler = new DBHandlerTest();
    Serializer serializer = new Serializer();

    List<ActivityPlace> activities = new ArrayList<ActivityPlace>();
    activities = handler.GetActivityPlaces();
    List<String> serializedActivities = new ArrayList<String>();
    serializedActivities = serializer.SerializeActivities(activities);
//    return "Hej";
return serializedActivities;
}

    @Path("/places")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> GetPlaces() throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        ActivityPlaceImpl handler = new ActivityPlaceImpl();
        Serializer serializer = new Serializer();

        List<String> serializedPlaces = new ArrayList<String>();

        serializedPlaces = handler.GetPlaces();


        return serializedPlaces;
    }
    @POST
    @Path("/changemax/{place}/{maxguest}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void ChangeMaxGuests(@PathParam("place") String place,
                                @PathParam("maxguest") int maxGuest){
        DBHandlerTest handler = new DBHandlerTest();

        handler.ChangeMaxGuests(place,maxGuest);

    }
//    public String hello() {
//        List<String> activities = new ArrayList<String>();
////        String textTest  = ;
////        activities.add(textTest);
//        return "Hello, World!";
//    }
}
