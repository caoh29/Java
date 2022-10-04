package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class reverseOutput
{

    // Objects

    private static ArrayList<Integer> simpleList = new ArrayList<Integer>();

    private static ArrayList<Integer> reverseList = new ArrayList<Integer>();

    private static int count;

    //  Methods

    public static void getList()
    {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter how many numbers the list has: ");

            count = input.nextInt();

            Scanner inputList = new Scanner(System.in);

            System.out.println("Enter a number inside the list: ");

            for(int i=0 ; i < count; i++) {

                simpleList.add(inputList.nextInt());

            }

    }

    public static void invertArrayList(ArrayList<Integer> simpleList)
    {

        for (int j = simpleList.size()-1; j >= 0; j--)
        {
            reverseList.add(simpleList.get(j));
        }

    }

    // Main

    public static void main (String[] args)
    {

        getList();
        System.out.println(simpleList);
        invertArrayList(simpleList);
        System.out.println(reverseList);

    }

}
