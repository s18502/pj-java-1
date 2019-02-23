package mypackage;

public class Car {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String brand;
    private boolean isNew;
    private int mileage;
    private double price;

    Car(){
        System.out.println("constructor");
    }

    Car(String brand, boolean isNew, int mileage, double price) {
        this();

        this.brand = brand;
        this.isNew = isNew;
        this.mileage = mileage;
        this.price = price;
    }

    public void printCar() {
        System.out.println("Brand: " + this.brand);
        System.out.println("IsNew: " + this.isNew);
        System.out.println("Price: " + this.price);
        System.out.println("Mileage: " + this.mileage);
    }
}
