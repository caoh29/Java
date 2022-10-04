package org.example;

import java.util.Scanner;

public class PoundToKilograms {
    // Objects
    static double pounds;

    static double kilos;



    // Methods
    public static void getPounds() {


        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the amount in pounds: ");
            try{
                pounds = input.nextDouble();
                break;
            }
            catch (Exception e){
                System.out.println("Enter a valid amount in pounds");
            }
        }

    }

    public static void convertToKilos(){

        kilos = (pounds*0.454);
    }



    // Main
    public static void main (String[] args) {

        getPounds();
        convertToKilos();
        System.out.println("The corresponding amount in Kg is: "+kilos);

    }
}
