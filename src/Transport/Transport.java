package Transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private String color;
    private final String country;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String color, String country, int maxSpeed) {
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
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (color == null) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (maxSpeed <= 0) {
            this.maxSpeed = 180;
        }
        else {
            this.maxSpeed = maxSpeed;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
