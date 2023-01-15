package Transport;

public class Truk extends Transport {

    public Truk (String brand, String model, double engineValue) {
        super(brand, model, engineValue);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение.");
    }

    @Override
    public void finishMovement() {
        System.out.println("Грузовик остановился.");
    }

    @Override
    public String toString() {
        return "Марка - " + getBrand() + ", Модель - " + getModel() + ", Объём двигателя - " + getEngineValue();
    }
}
