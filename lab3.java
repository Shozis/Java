import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

                System.out.print("Input x: ");
        double x = in.nextDouble();

        double y; 
        double h = 0.1;

        do {
            y = x + 1 / x;
            h = h + 0.1;
        } while (h == 1.5);

        System.out.print(y);
        in.close();
        
    }
}
