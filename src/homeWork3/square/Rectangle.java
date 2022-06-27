package homeWork3.square;

public class Rectangle implements Square {
    private final double side1;
    private final double side2;

    public Rectangle(double side1,double side2) {
        validatorArguments(side1,side2);
        this.side1 = side1;
        this.side2 = side2;
    }

    private void validatorArguments( double side1, double side2) {
        if (side1 <= 0 && side2 <= 0) {
            throw new IllegalArgumentException("side1 and side2 are non positive");
        } else if (side1 <= 0) {
            throw new IllegalArgumentException("side1 is non positive");
        } else if (side2 <= 0) {
            throw new IllegalArgumentException("side2 is non positive");
        }
    }

    @Override
    public double getSquare() {
        return side1 * side2;
    }
}
