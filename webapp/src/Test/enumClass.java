package Test;

public class enumClass {
    public static void main(String[] args){
    Weekday day=Weekday.Sat;

    System.out.println(day.dayValue);


    }
}

enum Weekday{
    Mon(1),Tue(2),Wed(3),Thu(4),Fri(5),Sat(6),Sun(0);
    public final int dayValue;

    private Weekday(int dayValue){
        this.dayValue=dayValue;

    }

}
