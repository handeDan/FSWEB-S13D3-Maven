package org.example;

public class Wall {
    //instance variables:
    double width;
    double height;

    //constructors:
    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    //methods:
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    public double setWidth(double width) {
        if(width < 0 ) {
            width = 0;
        }
        return this.width = width;
    }
    public double setHeight(double height) {
        if(height < 0 ) {
            height = 0;
        }
        return this.height = height;
    }
    public double getArea() {
        return width*height;
    }
}
