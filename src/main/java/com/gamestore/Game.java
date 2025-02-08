package com.gamestore;

public class Game {
    private String title;
    private double price;

    public Game(String title, double price) {
        this.title = title; // Corrected typo here
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}