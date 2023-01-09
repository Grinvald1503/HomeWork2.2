package Transport;

import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "Жёлтый", 2015, "Россия");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Чёрный", 2020, "Германия");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "Чёрыный", 2021, "Германия");
        Car kiaSportage = new Car("Kia", "Sportage", 2.4, "Красный", 2018, "Южная Корея");
        Car hyundaiAvante = new Car("Huyndai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
    }

}