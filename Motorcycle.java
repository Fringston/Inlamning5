public class Motorcycle extends Vehicle{

    boolean windShield;

    public Motorcycle(String brand, String model, int speed, int year, boolean windShield) {
        super(brand, model, speed, year);
        this.windShield = windShield;
    }

    public float getFuelConsumption() {
        return 5.0f;
    }

    public int getMaxSpeed() {
        return 280;
    }
}
