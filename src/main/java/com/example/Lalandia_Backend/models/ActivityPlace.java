package com.example.Lalandia_Backend.models;

public class ActivityPlace {

    private String placeName;
    private int actualGuests;
    private int maximumGuests;

    //Getters
    public String getPlaceName() {
        return placeName;
    }
    public int getActualGuests() {
        return actualGuests;
    }
    public int getMaximumGuests() {
        return maximumGuests;
    }

    //Setters
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
    public void setActualGuests(int actualGuests) {
        this.actualGuests = actualGuests;
    }
    public void setMaximumGuests(int maximumGuests) {
        this.maximumGuests = maximumGuests;
    }


    public ActivityPlace(String placeName, int actualGuests, int maximumGuests) {
        this.placeName = placeName;
        this.actualGuests = actualGuests;
        this.maximumGuests = maximumGuests;
    }



}
