package com.example.Lalandia_Backend.handlers;

import com.example.Lalandia_Backend.models.ActivityPlace;
import com.example.Lalandia_Backend.models.Chip;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class Serializer {

    public List<String> SerializeActivities(List<ActivityPlace> activities){
        List<String> serializedActivities = new ArrayList<String>();
        for (ActivityPlace actiPlace: activities) {

            serializedActivities.add(new Gson().toJson(actiPlace));
        }
        return serializedActivities;
    }

    public List<String> SerializeChips(List<Chip> chips){
        List<String> serializedChips = new ArrayList<String>();
        for (Chip chip: chips) {

            serializedChips.add(new Gson().toJson(chip));
        }
        return serializedChips;
    }

}
