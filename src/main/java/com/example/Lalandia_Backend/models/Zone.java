package com.example.Lalandia_Backend.models;

public class Zone {

    private int zoneNumber;
    private int actualGuests;
    private int MaximumGuests;

    //Getters
    public int getZoneNumber() {
        return zoneNumber;
    }
    public int getActualGuests() {
        return actualGuests;
    }
    public int getMaximumGuests() {
        return MaximumGuests;
    }

    //Setters
    public void setPlaceName(String placeName) {
        this.zoneNumber = zoneNumber;
    }
    public void setActualGuests(int actualGuests) {
        this.actualGuests = actualGuests;
    }
    public void setMaximumGuests(int maximumGuests) {
        MaximumGuests = maximumGuests;

    }

    public Zone(int zoneNumber, int actualGuests, int maximumGuests) {
        this.zoneNumber = zoneNumber;
        this.actualGuests = actualGuests;
        MaximumGuests = maximumGuests;
    }

}
