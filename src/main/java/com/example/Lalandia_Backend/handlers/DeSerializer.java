package com.example.Lalandia_Backend.handlers;

import com.example.Lalandia_Backend.models.ActivityPlace;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class DeSerializer {
    //Deserializing to ActivityPlace
    public List<ActivityPlace> DeserializeActivities(List<String> serializedActivities){
        Gson gson = new Gson();
        List<ActivityPlace> activities = new ArrayList<ActivityPlace>();
        for (String textActivity: serializedActivities) {
            ActivityPlace location = gson.fromJson(textActivity, ActivityPlace.class);
            activities.add(location);
        }
        return activities;

    }
}
