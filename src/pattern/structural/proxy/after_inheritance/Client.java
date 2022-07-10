package pattern.structural.proxy.after_inheritance;

import pattern.structural.proxy.before.GameService;

public class Client {

    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
