package model;

public class Truck extends Vehicle{
    private double load;

    public Truck(double load) {
        this.load = load;
    }

    public Truck(String driverPlate, Manufacturer manufacturer, int yearOfManufacturer, String owner, double load) {
        super(driverPlate, manufacturer, yearOfManufacturer, owner);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", super.toString(), load);
    }
}
