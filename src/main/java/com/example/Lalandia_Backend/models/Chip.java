package com.example.Lalandia_Backend.models;

public class Chip {
    private String rfID;

    public String getRfIF() {
        return rfID;
    }
    public void setRfIF(String rfID) {
        this.rfID = rfID;
    }

    public Chip(String RfID){
        this.rfID = RfID;
    }

    public Chip(){

    }



}
