package com.example.Lalandia_Backend.Implementations;

import com.example.Lalandia_Backend.handlers.DeSerializer;
import com.example.Lalandia_Backend.handlers.ServerHandler;
import com.example.Lalandia_Backend.models.ActivityPlace;

import java.util.ArrayList;
import java.util.List;

public class ActivityPlaceImpl {

    public List<ActivityPlace> locations = new ArrayList<>();
    List<String> sLocations = new ArrayList<>();

//    @Override
    public List<String> GetPlaces() throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        ServerHandler sHandler = new ServerHandler();
        DeSerializer deserializer = new DeSerializer();

        List<ActivityPlace> locations = new ArrayList<>();

        try {
            sLocations = sHandler.GetPlaces();
//            locations = deserializer.DeserializeLocations(sLocations);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sLocations;


    }
}
