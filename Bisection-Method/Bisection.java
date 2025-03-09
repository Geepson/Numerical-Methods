import java.util.Scanner;

class Bisection {
    static int a3, a2, a1, a0;

    static float f(float x) {
        return a3 * x * x * x + a2 * x * x + a1 * x + a0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float xl, xm, xu, fxm, fxl, fxu, E, Era;
        System.out.println("Enter the value of a3,a2,a1 and a0");
        a3 = sc.nextInt();
        a2 = sc.nextInt();
        a1 = sc.nextInt();
        a0 = sc.nextInt();
        System.out.println("Enter the value of xl,xu and Error");
        xl = sc.nextFloat();
        xu = sc.nextFloat();
        E = sc.nextFloat();

        while (true) {
            xm = (xu + xl) / 2;
            fxm = f(xm);
            fxl = f(xl);
            fxu = f(xu);
            if ((fxl * fxm) == 0) {
                System.out.println("Root is: " + xm);
                break;
            } else if ((fxl * fxm) < 0) {
                xu = xm;
            } else {
                xl = xm;
            }
            Era = (xu - xl) / xu;
            if (Math.abs(Era) < E) {
                System.out.println("Root is :" + xm);
                break;
            }

        }

    }
}