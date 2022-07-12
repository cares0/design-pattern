package pattern.behavioral.command.after;

import pattern.behavioral.command.before.Game;
import pattern.behavioral.command.before.Light;

public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        Button lightOnButton = new Button(new LightOnCommand(new Light()));
        lightOnButton.press();

        Button gameStartButton = new Button(new GameStartCommand(new Game()));
        gameStartButton.press();
    }
}
