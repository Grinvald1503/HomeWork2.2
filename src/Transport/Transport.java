package Transport;

import Transport.Driver.Driver;

import java.util.*;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineValue;
    private double lapTime;
    private double bestLapTime;
    private int speed;
    private int maxSpeed;
    private final T driver;
    public static List<Transport> transports = new ArrayList<>(30);
    private Set<Mechanic> mechanics = new HashSet<>();


    public Transport(String brand, String model, double engineValue, T driver) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineValue <= 0) {
            this.engineValue = 1.5;
        } else {
            this.engineValue = engineValue;
        }
        this.driver = driver;
        transports.add(this);
    }

    public abstract void passDiagnostics();

    public abstract void printType();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineValue() {
        return engineValue;
    }

    public void setLapTime(double lapTime) {
        if (lapTime < 0) {
            this.lapTime = lapTime * -1;
        }
        if (lapTime > bestLapTime) {
            bestLapTime = lapTime;
        }
        this.lapTime = lapTime;
    }

    public void setSpeed(int speed) {
        if (this.speed < 0) {
            this.speed = speed * -1;
        }
        if (speed > maxSpeed) {
            maxSpeed = speed;
        }
        this.speed = speed;
    }

    public double getLapTime() {
        return lapTime;
    }

    public int getSpeed() {
        return speed;
    }

    public void setEngineValue(double engineValue) {
        if (engineValue <= 0) {
            engineValue = 1.5;
        } else {
            this.engineValue = engineValue;
        }
    }

    public abstract void startMoving();

    public abstract void finishMovement();

    @Override
    public void pitStop() {
        System.out.println("Заехал на Пит Стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга - " + this.bestLapTime);
    }

    @Override
    public void maxSpeed() {
        System.out.println("Maксимальная скорость - " + this.maxSpeed);
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public T getDriver() {
        return driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineValue, engineValue) == 0 && Double.compare(transport.lapTime, lapTime) == 0 && Double.compare(transport.bestLapTime, bestLapTime) == 0 && speed == transport.speed && maxSpeed == transport.maxSpeed && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineValue, lapTime, bestLapTime, speed, maxSpeed);
    }
}

