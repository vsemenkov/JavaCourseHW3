package homeWork3;

public class Main {
    public static void main(String[] args){
        DancingRobot robot = new BalletDancingRobot();
        printRobotDanceTypes(robot);
        //OR
        printRobotDanceTypes(new FolkDancingRobot());

        var robot1 = new JazzDancingRobot();
        printRobotDanceTypes(robot1);
    }

    private static void printRobotDanceTypes(DancingRobot robot){
        System.out.println("=======================");
        System.out.println("Dance Type1: " + robot.getDanceType1());
        System.out.println("Dance Type2: " + robot.getDanceType2());
        System.out.println("Default Dance Type: " + robot.getDefaultDanceType());
        System.out.println("=======================\n");
    }
}
