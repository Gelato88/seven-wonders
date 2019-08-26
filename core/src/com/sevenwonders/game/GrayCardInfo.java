package com.sevenwonders.game;

public class GrayCardInfo {

    private int id;
    private int age;
    private String name;
    private String texture;
    private int textile;
    private int glass;
    private int papyrus;

    GrayCardInfo(int id, int age, String name, String texture, int textile, int glass, int papyrus) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.texture = texture;
        this.textile = textile;
        this.glass = glass;
        this.papyrus = papyrus;

        //printCardInfo();
    }

    //debug
    private void printCardInfo() {
        System.out.println();
        System.out.println("CARD: " + name + ", ID: " + id + ", TEXTURE FILE: " + texture);
        System.out.println("Age: " + age);
        System.out.println("Textile: " + textile + " Glass: " + glass + " Papyrus: " + papyrus);
    }
}
