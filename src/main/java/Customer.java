import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private double wallet;
    private ArrayList<Vehicle> vehicles;

    public Customer(double wallet) {
        this.wallet = wallet;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public double getWallet() {
        return wallet;
    }

    public int getVehicles() {
        return vehicles.size();
    }

    public void addVehicleToCollection(Vehicle vehicle){
        if(this.wallet >= vehicle.getPrice()){
        this.vehicles.add(vehicle);
        this.wallet -= vehicle.getPrice();
    }}
}
