package org.example;

import java.util.Scanner;

public class FarenheitToCelsius {
    // Objects
    static double tempF;

    static double tempC;



    // Methods
    static void getTempF() {

       // for(int i=0; i<2; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Temperature in °F: ");
            tempF = input.nextDouble();
        }

    static void convertToCelsius(){

        tempC = (5.0/9) * (tempF - 32);
    }



    // Main
    public static void main (String[] args) {

        getTempF();
        convertToCelsius();
        System.out.println("The Temperature in °C is: "+tempC);

    }
}
