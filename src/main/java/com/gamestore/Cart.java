package com.gamestore;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Game> games;

    public Cart() {
        this.games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void removeGame(Game game) {
        games.remove(game);
    }

    public double calculateTotal() {
        return games.stream().mapToDouble(Game::getPrice).sum();
    }

    public void purchase() {
        games.clear();
    }

    public List<Game> getGames() {
        return new ArrayList<>(games);
    }
}