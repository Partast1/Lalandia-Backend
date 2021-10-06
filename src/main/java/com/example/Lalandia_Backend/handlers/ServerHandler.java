package com.example.Lalandia_Backend.handlers;

import Services.ActivityPlaceService;

import java.util.ArrayList;
import java.util.List;

/**
 * Klassen her vikrer som classloader fra jar filen dataaccess
 */
public class ServerHandler {
    ActivityPlaceService placeService;
    List<String> serializedPlaces = new ArrayList<String>();

    String path = "Services";
    String className = "ActivityPlaceService";
    public ServerHandler()
    {
        try {
             placeService = (ActivityPlaceService) Class.forName(path + "."+ className).newInstance();

//            serializedPlaces = placeService.GetActivityPlaces();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        placeService = new ActivityPlaceService();

    }

    public  List<String> GetPlaces() throws ClassNotFoundException {




        try {
//           System.out.println(Class.forName("LocationService"));
            serializedPlaces = placeService.GetActivityPlaces();

//            dbHandlerTest dbHandler = new dbHandlerTest();
//            Object object = new Object();

        }catch (Exception e ){e.printStackTrace();}

        return serializedPlaces;

    }
}
