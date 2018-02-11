package homeWork10.exercise2.cars;

import java.util.Objects;

public class Hatchback extends Car {

    private Integer countOfDoor;

    public Hatchback(String mk, String model, Integer year, String color, Integer power, Integer countOfDoor) {
        super(mk, model, year, color, power);
        this.countOfDoor = countOfDoor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hatchback hatchback = (Hatchback) o;
        return Objects.equals(countOfDoor, hatchback.countOfDoor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), countOfDoor);
    }

    @Override
    public String toString() {
        return "Hatchback{" +
                "countOfDoor=" + countOfDoor +
                ", mk='" + mk + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }

    public int getCountOfDoor() {
        return countOfDoor;
    }

    public void setCountOfDoor(int countOfDoor) {
        this.countOfDoor = countOfDoor;
    }
}
