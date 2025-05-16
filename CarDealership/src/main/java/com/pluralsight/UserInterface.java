package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    Dealership dealership;
    private String filepath = "data/inventory.csv";
    Scanner scanner = new Scanner(System.in);
    private void userInterface() {
    }


    public void display() {
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();
        System.out.println(dealership);
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean running = true;
        while (running) {
            System.out.println("========= Dealership Menu ==========");
            System.out.println("How do you want to request your vehicle?");
            System.out.println("1. Find vehicle within price range.");
            System.out.println("2. Find vehicle by Make/Model.");
            System.out.println("3. Find vehicle by year.");
            System.out.println("4. Find vehicle by color.");
            System.out.println("5. Find vehicle by odometer. ");
            System.out.println("6. Find vehicle by vehicle Type.");
            System.out.println("7. Request All vehicles. ");
            System.out.println("8. Add a vehicle");
            System.out.println("9. Remove a vehicle");
            System.out.println("0. Quit");

            choice = scanner.nextInt();


            switch (choice) {
                case 1:

                    System.out.println("Enter maximum price");
                    double price = scanner.nextDouble();
                    scanner.nextDouble();
                    processGetByPriceRequest(price);
                    System.out.println();
                    break;

                case 2:

                    System.out.println("Enter Make");
                    String make = scanner.nextLine();
                    System.out.println("Enter Model");
                    String model = scanner.nextLine();
                            processGetByMakeModelRequest(make, model);
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    processGetByYearRequest(year);
                    break;
                case 4:
                    System.out.println("Enter color");
                    String color = scanner.nextLine();
                    processGetByColorRequest(color);

                    break;
                case 5:
                    System.out.println();
                   int odometer = scanner.nextInt();
                    processGetByOdometerRequest(odometer);
                    break;
                case 6:
                    System.out.println();
                    String vehicleType = scanner.nextLine();
                    processGetVehicleTypesRequest(vehicleType);
                    break;
                case 7:
                    processGetAllVehicleRequests();

                    break;
                case 8:
                    addVehicleRequest();

                    break;
                case 9:
                    removeVehicleRequet();

                    break;
                case 0 :
                    System.out.println("Exiting the dealership menu. ");
                    running = false;
                    break;

                default :
                    System.out.println("Invalid choice. Please enter valid option (0-9)");


            }
        }
    }

    private Vehicle processGetByPriceRequest(double price) {
        return null;
    }

    private Vehicle processGetByMakeModelRequest(String make, String model) {
        return null;
    }

    private Vehicle processGetByYearRequest(int year) {
        return null;
    }

    private Vehicle processGetByColorRequest(String color) {
        return null;
    }

    private Vehicle processGetByOdometerRequest(int odometer) {
        return null;
    }

    private Vehicle processGetVehicleTypesRequest(String vehicleType) {
        return null;
    }

    private Vehicle processGetAllVehicleRequests() {
        return null;
    }

    private Vehicle addVehicleRequest() {
        return null;
    }

    private Vehicle removeVehicleRequet() {
        return null;
    }
}
