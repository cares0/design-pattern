package pattern.structural.proxy.after_interface;

public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("환영합니다");
    }
}
