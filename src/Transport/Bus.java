package Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int year, String color, String country, int maxSpeed) {
        super(brand, model, year, color, country, maxSpeed);
    }

    @Override
    public String toString() {
        return "Марка - " + getBrand() + ", Модель - " + getModel() + ", Цвет авто - " + getColor() + ", Год производства - " + getYear() + ", Страна производства - " + getCountry();
    }
}
