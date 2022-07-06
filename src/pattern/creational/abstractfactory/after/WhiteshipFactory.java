package pattern.creational.abstractfactory.after;

import pattern.creational.factorymethod.after.Ship;
import pattern.creational.factorymethod.after.ShipFactory;
import pattern.creational.factorymethod.after.Whiteship;

public class WhiteshipFactory implements ShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
