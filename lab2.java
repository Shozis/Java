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
        
        if (Math.pow(Math.abs(z), x * y) < 3) {
            r = Math.sqrt(Math.abs(x) + Math.abs(y) + Math.abs(z));
        }
        else if (Math.pow(Math.abs(z), z + y) > 4) {
            double xa = Math.sqrt(Math.abs(x));
            double xy = Math.sqrt(Math.abs(y));
            double xz = Math.sqrt(Math.abs(z));

            if (xa > xy){
                if (xa > xz){
                    r = xa;
                } else r = xz; 
            } else if(xy > xz) {
                r = xy;
            } else r = xz;
        } else if (3 <= Math.pow(Math.abs(z), x + y) && Math.pow(Math.abs(z), x + y) <= 4) {
            r = Math.max(x, Math.pow(y, 3)) + 3;
        }


        System.out.print(r);
        in.close();
        
    }
}
