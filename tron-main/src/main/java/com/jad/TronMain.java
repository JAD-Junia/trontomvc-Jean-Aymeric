package com.jad;

import com.jad.tron.*;

public enum TronMain {
    ;

    static final int GRID_HEIGHT = 150;
    static final int GRID_WIDTH = 600;
    static final int AI_PLAYER_COUNT = 1000;

    public static void main(String[] args) {
        IGrid grid = new Grid(TronMain.GRID_HEIGHT, TronMain.GRID_WIDTH);
        IRenderer display = new Renderer();
        ITronGame game = new TronGame(grid, display);

        for (int i = 0; i < TronMain.AI_PLAYER_COUNT; i++) {
            IPlayer player = new AIPlayer();
            game.addPlayer(player);
        }
        game.start();
    }
}