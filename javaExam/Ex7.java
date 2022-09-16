package javaExam;

public class Ex7 {
/*
make a login system using a basic enum.
 */
    public static void main(String[] args) {
        enum LoginResult {
          SUCCESS,
          FAIL_ID,
          FAIL_PASSWORD
        }

        LoginResult result = LoginResult.FAIL_PASSWORD;

        if(result == LoginResult.SUCCESS) {
            System.out.println("logged in successfully!");
        } else if (result == LoginResult.FAIL_ID) {
            System.out.println("Your ID is not correctly typed.");
        } else if (result == LoginResult.FAIL_PASSWORD) {
            System.out.println("Your Password is not correctly typed.");
        }
    }
}
