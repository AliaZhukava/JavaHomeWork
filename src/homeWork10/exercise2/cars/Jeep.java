package homeWork10.exercise2.cars;

import java.util.Objects;

public class Jeep extends Car {

    private Integer clearance;

    public Jeep(String mk, String model, Integer year, String color, Integer power, Integer clearance) {
        super(mk, model, year, color, power);
        this.clearance = clearance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Jeep jeep = (Jeep) o;
        return Objects.equals(clearance, jeep.clearance);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), clearance);
    }

    @Override
    public String toString() {
        return "Jeep{" +
                "mk='" + mk + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", power=" + power +
                "clearance=" + clearance +
                '}';
    }

    public Integer getClearance() {
        return clearance;
    }

    public void setClearance(Integer clearance) {
        this.clearance = clearance;
    }
}
