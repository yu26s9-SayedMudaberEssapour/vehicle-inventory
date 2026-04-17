package com.pluralsight;


public class Vehicle {


    private long vehicleId;
    private String makeModel;
    private String color;
    private int odemeterReading;
    private float price;


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



    public static void listAllVehicles(Vehicle[] vehicles){

        for(int i = 0; i < 6; i++){

            System.out.println("The vehicle id is: " + vehicles[i].getVehicleId());
            System.out.println("The vehicle make model is: " + vehicles[i].getMakeModel());
            System.out.println("The vehicle color: "+ vehicles[i].getColor());
            System.out.println("The vehicle Odometer: " + vehicles[i].getOdemeterReading());
            System.out.println("Price of the vehicle: " + vehicles[i].getVehicleId());
            System.out.println();
        }


    }


    public static String SearchByMakeModel(Vehicle[] vehicles){

        //here you will go through the list of cars and then look for the model of the vehicle.

        int i = 0;
        String model = "nothing is returned";
        //fix this to the length of the list
        while (i < 6){
            if (vehicles[i] != null){
                model = vehicles[i].getMakeModel();
            }
            i++;

        }
        return model;
    }



    public static double[] findVehiclesByPrice(Vehicle[] value){


        double[] prices = new double[value.length];

        int i = 0;
        //fix this to the length of the list
        while (i < value.length){
            if (value[i] != null){
                prices[i] = (value[i].getPrice());
            }
            i++;

        }
        return prices;
    }


    public static String searchByColor(Vehicle[] vehicles){

        int i = 0;
        String color = "";
        //fix this to the length of the list
        while (i < 6){
            if (vehicles[i] != null){
                color = vehicles[i].getColor();
            }
            i++;

        }
        return color;
    }




    public static void addAVehicle(Vehicle[] value){

        Console console1 = new Console();


        long vehicleId = console1.promptForLong("Please enter the vehicelID: ");
        String makeModel = console1.promptForString("Pleaes enter a make or model: ");
        String color = console1.promptForString("please enter the color of the car: ");
        int odemeterReading = console1.promptForInt("Please enter an odometer value: ");
        float price = console1.promptForFloat("please enter a price: ");


        int size = 0;
        for(Vehicle item : value){
            if (item != null){
                size ++;
            }
        }



        Vehicle newCar = new Vehicle(vehicleId, makeModel, color, odemeterReading, price);

        value[size] = newCar;



    }



}
