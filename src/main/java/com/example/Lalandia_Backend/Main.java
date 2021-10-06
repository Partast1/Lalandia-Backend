package com.example.Lalandia_Backend;


import com.example.Lalandia_Backend.Implementations.ActivityPlaceImpl;
import com.example.Lalandia_Backend.handlers.ChipValidator;
import com.example.Lalandia_Backend.handlers.DBHandlerTest;
import com.example.Lalandia_Backend.handlers.Serializer;
import com.example.Lalandia_Backend.handlers.ServerHandler;
import com.example.Lalandia_Backend.models.Chip;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        ActivityPlaceImpl place = new ActivityPlaceImpl();
        List<String> places = new ArrayList();
        places = place.GetPlaces();
        DBHandlerTest handler = new DBHandlerTest();

        handler.ChangeMaxGuests("Aquadome", 29);
//
//        ActivityPlaceImpl placeImpl = new ActivityPlaceImpl();
//
//        ServerHandler handler = new ServerHandler();
//        List<String> strings = new ArrayList<String>();
//
//        strings = placeImpl.GetActivityPlaces();

//        ActivityPlaceImpl place = new ActivityPlaceImpl();

//        strings = place.GetActivityPlaces();

//        for (String text: strings
//             ) {
//                System.out.println("Hej" + text);
//        }
//
//        String valChip = "2936CE2B";
//        ChipValidator chipValidator = new ChipValidator();
//
//        String verified = chipValidator.ValidateChip(valChip);

//        System.out.println(verified);
//
//        if(verified == true){
//            System.out.println("Ja");
//        }
//        else{
//            System.out.println("Nej");
//        }

//        String valChip = "2936CE2B";
//        DBHandlerTest handler = new DBHandlerTest();
//        Serializer serializer = new Serializer();
//
//        List<Chip> chips = new ArrayList<Chip>();
//        List<String> serializedChips = new ArrayList<String>();
//
//        System.out.println("chip"+valChip);
//        chips = handler.GetChips();
//        serializedChips = serializer.SerializeChips(chips);
//
//        for (String chip : serializedChips
//             ) {
//            if(chip.contains(valChip)){
//                System.out.println("Chip fundet i string chips");
//            }
//            else{
//                System.out.println("Chip ikke fundet");
//            }
//
//        }


    }
}
