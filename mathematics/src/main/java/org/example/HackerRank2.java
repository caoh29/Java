package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HackerRank2
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

    public static void main (String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(input.readLine());
        int number2 = Integer.parseInt(input.readLine());

        check(number);
        check(number2);

    }

}
