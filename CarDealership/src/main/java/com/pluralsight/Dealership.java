package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Vehicle>inventory;

    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public ArrayList<Vehicle>getVehiclesByPrice(double min,double max){
return null;
    }
    public ArrayList<Vehicle>getVehiclesByMakeAndModel(String min,String max){
return null;
    }

    public ArrayList<Vehicle>getVehiclesByYear(int min, int max){
        return null;
    }
    public ArrayList<Vehicle>getVehiclesByColor(String min, String max){
        return null;
    }
    public ArrayList<Vehicle>getVehiclesByMilage(int min, int max){
        return null;
    }
    public ArrayList<Vehicle>getVehiclesByType(String min, String max){
        return null;
    }public ArrayList<Vehicle>getAllVehicles(){
        return null;
    }
    public void addVehicle(Vehicle vehicle){
inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
inventory.remove(vehicle);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dealership{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", inventory=").append(inventory);
        sb.append('}');
        return sb.toString();
    }
}
