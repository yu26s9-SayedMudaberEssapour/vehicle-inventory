package com.pluralsight;

import java.util.Scanner;

public class main {
    public static void main(String[] args){


        int counter;


        //this is am array with size 20 [v1,v2,v3,v4,v5,_,_,_,_,_,_,_,_,_,_,_,_,_]
        Vehicle[] vehicles = new Vehicle[20];



        //These are making instances of the the Vehicle class and they are not really putting it into the list.
        Vehicle v1 = new Vehicle(101121,"Ford Explorer", "Red", 45000, 135000);
        Vehicle v2 = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        Vehicle v3 = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        Vehicle v4 = new Vehicle(101124,"Honda Civic","White",70000,7500);
        Vehicle v5 = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        Vehicle v6 = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);


        //different instances of the class are being put in the list
        vehicles[0] = v1;
        vehicles[1] = v2;
        vehicles[2] = v3;
        vehicles[3] = v4;
        vehicles[4] = v5;
        vehicles[5] = v6;



        //run a loop that will be going through each of the elements of the vehicle and then
        //get whatever of the 5 that you want to get from it.

//        System.out.println("This first vehicle id is: " + vehicles[0].getVehicleId());


        //here I will be listing out the vehicles





        //finally returns the model now we want all of it.
        String s = Vehicle.SearchByMakeModel(vehicles);
        System.out.println(s);


        //here we are testing for price
        double[] p = Vehicle.findVehiclesByPrice(vehicles);

        for(double pricesOfEachVehicle : p){
            System.out.println("prices of vehicles are: $" + pricesOfEachVehicle);

        }



        //here we are testing for color

        String c = Vehicle.searchByColor(vehicles);
        System.out.println(c);









        //the name of our list is vehicles v1,v2 are vasically different cars


        Console console = new Console();

        //change this later, the input wil be whatever the user inputs


        int number;
        do {
            //change this later, the input wil be what ever the user inputs
            int num = console.promptForInt("Please enter 1 number out of the options");
            number = num;
            System.out.println("What do you want to do?");
            System.out.println();

            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.println();

            //here do different functionality if each number is clicked so do 1 first



            switch(num) {
                case 1:
                    Vehicle.listAllVehicles(vehicles);
                    break;
                case 2:
                    Vehicle.findVehiclesByPrice(vehicles);
                    break;
                case 5:
                    Vehicle.addAVehicle(vehicles);
                    break;
                case 6:
                    return;
            }

        }
        while (number != 6);


    }

}
