package homeWork10.exercise2.cars;

import java.util.Objects;

public abstract class Car {

    protected String mk;
    protected String model;
    protected Integer year;
    protected String color;
    protected Integer power;

    public Car(String mk, String model, Integer year, String color, Integer power) {
        this.mk = mk;
        this.model = model;
        this.year = year;
        this.color = color;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) &&
                Objects.equals(year, car.year) &&
                Objects.equals(color, car.color) &&
                Objects.equals(power, car.power) &&
                Objects.equals(mk, car.mk);
    }

    @Override
    public int hashCode() {

        return Objects.hash(model, year, color, power, mk);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }
}
