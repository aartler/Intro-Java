package edu.cscc;
import java.util.Scanner;
import java.lang.Math;

//Ayla Artler This program is to find the average of the input product prices greater than $100.
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String productName, exit;
        int count;
        double productCost, total, average;

        count = 0;
        total = 0;

        System.out.print("Products that cost more than $100.00");

        while{
            System.out.print ("Enter product ordered:");
            productName = input.nextLine();

            System.out.print("Please enter the price of the item: ");
            productCost =input.nextDouble();
            input.nextLine();

            while (productCost >=100){
                total=productCost+total;
                count=count+1;

                if ("Stop".equalsIgnoreCase(exit));
                    break (average = total/count);


            }







        }







    }
}
