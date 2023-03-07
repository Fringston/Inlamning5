import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car car1 = new Car("Volvo", "V40",200, 2017, 5);
        vehicles.add(car1);

        Truck truck1 = new Truck("Scania", "340", 120, 2015, 4);
        vehicles.add(truck1);

        Motorcycle motorcycle1 = new Motorcycle("Yamaha", "Maisto", 250, 2020, true);
        vehicles.add(motorcycle1);

        for (Vehicle i : vehicles) {
            System.out.println("\nMärke: " + i.brand);
            System.out.println("Modell: " + i.model);
            System.out.println("Årsmodell: " + i.year);
            System.out.println("Topphastighet: " + i.getMaxSpeed() + " km/h");
            System.out.println("Bränsleförbrukning: " + i.getFuelConsumption() + " liter per 100 km");

            if (i instanceof Car) {
                Car c = (Car) i;
                System.out.println("Antal dörrar: " + c.doors);
            }
            if (i instanceof Truck) {
                Truck t = (Truck) i;
                System.out.println("Max kapacitet: " + t.capacity + " ton");
            }
            if (i instanceof Motorcycle) {
                Motorcycle m = (Motorcycle) i;
                String hasWindShield = m.windShield ? "Ja" : "Nej";
                System.out.println("Har vindruta: " + hasWindShield);
            }
            float fuelNeeded = (float) (2 * i.getFuelConsumption() / 100 * 200);
            System.out.println("För att köra från Göteborg till Malmö krävs det " + fuelNeeded + " liter bränsle.");
        }
    }
}