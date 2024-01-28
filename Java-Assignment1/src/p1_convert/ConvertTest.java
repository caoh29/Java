package p1_convert;

import java.util.Scanner;

public class ConvertTest {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter '1' for weight converting, or '2' for temperature converting: ");
    int input = scn.nextInt();

    switch (input) {
      case 1:
        System.out.println("Enter a mass value: ");
        double mass = scn.nextDouble();

        System.out.println("Enter '1' for converting to Kilograms, or '2' for converting to Pounds: ");
        int massChoice = scn.nextInt();

        Convert.getMass(mass, massChoice);

        if (massChoice == 1) {
          System.out.println(mass + " Pounds is " + Convert.massResult + " Kilograms");
        } else if (massChoice == 2) {
          System.out.println(mass + " Kilograms is " + Convert.massResult + " Pounds");
        }
        break;
      case 2:
        System.out.println("Enter a temperature value: ");
        double temp = scn.nextDouble();

        System.out.println("Enter '1' for converting to Fahrenheit, or '2' for converting to Celsius: ");
        int tempChoice = scn.nextInt();

        Convert.getTemperature(temp, tempChoice);

        if (tempChoice == 1) {
          System.out.println(temp + " Celsius is " + Convert.tempResult + " Fahrenheit");
        } else if (tempChoice == 2) {
          System.out.println(temp + " Fahrenheit is " + Convert.tempResult + " Celsius");
        }

        break;
      default:
        System.err.println("Invalid Choice! Only 1 or 2 is allowed");
        break;
    }

    scn.close();
  }
}
