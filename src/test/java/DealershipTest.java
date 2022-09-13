import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricVehicle;
import vehicles.EngineType;
import vehicles.RaceCar;
import vehicles.TyreType;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Customer customer;
    ElectricVehicle electricVehicle;
    ElectricVehicle electricVehicle2;
    RaceCar raceCar;

    @Before
    public void setUp(){
        dealership = new Dealership(20000000.00);
        customer = new Customer(1000000.00);
        electricVehicle = new ElectricVehicle("Tesla", "X", TyreType.ROAD, 80000, "Blue", EngineType.ELECTRIC, 0, 100);
        electricVehicle2 = new ElectricVehicle("Tesla", "X", TyreType.ROAD, 80000, "Blue", EngineType.ELECTRIC, 200, 100);
        raceCar = new RaceCar("Ferarri", "F2004", TyreType.RACE, 100000000, "Red", EngineType.F1, 0);
    }

    @Test
    public void dealershipHasMoney(){
        assertEquals(20000000.00, dealership.getTill(), 0.0);
    }

    @Test
    public void startsEmptyCollection(){
        assertEquals(0, dealership.getStock());
    }

    @Test
    public void canAddToCollection(){
        dealership.addVehicleToStock(electricVehicle);
        assertEquals(1, dealership.getStock());
    }

    @Test
    public void canSellToCustomer(){
        dealership.addVehicleToStock(electricVehicle);
        dealership.addVehicleToStock(electricVehicle);
        dealership.sellToCustomer(customer, electricVehicle);
        assertEquals(1, dealership.getStock());
        assertEquals(1, customer.getVehicles());
        assertEquals(19920000, dealership.getTill(), 0.00);
    }

    @Test
    public void canRemoveFromStock(){
        dealership.addVehicleToStock(electricVehicle);
        dealership.addVehicleToStock(electricVehicle);
        dealership.removeVehicleFromStock(electricVehicle);
        assertEquals(1, dealership.getStock());
    }

    @Test
    public void damageAffectsVehiclePrice(){
        assertEquals(79800, electricVehicle2.getPrice());
    }

    @Test
    public void repairsRemovesMoneyFromTill(){
        dealership.canRepairVehicle(electricVehicle2);
        assertEquals(19999800, dealership.getTill(), 0.00);
        assertEquals(80000, electricVehicle2.getPrice());
    }
}
