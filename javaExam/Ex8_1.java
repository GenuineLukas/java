package javaExam;
import java.lang.Math;

public class Ex8_1 {
    public static void main(String[] args) {
        // since we are using the materials(method in this specific case) in different class,
        // we should make an instance of the class first by referring to the Ex8 class object.
        Ex8 myCalc = new Ex8();
        int frstRecHeight = 4;
        int scndRecHeight = 4;
        double  scndRecBottom = 3.5;
        double firstRectangle = myCalc.areaRectangle(frstRecHeight);
        double secondRectangle = myCalc.areaRectangle(scndRecHeight,scndRecBottom);

        if(Math.sqrt(firstRectangle) == frstRecHeight) {
            System.out.println("the first rectangle is a square.");
        } else {
            System.out.println("the first rectangle is not a square.");
        }

        if(Math.sqrt(secondRectangle) == scndRecBottom) {
            System.out.println("the second rectangle is a square.");
        } else {
            System.out.println("the second rectangle is not a square.");
        }
    }
}
