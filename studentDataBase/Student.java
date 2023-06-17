import java.util.Scanner;
import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private ArrayList<String> courses = new ArrayList<>();
    private int tuitionBalance = 0;
    private static int COSTOFCOURSE = 600;
    private static int id = 1000;
    //constructor: prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.println("1-Freshmen\n2-Sophomore\n3-Junior\n4-Senior\nEnter student's class level. ");
        this.gradeYear = in.nextInt();

        setStudentID();
    }
    //generate an ID
    private void setStudentID() {
        id++; //each time we create the student instance, id gets incremented by 1
        this.studentID = (gradeYear + "" + id);
    }

    //enroll in courses
    public void enroll() {

        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")){
                courses.add(course);
                tuitionBalance += COSTOFCOURSE;
            } else {
                break;
            }
        } while (true); //forever
    }

    public void printEnrolledCourse(ArrayList<String> arr){
        System.out.println("ENROLLED IN:");
        for(String course : arr){
            System.out.println(course);
        }
        System.out.println("TUITION BALANCE:\n" + tuitionBalance);
    }

    //view balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment: $" + payment);
        viewBalance();
    }
    //show status
    public String toString(){
        return "Name: " + firstName + " " + lastName +
                "\nCourse(s) Enrolled!:" + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
