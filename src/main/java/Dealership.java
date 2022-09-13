import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;

public class Dealership {

    private double till;
    private ArrayList<Vehicle> stock;
    private HashMap<String, Integer> vehicleTypes;

    public Dealership(double till) {
        this.till = till;
        this.stock = new ArrayList<Vehicle>();
        this.vehicleTypes = new HashMap<String, Integer>();
    }

    public double getTill() {
        return till;
    }

    public int getStock() {
        return stock.size();
    }

    public HashMap<String, Integer> getVehicleTypes() {
        return vehicleTypes;
    }

    public void addVehicleToStock(Vehicle vehicle){
        if(this.till >= vehicle.getPrice()){
            this.stock.add(vehicle);
            this.till -= vehicle.getPrice();
        }}

    public void removeVehicleFromStock(Vehicle vehicle){
        this.stock.remove(vehicle);
    }

    public void sellToCustomer(Customer customer, Vehicle vehicle){
        this.stock.remove(vehicle);
        this.till += vehicle.getPrice();
        customer.addVehicleToCollection(vehicle);
    }

    public void canRepairVehicle(Vehicle vehicle){
        int priceChange = (vehicle.getDamageLevel() + vehicle.getPrice());
        vehicle.setPrice(priceChange);
        this.till -= vehicle.getDamageLevel();
        vehicle.setDamageLevel(0);
    }
}
