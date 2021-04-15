package com.tts;

import java.util.HashMap;

public class CarDealer {
    public static void carstuff(String thecar) {
        HashMap<String, String> carMap = new HashMap<>();

        carMap.put("Camaro", "Chevy");
        carMap.put("Mustang", "Ford");
        carMap.put("F40", "Ferrari");

        System.out.println(thecar);
        System.out.println(carMap.get(thecar));


        String some = "sa";
        if (carMap.get(thecar) == null) {
            System.out.println("Sorry we don't have that model");
        } else {
            System.out.println("Oh you're looking for a " + thecar + "? Our " +
                    carMap.get(thecar) + " selection is over here!");
        }
    }
}
