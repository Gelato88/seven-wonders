package com.sevenwonders.game;

public class BrownCardInfo {

    private int id;
    private int age;
    private String name;
    private String texture;
    private int coinCost;
    private int lumber;
    private int ore;
    private int clay;
    private int stone;

    BrownCardInfo(int id, int age, String name, String texture, int coinCost, int lumber, int ore, int clay, int stone) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.texture = texture;
        this.coinCost = coinCost;
        this.lumber = lumber;
        this.ore = ore;
        this.clay = clay;
        this.stone = stone;

        //printCardInfo();
    }

    //debug
    private void printCardInfo() {
        System.out.println();
        System.out.println("CARD: " + name + ", ID: " + id + ", TEXTURE FILE: " + texture);
        System.out.println("Age: " + age + ", Coin cost: " + coinCost);
        System.out.println("Lumber: " + lumber + " Ore: " + ore + " Clay: " + clay + " Stone: " + stone);
    }
}
