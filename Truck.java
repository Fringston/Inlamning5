public class Truck extends Vehicle{
    int capacity;

    public Truck(String brand, String model, int speed, int year, int capacity) {
        super(brand, model, speed, year);
        this.capacity = capacity;
    }

    public float getFuelConsumption() {
        return 11.8f;
    }

    public int getMaxSpeed() {
        return 130;
    }
}
