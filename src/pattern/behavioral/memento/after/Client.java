package pattern.behavioral.memento.after;

import pattern.behavioral.memento.before.Game;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave save = game.save();
        game.setRedTeamScore(20);
        game.setRedTeamScore(30);

        game.restore(save);

        System.out.println("game.getBlueTeamScore() = " + game.getBlueTeamScore());
        System.out.println("game.getRedTeamScore() = " + game.getRedTeamScore());
    }
}
