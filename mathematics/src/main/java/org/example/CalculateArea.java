package org.example;

import java.util.ArrayList;
import java.util.Scanner;
public class CalculateArea {

    // Objects
    static Integer lado;

    static ArrayList<Integer> lados = new ArrayList<Integer>();

    // static double pi = 3.1416;

    // Methods
    static void getLados() {

        for(int i=0; i<2; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Provide and integer");
            lado = input.nextInt();
            lados.add(lado);
        }
    }


}
