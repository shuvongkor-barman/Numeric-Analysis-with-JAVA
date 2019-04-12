package numericanalysislab;

import java.util.ArrayList;
import java.util.Scanner;

public class NewtonRaphsonMethod {

    public double theNewtonRaphsonMethod() {

        System.out.println("*** Newton Raphson Method ***");
        double fx, fx2, x, xn = 0, a, b, c = 0, fa, fb;
        ArrayList result = new ArrayList();

        Scanner input = new Scanner(System.in);
        System.out.println("The Given Equation is: 3x -cosx -1");

        System.out.print("Enter value of a: ");
        a = input.nextDouble();

        System.out.print("Enter value of b: ");
        b = input.nextDouble();

        xn = a;
        fx2 = 3 + Math.sin(a);

        fa = 3 * a - Math.cos(a) - 1;
        fb = 3 * b - Math.cos(b) - 1;

        for (;;) {
            if (fa * fb < 0) {

                fx = (3 * a) - Math.cos(a) - 1;
                fx2 = 3 + Math.sin(a);

                xn = xn - (fx / fx2);

                result.add(xn);

                a = xn;

                int ln = result.size();
                int flag = 0;

                for (int m = 0; m < ln; m++) {

                    if (result.get(m).equals(a)) {
                        flag++;
                    }
                }

                if (flag > 1) {
                    break;
                }
            }

            System.out.print("");
        }
        return (a);
    }
}
