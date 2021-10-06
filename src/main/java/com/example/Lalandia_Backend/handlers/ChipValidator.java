package com.example.Lalandia_Backend.handlers;

import com.example.Lalandia_Backend.models.Chip;

import java.util.ArrayList;
import java.util.List;


public class ChipValidator {


    /**
     * Metoden validere RFID fra en chip
     * svaret retuneres ved hjælp af en Boolean
     * @param valChip
     * @return Boolean
     */
    public Boolean ValidateChip(String valChip){



        boolean verified = false;
//
        DBHandlerTest handler = new DBHandlerTest();
        Serializer serializer = new Serializer();

        List<Chip> chips = new ArrayList<Chip>();
        List<String> serializedChips = new ArrayList<String>();


        chips = handler.GetChips();
        serializedChips = serializer.SerializeChips(chips);

        Chip chip = new Chip();
        List<Chip> Chips = new ArrayList<Chip>();

        try {
            for (String schip : serializedChips
            ) {

                if(schip.contains(valChip)){
                    verified = true;
                }

            }
        }
        catch (Exception e){
            e.printStackTrace();

        }
        return verified;
    }
}
