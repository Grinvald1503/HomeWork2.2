package Transport;

public class Car extends Transport {


    private double engineVolume;


    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int places;
    private boolean rubber;


    public Car(String brand, String model, double engineVolume, String color, int year, String country, int maxSpeed, String transmission, String bodyType, String registrationNumber, int places, boolean rubber) {
        super(brand,model, year, color, country, maxSpeed );
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        else {
            this.engineVolume = engineVolume;
        }
        if (transmission == null) {
            this.transmission = "Механика";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null) {
            this.bodyType = "Седан";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (places == 0) {
            this.places = 5;
        } else {
            this.places = places;
        }

    }
    public class Key {
        private boolean remoteLaunch;
        private boolean keylessAccess;

        public Key(boolean remoteLaunch, boolean keylessAccess) {
            this.remoteLaunch = remoteLaunch;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteLaunch() {
            return remoteLaunch;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public void changingTires(int mount) {
        if (mount > 12 || mount <= 0) {
            System.out.println("месяца не существует");
        }
        if ((mount > 10 || mount < 3) && rubber) {
            System.out.println("смените шины на замние");
        }
        if ((mount < 11 || mount >= 3) && !rubber) {
            System.out.println("смените шины на летние");
        }

    }

    @Override
    public String toString() {
        return "Марка - " + getBrand() + ", Модель - " + getModel() + ", Обём двигателя в литрах - " + engineVolume + ", Цвет авто - " + getColor() + ", Год производства - " + getYear() + ", Страна производства - " + getCountry() + ", Максимальная скорость - " + getMaxSpeed() + ", Тип коробки - " + transmission + ", Тип кузова - " + bodyType + ", Регистрационный номер - " + registrationNumber + ", число мест - " + rubber + ".";
    }



    public String getBodyType() {
        return bodyType;
    }

    public int getPlaces() {
        return places;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }




    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isRubber() {
        return rubber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }
}
