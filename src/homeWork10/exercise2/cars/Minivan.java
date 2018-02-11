package homeWork10.exercise2.cars;

import java.util.Objects;

public class Minivan extends Car {

    private Integer numberOfSeats;

    public Minivan(String mk, String model, Integer year, String color, Integer power, Integer numberOfSeats) {
        super(mk, model, year, color, power);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Minivan minivan = (Minivan) o;
        return Objects.equals(numberOfSeats, minivan.numberOfSeats);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), numberOfSeats);
    }

    @Override
    public String toString() {
        return "Minivan{" +
                "numberOfSeats=" + numberOfSeats +
                ", mk='" + mk + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
