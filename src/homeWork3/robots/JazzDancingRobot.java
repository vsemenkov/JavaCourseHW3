package homeWork3.robots;

public class JazzDancingRobot extends DancingRobot{
    //pereopredelim metod
    @Override
    public  String getDefaultDanceType() {
        return getDanceType2();
    }
    @Override
    public String getDanceType1() {
        return "jazz dance 1";
    }

    @Override
    public String getDanceType2() {
        return "jazz dance 2";
    }
}
