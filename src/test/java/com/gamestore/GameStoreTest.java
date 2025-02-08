package com.gamestore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameStoreTest {
    private Store store;
    private Cart cart;
    private Game game1;
    private Game game2;

    @BeforeEach
    public void setUp() {
        store = new Store();
        cart = new Cart();
        game1 = new Game("Game 1", 59.99);
        game2 = new Game("Game 2", 39.99);
        store.addGameToStore(game1);
        store.addGameToStore(game2);
    }

    @Test
    public void testAddGameToCart() {
        cart.addGame(game1);
        assertTrue(cart.getGames().contains(game1));
    }

    @Test
    public void testRemoveGameFromCart() {
        cart.addGame(game1);
        cart.removeGame(game1);
        assertFalse(cart.getGames().contains(game1));
    }

    @Test
    public void testCalculateTotal() {
        cart.addGame(game1);
        cart.addGame(game2);
        assertEquals(99.98, cart.calculateTotal());
    }

    @Test
    public void testPurchaseClearsCart() {
        cart.addGame(game1);
        cart.purchase();
        assertTrue(cart.getGames().isEmpty());
    }
}