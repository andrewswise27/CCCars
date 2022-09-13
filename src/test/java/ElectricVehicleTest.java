import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricVehicle;
import vehicles.EngineType;
import vehicles.TyreType;

import static org.junit.Assert.assertEquals;

public class ElectricVehicleTest {

    ElectricVehicle electricVehicle;

    @Before
    public void before(){
        electricVehicle = new ElectricVehicle("Tesla", "X", TyreType.ROAD, 80000, "Blue", EngineType.ELECTRIC, 200, 100);
    }

    @Test
    public void canGetTyreType(){
        assertEquals(TyreType.ROAD, electricVehicle.getTyres());
    }

    @Test
    public void canGetMake(){
        assertEquals("Tesla", electricVehicle.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("X", electricVehicle.getModel());
    }

    @Test
    public void canGetBatteryLevel(){
        assertEquals(100, electricVehicle.getBatteryPercentage());
    }

    @Test
    public void canGetEngineType(){
        assertEquals(EngineType.ELECTRIC, electricVehicle.getEngine());
    }

    @Test
    public void canGetColour(){
        assertEquals("Blue", electricVehicle.getColour());
    }

    @Test
    public void canGetPrice(){
        assertEquals(80000, electricVehicle.getPrice());
    }

    @Test
    public void canGetDamageLevel(){
        assertEquals(200, electricVehicle.getDamageLevel());
    }
}
