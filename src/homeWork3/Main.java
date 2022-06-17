package homeWork3;

import homeWork3.robots.BalletDancingRobot;
import homeWork3.robots.DancingRobot;
import homeWork3.robots.FolkDancingRobot;
import homeWork3.robots.JazzDancingRobot;
import homeWork3.square.Circle;
import homeWork3.square.Rectangle;
import homeWork3.square.Square;

public class Main {
    public static void main(String[] args){
        DancingRobot robot = new BalletDancingRobot();
        printRobotDanceTypes(robot);
        //OR
        printRobotDanceTypes(new FolkDancingRobot());

        var robot1 = new JazzDancingRobot();
        printRobotDanceTypes(robot1);


        showSquare();

        //annotation and reflection
        Class<Circle> circleClass = Circle.class;
        System.out.println(circleClass.getName());

        var annotations = circleClass.getAnnotations();
        for (var annotation:annotations){
            System.out.println(annotation.toString());
        }

        System.out.println("===============================");
        printRadius(new Circle(10));
    }

    private static void printRobotDanceTypes(DancingRobot robot){
        System.out.println("=======================");
        System.out.println("Dance Type1: " + robot.getDanceType1());
        System.out.println("Dance Type2: " + robot.getDanceType2());
        System.out.println("Default Dance Type: " + robot.getDefaultDanceType());
        System.out.println("=======================\n");
    }
    private static void showSquare() {
        Rectangle sguare1 = new Rectangle(2,3);
        System.out.println("Rectangle square is: " + sguare1.getSquare());

        Circle square2 = new Circle(20);
        System.out.println("Circle square is: " + square2.getSquare());
        System.out.println("Circle radius is: " + square2.getRadius());

        System.out.println("=========================");
        Circle square3 = new Circle(10);
        System.out.println("Circle radius is: " + square3.getRadius());
        square3.setRadius(5);
        System.out.println("Circle radius is: " + square3.getRadius());
    }

    private static void printRadius(Circle circle){
        Class<?extends  Circle> aClass =circle.getClass();
        var annotation = aClass.getAnnotation(Deprecated.class);
        System.out.println(annotation);

        System.out.println("radius is: " + circle.getRadius());

    }
}
