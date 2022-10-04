package org.example;

public class Circle
{
    // Propiedades

    private double radius;


    // Metodos

    public Circle(double radius)
    {
        this.radius=radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        double area = radius * radius * Math.PI;
        return area;
    }

}
