package com.company.cyclades;

import java.util.Random;

/**
 * Created by Maciej on 01/12/2017.
 */

public class RandomGods {

    public RandomGods(int playersNumber) {

        if (playersNumber == 2) {
            godsNumber = 3;
        }
        else {
            godsNumber = playersNumber - 1;
        }

        godsTab = new int[5];
        tabCheck = new int[5];
        godsTabBuffor = new int[5];

        turn = 0;

        for(int i = 0; i < 5; i++) {
            tabCheck[i] = 0;
            godsTab[i] = 0;
            godsTabBuffor[i] = 0;
        }
    }

    public int godsTab[];
    private int turn;
    private int godsNumber;
    private int tabCheck[];
    private int godsTabBuffor[];

    public int getGodsNumber() {
        return godsNumber;
    }

    private int randValue(int min, int max) {
        Random r = new Random();
        int value = r.nextInt(max - min + 1) + min;
        return value;
    }

    public void random() {
        turn++;

        if (turn == 1) {
            firstRandom();
        }
        else {
            switch (godsNumber) {
                case 2:
                    twoGodsRandom();
                    break;
                case 3:
                    threeGodsRandom();
                    break;
                case 4:
                    fourGodsRandom();
                    break;
                case 5:
                    fiveGodsRandom();
                    break;
            }
        }
    }

    private void firstRandom(){
        for (int i = 0; i < godsNumber; i++)
        {
            int number = randValue(0, 4);

            if (tabCheck[number] < 1) {
                godsTab[i] = number;
                tabCheck[number]++;
            }
            else {
                i--;
            }
        }
    }

    private void twoGodsRandom() {
        for (int i = 0; i < 2; i++) {
            godsTabBuffor[i] = godsTab[i];
        }

        for (int i = 0; i<2; i++) {
            int number = randValue(0, 4);
            if (tabCheck[number]<1) {
                godsTab[i] = number;
                tabCheck[number]++;
            }
            else {
                i--;
            }
        }

        for (int i = 0; i < 2; i++) {
            tabCheck[godsTabBuffor[i]] = 0;
        }
    }

    private void threeGodsRandom() {
        for (int i = 0; i < 3; i++) {
            godsTabBuffor[i] = godsTab[i];
        }

        for (int i = 0; i < 2; i++) {
            int number = randValue(0, 4);
            if (tabCheck[number] < 1) {
                godsTab[i] = number;
                tabCheck[number]++;
            }
            else {
                i--;
            }
        }

        for (int i = 0; i < 3; i++) {
            tabCheck[godsTabBuffor[i]] = 0;
        }

        for (int i = 0; i < 1; i++) {
            int number = randValue(0, 4);
            if (tabCheck[number] < 1) {
                godsTab[2] = number;
                tabCheck[number]++;
            }
            else {
                i--;
            }
        }
    }

    private void fourGodsRandom() {
        for (int i = 0; i < 4; i++) {
            godsTabBuffor[i] = godsTab[i];
        }

        for (int i = 0; i < 5; i++) {
            if (tabCheck[i] == 0) {
                godsTab[0] = i;
                tabCheck[i]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            tabCheck[godsTabBuffor[i]] = 0;
        }

        for (int i = 0; i < 3; i++) {
            int number = randValue(0, 4);
            if (tabCheck[number] < 1) {
                godsTab[i + 1] = number;
                tabCheck[number]++;
            }
            else {
                i--;
            }
        }
    }

    private void fiveGodsRandom() {
        for (int i = 0; i < 5; i++) {
            tabCheck[i] = 0;
        }

        for (int i = 0; i<5; i++) {
            int number = randValue(0, 4);
            if (tabCheck[number] < 1) {
                godsTab[i] = number;
                tabCheck[number]++;
            }
            else {
                i--;
            }
        }
    }
}
