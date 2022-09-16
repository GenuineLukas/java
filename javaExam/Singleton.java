package javaExam;

/*
make a singleton class, and make an example class of it
so you can show how to create the instance by using getInstance() method
that's created in the Singleton class.
 */
public class Singleton {
    // static field
    private static Singleton singleton = new Singleton();

    // constructor
    private Singleton() {

    }

    // getInstance() method
    static Singleton getInstance() {
        return singleton;
    }
}
