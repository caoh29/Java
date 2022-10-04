package org.example;

import java.util.Scanner;

public class HackerRank2Split
{

    public static void check(int n)
    {
        int temp = n % 2;

        if (temp==0)
        {
            System.out.println("Not Weird");
        }
        else
        {
            System.out.println("Weird");
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        check(number);


        int number2 = input.nextInt();

        check(number2);

    }

}
