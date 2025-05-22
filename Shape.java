package com.codewithashish.Shape;

class Rectangle{
    private double length , bredth;

    public void setLength(double length){
        this.length = length;
    }
    public void setBredth(double bredth){
        this.bredth = bredth;
    }
    public double getLength(){
        return length;
    }
    public double getBredth(){
        return bredth;
    }

    public double area(){
        return length*bredth;
    }
}

class Square extends Rectangle{

    public void setSide(double side){
        setLength(side);
        setBredth(side);
    }

    public double getSide(){
        return getLength();
    }

    public double area(){
        double side = getLength();
        return side*side;
    }
}

class Circle{
    public double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double area(){
        return Math.PI*(radius*radius);
    }
}

class Cylinder extends Circle{
    private int height;

    public void setheight(int h){
        this.height = h;
    }

    public int getheight(){
        return height;
    }

    public double Volume(){
        return (Math.PI*(radius*radius)*height);
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

class Sphere extends Circle{

    public double Spherearea(){
        return 4*Math.PI*(radius*radius);
    }

    public double Volume(){
        return (4.0/3.0)*Math.PI*radius*radius*radius;
    }
}

public class Shape{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(12);
        System.out.println(c1.getRadius());
        System.out.println(c1.area());
        System.out.println();

        Cylinder cy1 = new Cylinder();
        cy1.setRadius(5);
        cy1.setheight(10);
        System.out.println(cy1.Volume());
        System.out.println(cy1.surfaceArea());
        System.out.println();

        Sphere s = new Sphere();
        s.setRadius(7);
        System.out.println("Sphere Surface Area: " + s.Spherearea());
        System.out.println("Sphere Volume: " + s.Volume());

    }
}
