package com.company;

import Players.*;

public class Main {

    public static void main(String[] args) {

        Boss b = new Boss(1000,80);
        b.defenseType = "";

        Warrior w = new Warrior(500,50);
        w.attackType = "Physical";

        Magic m = new Magic(500, 60);
        m.attackType = "magic";

        Kinetic k = new Kinetic(500,40);
        k.attackType = "mental";





    }
}
