package numericanalysislab;

import java.util.ArrayList;
import java.util.Scanner;

public class RegulaFalsiMethod {

    public double theRegulaFalsiMethod() {

        System.out.println("*** The Regula Falsi Method ***");
        double a, b, c = 0, fa, fb, fc;
        ArrayList result = new ArrayList();

        Scanner input = new Scanner(System.in);
        System.out.println("The Given Equation is: 3x -cosx -1");

        System.out.print("Enter value of a: ");
        a = input.nextDouble();

        System.out.print("Enter value of b: ");
        b = input.nextDouble();

        fa = 3 * a - Math.cos(a) - 1;
        fb = 3 * b - Math.cos(b) - 1;

        for (;;) {
            if (fa * fb < 0) {
                c = ((a * fb) - (b * fa)) / (fb - fa);
                fc = 3 * c - Math.cos(c) - 1;

                result.add(c);

                if (fa * fc <= 0) {
                    b = c;
                } else {
                    a = c;
                }

            } else {
                System.out.println("Value is invalid");
                break;
            }

            int ln = result.size();
            int flag = 0;

            for (int m = 0; m < ln; m++) {
                if (result.get(m).equals(c)) {
                    flag++;
                }
            }

            if (flag > 1) {
                break;
            }
        }
        return (c);

    }
}
