package Transport;

public class Car extends Transport {





    public Car(String brand, String model, double engineValue) {
        super(brand,model, engineValue);


    }
    @Override
    public void startMoving() {
        System.out.println("Авто начал движение.");
    }

    @Override
    public void finishMovement() {
        System.out.println("Авто остановился.");
    }
    @Override
    public String toString() {
        return "Марка - " + getBrand() + ", Модель - " + getModel() + ", Объём двигателя - " + getEngineValue();
    }

}
