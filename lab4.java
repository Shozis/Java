import java.util.Scanner;


public class lab4 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input x: ");
        double a = in.nextDouble();

        System.out.print("Input y: ");
        double b = in.nextDouble();

        System.out.print("Input x: ");
        double c = in.nextDouble();

        in.close();

        double med = med(a, b, c);
        System.out.print(med);
    }

    public static double med (double a, double b, double c) {
            return 0.5 * Math.sqrt(2 * Math.pow(b, 2) + 2 * Math.pow(c, 2) - Math.pow(a, 2));
        }
}
