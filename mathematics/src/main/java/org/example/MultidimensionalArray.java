package org.example;

public class MultidimensionalArray
{

    // Objects

    static double [][] myMultiList = {

            {1, 2.3, 3.5},
            {4.4, 5, 6},
            {10, 11, 12}

    };

    // Methods

    private static void sumArrayValues (double[][]  anyMultidimensionalList)
    {

        double sum = 0;


        for (int i=0; i < anyMultidimensionalList.length;i++) {

            for (int j=0; j < anyMultidimensionalList[i].length; j++) {

                sum = sum + anyMultidimensionalList[i][j];

            }

        }

        System.out.println(sum);

    }

    // Main

    public static void main (String[] args)
    {
        sumArrayValues(myMultiList);
    }

}
