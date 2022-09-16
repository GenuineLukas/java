package javaExam;

public class Ex9 {
    boolean login(String id, String password) {
        if(id.equals("hong")&&password.equals("12345")) {
            return true;
        }
        return false;
    }

    void logout(String id) {
        System.out.println("You have logged out.");
    }
}
