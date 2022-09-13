import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricVehicle;
import vehicles.EngineType;
import vehicles.RaceCar;
import vehicles.TyreType;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    ElectricVehicle electricVehicle;
    RaceCar raceCar;

    @Before
    public void setUp(){
        customer = new Customer(1000000.00);
        electricVehicle = new ElectricVehicle("Tesla", "X", TyreType.ROAD, 80000, "Blue", EngineType.ELECTRIC, 0, 100);
        raceCar = new RaceCar("Ferarri", "F2004", TyreType.RACE, 100000000, "Red", EngineType.F1, 0);
    }

    @Test
    public void customerHasMoney(){
        assertEquals(1000000.00, customer.getWallet(), 0.0);
    }

    @Test
    public void startsEmptyCollection(){
        assertEquals(0, customer.getVehicles());
    }

    @Test
    public void canAddToCollection(){
        customer.addVehicleToCollection(electricVehicle);
        assertEquals(1, customer.getVehicles());
    }

    @Test
    public void purchaseReducesWallet(){
        customer.addVehicleToCollection(electricVehicle);
        assertEquals(920000, customer.getWallet(), 0.0);
    }

    @Test
    public void customerCantAffordVehicle(){
        customer.addVehicleToCollection(raceCar);
        assertEquals(0, customer.getVehicles());
    }

}
