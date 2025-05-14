package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    Dealership dealership;

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

            System.out.println("How do you want to request your vehicle?");

            choice = scanner.nextInt();


                switch (choice) {
                    case 1:


                }
            }
        }

        private Vehicle processGetByRequest ( double price){
            return null;
        }
        private Vehicle processGetByMakeModelRequest (String make, String model){
            return null;
        }
        private Vehicle processGetByYearRequest ( int year){
            return null;
        }
        private Vehicle processGetByColorRequest (String color){
            return null;
        }
        private Vehicle processGetByOdometerRequest ( int odometer){
            return null;
        }
        private Vehicle processGetVehicleTypesRequest (String vehicleType){
            return null;
        }
        private Vehicle processGetAllVehicleRequests () {
            return null;
        }
        private Vehicle addVehicleRequest () {
            return null;
        }
        private Vehicle removeVehicleRequet () {
            return null;
        }
    }
