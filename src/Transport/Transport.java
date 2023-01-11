package Transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineValue;

    public Transport(String brand, String model, double engineValue) {
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
            engineValue = 180;
        }
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineValue() {
        return engineValue;
    }

    public void setEngineValue(double engineValue) {
        if (engineValue <= 0) {
            engineValue = 1.5;
        }
        this.engineValue = engineValue;
    }
    public abstract void startMoving();
    public abstract void finishMovement();

}
