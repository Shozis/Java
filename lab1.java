import java.util.Scanner;

public class lab1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = in.nextDouble();

        System.out.print("Input y: ");
        double y = in.nextDouble();

        double f = 0.5 + 1/2 * Math.cos(1 - Math.sin(x * Math.pow(y, 2)) / 1 + Math.pow(Math.sin(x * y), 2));

        System.out.print(f);
        in.close();
        
    }
}