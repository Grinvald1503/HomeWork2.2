package Transport;

public class Mechanic {
    private String fio;
    private String company;

    public Mechanic(String fio, String company) {
        this.fio = fio;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механик - " + fio + ", из компании - " + company;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public void maintenance() {
        System.out.println("техобслуживание начато");
        System.out.println("техобслуживание закончено");

    }

    public void fixCar() {
        System.out.println("производится ремонт");

    }
}
