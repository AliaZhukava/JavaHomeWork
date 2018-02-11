package homeWork10.exercise2.cars;

import java.util.Objects;

public class Track extends Car {

    private Integer cargoCapacity;

    public Track(String mk, String model, Integer year, String color, Integer power, Integer cargoCapacity) {
        super(mk, model, year, color, power);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Track track = (Track) o;
        return Objects.equals(cargoCapacity, track.cargoCapacity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), cargoCapacity);
    }

    @Override
    public String toString() {
        return "Track{" +
                "cargoCapacity=" + cargoCapacity +
                ", mk='" + mk + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }

    public Integer getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(Integer cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
