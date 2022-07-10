package pattern.structural.proxy.after_inheritance;

import pattern.structural.proxy.before.GameService;

public class GameServiceProxy extends GameService {

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println("time = " + (System.currentTimeMillis() - before));
    }
}
