package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;


/*You are a car dealer. Create a hash map of vehicles.
The model is the Key, the make is the Value.
Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
(e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")*/



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Customer walks in - ask what Make they are shopping for
        System.out.println("Are you looking to buy a new car today?\n");
        String MyCarSel = input.nextLine();
        HashMap<String, String> myCar = new HashMap<>();
        myCar.put("Quest", "Nissan");
        myCar.put("Sienna", "Toyota");
        myCar.put("Odyssey", "Honda");
        myCar.put("Pilot", "Honda");

        //Let cust know what kinda you have:
        System.out.println("This is our current selection:");

        for (Map.Entry<String, String> entry : myCar.entrySet()) {
            System.out.printf("Model: %s, Make: %s \n", entry.getKey(), entry.getValue());
        }
        System.out.println("Do you have a Make in mind?");
        String myCarChoice = input.nextLine();


        //Give the cust location of make chosen        Used this website to figure it out: https://stackoverflow.com/questions/10924561/java-scanner-string-input-if-statement-not-working
        if (myCarChoice.equals("Nissan")) {
            System.out.println("Absolutely! Our Nissans are right this way!");
        } else if (myCarChoice.equals("Honda")) {
            System.out.println("Amazing! Right this way to see our terrific selection");
        } else if (myCarChoice.equals("Toyota")) {
            System.out.println("Our Toyotas are up front!");
        } else if (myCarChoice.equals("Tesla")) {
            System.out.println("Im sorry- we are sold out of those but we can order it!");


        }

    }
}


