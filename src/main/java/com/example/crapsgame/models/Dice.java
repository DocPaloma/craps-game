package com.example.crapsgame.models;

public class Dice {
    int value;

    String IMAGES_PATH = "/com/example/crapsgame/Images/dices/dice";

    public int roll(){
        this.value = (int)(Math.random()*6+1);
        return this.value;
    }

    public
}
