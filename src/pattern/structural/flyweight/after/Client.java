package pattern.structural.flyweight.after;

public class Client {

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "black", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('l', "green", fontFactory.getFont("nanum:12"));
    }
}
