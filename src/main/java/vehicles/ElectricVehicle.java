package vehicles;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class ElectricVehicle extends Vehicle{

    private int batteryPercentage;

    public ElectricVehicle(String make, String model, TyreType tyreType, int price, String colour, EngineType engineType, int damageLevel, int batteryPercentage) {
        super(make, model, tyreType, price, colour, engineType, damageLevel);
        this.batteryPercentage = batteryPercentage;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }
}
