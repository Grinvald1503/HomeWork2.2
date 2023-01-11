package Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, double engineValue) {
        super(brand, model, engineValue);
    }
    @Override
    public void startMoving() {
        System.out.println("Автобус начал движение.");
    }

    @Override
    public void finishMovement() {
        System.out.println("Автобус остановился.");
    }

    @Override
    public String toString() {
        return "Марка - " + getBrand() + ", Модель - " + getModel() + ", Объём двигателя - " + getEngineValue();
    }
}
