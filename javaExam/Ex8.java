package javaExam;

public class Ex8 {
    /*
    overload methods that return the area of q rectangle when given two parameters,
    the area of a square when given only one parameter.
    the parameter(s): the length of height and bottom if applicable.
     */

    double areaRectangle(double x, double y) {
        return x*y;
    }

    double areaRectangle(double x) {
        return x*x;
    }
}

