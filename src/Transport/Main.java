package Transport;

import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "Жёлтый", 2015, "Россия", 180, "auto", "sedan", "777", 5, true);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Чёрный", 2020, "Германия", 180, "auto", "sedan", "777", 5, true);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "Чёрыный", 2021, "Германия", 180, "auto", "sedan", "777", 5, true);
        Car kiaSportage = new Car("Kia", "Sportage", 2.4, "Красный", 2018, "Южная Корея", 180, "auto", "sedan", "777", 5, true);
        Car hyundaiAvante = new Car("Huyndai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея", 180, "auto", "sedan", "777", 5, true);
        Bus paz = new Bus("ПАЗ", "1234", 1994, "белый", "Россия", 100);
        Bus ikarus = new Bus("Икарус", "12313", 1987, "красный", "Россия", 120);
        Bus maz = new Bus("МАЗ", "234", 2000, "Синий", "Белорусия", 130);


        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
        System.out.println(paz);
        System.out.println(ikarus);
        System.out.println(maz);
    }

}