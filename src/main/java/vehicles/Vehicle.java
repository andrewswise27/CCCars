package vehicles;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Vehicle {

    private String make;
    private String model;
    private TyreType tyreType ;
    private int price;
    private String colour;
    private EngineType engineType;
    private int damageLevel;

    public Vehicle(String make, String model, TyreType tyreType, int price, String colour, EngineType engineType, int damageLevel) {
        this.make = make;
        this.model = model;
        this.tyreType = tyreType;
        this.price = price;
        this.colour = colour;
        this.engineType = engineType;
        this.damageLevel = damageLevel;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public TyreType getTyres() {
        return tyreType;
    }

    public int getPrice() {
        return this.price -= this.damageLevel;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public EngineType getEngine() {
        return engineType;
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }


}
