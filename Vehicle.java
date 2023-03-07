abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int speed;
    protected int year;

    public Vehicle(String brand, String model, int speed, int year) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.year = year;
    }

    public abstract float getFuelConsumption();
    public abstract int getMaxSpeed();

}
