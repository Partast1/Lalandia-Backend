package com.example.Lalandia_Backend.models;

public class ActivityPlace {

    private String placeName;
    private int actualGuests;
    private int MaximumGuests;

    //Getters
    public String getPlaceName() {
        return placeName;
    }
    public int getActualGuests() {
        return actualGuests;
    }
    public int getMaximumGuests() {
        return MaximumGuests;
    }

    //Setters
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
    public void setActualGuests(int actualGuests) {
        this.actualGuests = actualGuests;
    }
    public void setMaximumGuests(int maximumGuests) {
        MaximumGuests = maximumGuests;
    }

    public ActivityPlace(String placeName, int actualGuests, int maximumGuests) {
        this.placeName = placeName;
        this.actualGuests = actualGuests;
        MaximumGuests = maximumGuests;
    }



}
