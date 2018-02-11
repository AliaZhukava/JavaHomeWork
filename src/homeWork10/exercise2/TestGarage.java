package homeWork10.exercise2;

import homeWork10.exercise2.cars.Car;
import homeWork10.exercise2.cars.Hatchback;
import homeWork10.exercise2.cars.Jeep;
import homeWork10.exercise2.cars.Minivan;
import homeWork10.exercise2.cars.Track;

import java.util.HashMap;

public class TestGarage {

    public static void main(String[] args) {

        Garage garage = new Garage(new HashMap<>());
        Car hatchbackFord = new Hatchback("Ford", "Focus", 2015, "blue", 119, 3);
        Car jeepMitsubishi = new Jeep("Mitsubishi", "Outlander", 2012, "silver", 146, 215);
        Car minivanFord = new Minivan("Ford", "Galaxy", 2010, "white", 161, 7);
        Car trackVW = new Track("VW", "Transporter", 2009, "black", 180, 3300);

        garage.park(hatchbackFord, jeepMitsubishi, jeepMitsubishi, minivanFord, trackVW, trackVW, hatchbackFord);
        garage.printCarsCount();

        System.out.println("Автомобили выехали.");
        garage.departure(hatchbackFord, jeepMitsubishi, trackVW);
        garage.printCarsCount();
    }
}

