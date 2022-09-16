package javaExam;

public class SingletonExample {
    public static void main(String[] args) {

    /*
    Singleton obj1 = new Singleton();
    Singleton obj2 = new Singleton();
     */

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 are the same Singleton object.");
        } else {
            System.out.println("obj1 and obj2 are not the same Singleton object.");
        }
    }
}

/*
this code prints: "obj1 and obj2 are the same Singleton object."
 */