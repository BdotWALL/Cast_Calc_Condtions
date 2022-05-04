import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = scan.nextInt();
        System.out.println("Enter another number:");
        int num2 = scan.nextInt();
        
        int add = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + add);

        int sub = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + sub);

        int multi = num1 * num2;
         System.out.println(num1 + " * " + num2 + " = " + multi);

         double  divide = (double) num1 / (double)num2;
         System.out.println(num1 + " / " + num2 + " = " + divide);

         int mod = num1 % num2;
         System.out.println(num1 + " % " + num2 + " = " + mod);

    }
}
