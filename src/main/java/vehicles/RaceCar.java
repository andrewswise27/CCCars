package vehicles;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class RaceCar extends Vehicle {
    public RaceCar(String make, String model, TyreType tyreType, int price, String colour, EngineType engineType, int damageLevel) {
        super(make, model, tyreType, price, colour, engineType, damageLevel);
    }
}
