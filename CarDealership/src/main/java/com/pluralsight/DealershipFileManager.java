package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DealershipFileManager {

    public Dealership getDealership() {
//     read inventory.csv file
//     read the first line which has the dealership data
//take the line of dealersgip data and split by | which returns a string of data array
//        take each piece of data and pass it into constructor of our Dealership to create a specefic
        Dealership dealership = new Dealership("", "", "");
        return dealership;
    }
    public void saveDearlership(Dealership dealership){

    }


    public class FileReaderExample {
        public static void main(String[] args) {
            try {
                // Step 1: Create a FileInputStream object for the file
                FileInputStream fis = new FileInputStream("poem.txt");

                // Step 2: Create a Scanner object to read from the file
                Scanner scanner = new Scanner(fis);

                // Step 3: Read each line of the file
                while(scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }

                // Step 4: Close the Scanner to release resources
                scanner.close();
            } catch(IOException e) {
                // Handle file not found or other IO exceptions
                e.printStackTrace();
            }
        }
    }

}
