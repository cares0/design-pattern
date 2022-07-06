package pattern.factorymethod.after;

public class WhiteshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}