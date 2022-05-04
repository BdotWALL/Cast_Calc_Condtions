import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Name a number between 0 and 100");
       int grade = scan.nextInt();

       if (grade >= 90) {
           System.out.println("Your grade is an A :)");
       }else if (grade >= 80) {
        System.out.println("Your grade is an B :)");
       }else if (grade >= 70) {
        System.out.println("Your grade is an C :|");
       }else if (grade >= 60) {
        System.out.println("Your grade is an D :(");
       }else if (grade <= 59) {
        System.out.println("Your grade is an F :(");
       }
    }
}
