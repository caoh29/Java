package org.example;
public class Main extends CalculateArea{
    // Objects
    static double area;


    // Main
    public static void main(String[] args) {

        getLados();

        area=(lados.get(0)*lados.get(1))/2;

        System.out.println("el area es: " + area);

    }
}