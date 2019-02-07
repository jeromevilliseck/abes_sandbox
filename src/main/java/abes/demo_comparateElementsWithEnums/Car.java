package abes.demo_comparateElementsWithEnums;

public class Car<K extends Enum<K>> implements Comparable<Car>{
    private String nameOfCar;
    private Enum<K> enumV;

    Enum<K> getEnumV() {
        return enumV;
    }

    public Car(String nameOfCar, Enum<K> enumV) {
        this.nameOfCar = nameOfCar;
        this.enumV = enumV;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameOfCar='" + nameOfCar + '\'' +
                ", enumV=" + enumV +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.getEnumV().compareTo((K) o.getEnumV());
    }
}
