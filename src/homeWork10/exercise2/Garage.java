package homeWork10.exercise2;

import homeWork10.exercise2.cars.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Garage {

    private Map<Car, Integer> garage;

    public Garage(Map<Car, Integer> garage) {
        this.garage = garage;
    }

    public void park(Car... car) {
        for (Car anotherCar : car) {
            if (!garage.containsKey(anotherCar)) {
                garage.put(anotherCar, 1);
            } else {
                int currentCount = garage.get(anotherCar);
                int newCount = currentCount + 1;
                garage.replace(anotherCar, currentCount, newCount);
            }
        }
    }

    public void departure(Car... car) {
        for (Car anotherCar : car) {
            if (garage.containsKey(anotherCar)) {
                int carsCount = garage.get(anotherCar);
                if (carsCount > 1) {
                    garage.replace(anotherCar, carsCount - 1);
                } else {
                    garage.remove(anotherCar);
                }
            }
        }
    }

    private Map<String, Integer> carsCount() {
        Map<String, Integer> map = new HashMap<>();
        Set<Map.Entry<Car, Integer>> keys = garage.entrySet();
        for (Map.Entry<Car, Integer> key : keys) {
            String carType = key.getKey().getClass().getSimpleName();
            if (map.containsKey(carType)) {
                int currentCount = map.get(carType);
                int newCount = currentCount + key.getValue();
                map.replace(carType, currentCount, newCount);
            } else {
                map.put(carType, key.getValue());
            }
        }

        return map;
    }

    public void printCarsCount() {
        Map<String, Integer> map = carsCount();
        System.out.println("В гараже");
        for (Map.Entry<String, Integer> car : map.entrySet()) {
            System.out.println(car.getKey() + " Число автомобилей: " + car.getValue());
        }
    }
}

