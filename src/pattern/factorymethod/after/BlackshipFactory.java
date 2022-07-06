package pattern.factorymethod.after;

public class BlackshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
