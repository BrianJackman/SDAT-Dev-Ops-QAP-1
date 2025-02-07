package com.gamestore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Game> availableGames;

    public Store() {
        this.availableGames = new ArrayList<>();
    }

    public void addGameToStore(Game game) {
        availableGames.add(game);
    }

    public List<Game> browseGames() {
        return new ArrayList<>(availableGames);
    }
}