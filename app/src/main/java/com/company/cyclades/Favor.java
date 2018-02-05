package com.company.cyclades;

import java.util.Random;

/**
 * Created by Maciej on 04/12/2017.
 */

public class Favor {

    public Favor() {
        favorStr = new String[8];
        favorStr[0] = "Artemida";
        favorStr[1] = "Dionizos";
        favorStr[2] = "Hera (koka, hash)";
        favorStr[3] = "Afrodyta";
        favorStr[4] = "Hermes";
        favorStr[5] = "Demeter";
        favorStr[6] = "Hestia";
        favorStr[7] = "Hefajstos";
    }

    int favorNumber;
    String favorStr[];

    private int randValue(int min, int max) {
        Random r = new Random();
        int value = r.nextInt(max - min + 1) + min;
        return value;
    }

    public String getRandom() {
        int value = randValue(0, 7);
        return favorStr[value];
    }
}
