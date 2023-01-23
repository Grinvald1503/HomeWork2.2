package Transport;


import Transport.Driver.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static Transport.Transport.transports;


public class Main {

    public static void main(String[] args) throws CantLicensionException {
        ClassB max;
        ClassD vik;
        ClassC ivan;
        try {
            max = new ClassB("Войтов Алексей Григорьевич", true, 0);
            ivan = new ClassC("Ivanon Ivan", true, 23);
            vik = new ClassD("Viktor", true, 5);
        } catch (CantLicensionException e) {
            throw new RuntimeException(e);
        }


        Mechanic tolian = new Mechanic("Пономарёв Анатолий Викторовоч", "Гараж №1");
        Mechanic petrovich = new Mechanic("Иванов Евгений Петрович", "Гараж №1");


        Car ladaGranta = new Car("Lada", "Granta", 1.7, max, Car.BodyType.SEDAN);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, max, Car.BodyType.SEDAN);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, max, Car.BodyType.SEDAN);
        Car hyundaiAvante = new Car("Huyndai", "Avante", 1.6, max, Car.BodyType.SEDAN);
        Bus paz = new Bus("ПАЗ", "1234", 3.5, vik, Bus.Capacity.SMALL);
        Bus ikarus = new Bus("Икарус", "12313", 3.8, vik, Bus.Capacity.SMALL);
        Bus maz = new Bus("МАЗ", "234", 4.1, vik, Bus.Capacity.SMALL);
        Bus iveko = new Bus("Inveko", "23451", 3.7, vik, Bus.Capacity.SMALL);
        Truk kamaz = new Truk("Камаз", "23523", 4.2, ivan, Truk.LoadCapacity.N2);
        Truk man = new Truk("Man", "Man", 4.2, ivan, Truk.LoadCapacity.N2);
        Truk gaz = new Truk("Газ", "Next", 3.8, ivan, Truk.LoadCapacity.N2);
        Truk belaz = new Truk("Белаз", "2345", 4.0, ivan, Truk.LoadCapacity.N2);
//        System.out.println(transports);
        ladaGranta.getMechanics().add(tolian);
        ladaGranta.getMechanics().add(petrovich);
//        System.out.println(ladaGranta.getMechanics());
        infoComandCar(ladaGranta);


//        belaz.setSpeed(100);
        //      belaz.setSpeed(120);
        //    belaz.setSpeed(100);
        //  belaz.setLapTime(4.08);
        //belaz.setLapTime(4.55);
//        belaz.setLapTime(4.08);

//        System.out.println(hyundaiAvante);
//        System.out.println(ikarus);
//        belaz.bestLapTime();
//        belaz.maxSpeed();
//        ivan.perform(audiA8);
//        System.out.println(Truk.LoadCapacity.N1);
//      System.out.println(Truk.LoadCapacity.N2);
//        System.out.println(Truk.LoadCapacity.N3);


    }

    Map<Transport<?>, Set<Mechanic>> mechanicsTransport = new HashMap<>();


    public static void infoComandCar(Transport transport) {
        System.out.println(transport.getDriver());
        System.out.println(transport.getMechanics());

    }


}
