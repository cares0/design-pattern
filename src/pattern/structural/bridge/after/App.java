package pattern.structural.bridge.after;

import pattern.structural.bridge.before.Champion;

public class App {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillE();
        kda아리.skillQ();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillE();
        poolParty아리.skillR();
    }
}
