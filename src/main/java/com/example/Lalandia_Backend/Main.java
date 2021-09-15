package com.example.Lalandia_Backend;

import com.example.Lalandia_Backend.handlers.DBHandlerTest;

public class Main {
    public static void main(String[] args){
        DBHandlerTest handler = new DBHandlerTest();

        handler.GetActivityPlaces();
    }
}
