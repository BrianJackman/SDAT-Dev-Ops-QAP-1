package com.gamestore;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();

        Game game1 = new Game("Game 1", 59.99);
        Game game2 = new Game("Game 2", 39.99);

        store.addGameToStore(game1);
        store.addGameToStore(game2);

        System.out.println("Available games:");
        for (Game game : store.browseGames()) {
            System.out.println(game.getTitle() + " - $" + game.getPrice());
        }

        cart.addGame(game1);
        cart.addGame(game2);

        System.out.println("Cart total: $" + cart.calculateTotal());

        cart.purchase();
        System.out.println("Cart after purchase: " + cart.getGames().size() + " games");
    }
}