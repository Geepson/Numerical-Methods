
import java.util.Scanner;

class Newton_Raphson {
    static int a3, a2, a1, a0;

    static float f(float x) {
        return a3 * x * x * x + a2 * x * x + a1 * x + a0;
    }

    static float f_(float x) {
        return 3 * a3 * x * x + 2 * a2 * x + a1;
    }

    public static void main(String[] args) {

        float x0, x1, fx, f_x, Error, E;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a3,a2,a1 and a0 repectively :");
        a3 = sc.nextInt();
        a2 = sc.nextInt();
        a1 = sc.nextInt();
        a0 = sc.nextInt();
        System.out.println("Enter the value of x0 and Error :");
        x0 = sc.nextFloat();
        E = sc.nextFloat();
        while (true) {
            fx = f(x0);
            f_x = f_(x0);
            x1 = (x0 - (fx / f_x));
            if (fx == 0) {
                System.out.println("Root is :" + x0);
                break;
            }
            Error = (x1 - x0) / x1;
            if (Math.abs(Error) < E) {
                System.out.println("Root is :" + x1);
                break;
            } else {
                x0 = x1;
            }
        }
    }
}