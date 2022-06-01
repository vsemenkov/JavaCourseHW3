package homeWork3.square;

public class Circle implements Square {
    private final double radius;

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
}
