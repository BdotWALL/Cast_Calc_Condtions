public class Casting {
    public static void main(String[] args) throws Exception {
        double myDub = 112.35;
        int myInt = (int) myDub; 

        System.out.println("Double: " + myDub);

        System.out.println("int: " + myInt);

        String fortyNine = "49";
        int differentInt = Integer.parseInt(fortyNine);

        System.out.println("The string value is: " + fortyNine + "\n" + "The integer value is: " + differentInt);

    }
}
