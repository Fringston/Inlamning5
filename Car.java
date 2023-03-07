class Car extends Vehicle{

    int doors;

    public Car(String brand, String model, int speed, int year, int doors) {
        super(brand, model, speed, year);
        this.doors = doors;
    }

    public float getFuelConsumption() {
        return 8.5f;
    }

    public int getMaxSpeed() {
        return 200;
    }
}
