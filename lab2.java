import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = in.nextDouble();

        System.out.print("Input y: ");
        double y = in.nextDouble();
        
        System.out.print("Input z: ");
        double z = in.nextDouble();

        double r;
        double res1 = 0;
        double res2 = 0;
        double res3 = 0;
        
        if (Math.pow(Math.abs(z), x * y) < 3) {
            res1 = Math.sqrt(Math.abs(x) + Math.abs(y) + Math.abs(z));
        }
        else if (Math.pow(Math.abs(z), z + y) > 4) {
            double xa = Math.sqrt(Math.abs(x));
            double xy = Math.sqrt(Math.abs(y));
            double xz = Math.sqrt(Math.abs(z));

            if (xa > xy){
                if (xa > xz){
                    res2 = xa;
                } else res2 = xz; 
            } else if(xy > xz) {
                res2 = xy;
            } else res2 = xz;
        } else if (3 <= Math.pow(Math.abs(z), x + y) && Math.pow(Math.abs(z), x + y) <= 4) {
            res3 = Math.max(x, Math.pow(y, 3)) + 3;
        }

        r = res1 + res2 + res3; 

        System.out.print(r);
        in.close();
        
    }
}
