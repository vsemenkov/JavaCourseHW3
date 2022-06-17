package homeWork3.square;

import homeWork3.annotations.MyAnnotation;

@MyAnnotation
@Deprecated
public class Circle implements Square {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}
