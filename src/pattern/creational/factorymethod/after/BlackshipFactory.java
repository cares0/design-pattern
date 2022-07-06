package pattern.creational.factorymethod.after;

public class BlackshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
