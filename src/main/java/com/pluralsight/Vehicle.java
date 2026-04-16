package com.pluralsight;


public class Vehicle {
    long vehicleId;
    String makeModel;
    String color;
    int odemeterReading;
    float price;


    public Vehicle(long vehicleId, String makeModel, String color, int odemeterReading, float price){
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odemeterReading = odemeterReading;
        this.price = price;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdemeterReading() {
        return odemeterReading;
    }

    public void setOdemeterReading(int odemeterReading) {
        this.odemeterReading = odemeterReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    Console console = new Console();

    public static String loopMaker(Console console){
        System.out.println("What do you want to do?");
        System.out.println();

        System.out.println("1 - List all vehicles");
        System.out.println("2 - Search by make/model");
        System.out.println("3 - Search by price range");
        System.out.println("4 - Search by color");
        System.out.println("5 - Add a vehicle");
        System.out.println("6 - Quit");
        System.out.println();

        System.out.println("Enter your command");
        console.inputInt(scanner);





    }
}
