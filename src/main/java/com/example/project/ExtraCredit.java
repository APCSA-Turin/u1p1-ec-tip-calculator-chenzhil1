package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();
        double modifiedPercent = percent / 100.0;
        double tip = Math.round((cost * modifiedPercent) * 100) / 100.0; //I learned how to round from here https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java "(double)Math.round(value * 100000d) / 100000d"
        double totalBill = cost + tip;
        double costPerson = Math.round((cost / (double) people) * 100) / 100.0;
        double tipPerson = Math.round((tip / (double) people) * 100) / 100.0;
        double totalPerson = Math.round((cost * (1 + modifiedPercent) / (double) people) * 100) / 100.0;
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" +  + tip + "\n");
        result.append("Total Bill with tip: $" + totalBill + "\n");
        result.append("Per person cost before tip: $" + costPerson + "\n");
        result.append("Tip per person: $" + tipPerson + "\n");
        result.append("Total cost per person: $" + totalPerson + "\n");
        result.append("-------------------------------\n");    //COPY AND PASTE YOUR CODE HERE 
        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);
return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 52.7;
        String currentItems = "";
        String allItems = "";

        //Your scanner object and while loop should go here
        Scanner scan = new Scanner(System.in);
        while ((currentItems.equals("-1")) == false) {
            System.out.print("Enter an item name or type '-1' to finish: ");
            currentItems = scan.nextLine();
            if (currentItems.equals("-1") == false) {
                allItems = allItems + currentItems + "\n";
            }
        }
        System.out.println(calculateTip(people,percent,cost,allItems));
    }
}
