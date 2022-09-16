package javaExam;

public class Ex9_1 {
    public static void main(String[] args) {

        Ex9 memberService = new Ex9();
        boolean result = memberService.login("hong", "12345");
        if(result) {
            System.out.println("You have logged in successfully.");
            memberService.logout("hong");
        } else {
            System.out.println("id/password is not correct.");
        }
    }
}
