import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number greater than 212:");
        int num = scan.nextInt();

        if (num > 212) {
            System.out.println("Water is boiling!");
        }else {
            System.out.println("Not boiling yet!");
        }
    }
}
