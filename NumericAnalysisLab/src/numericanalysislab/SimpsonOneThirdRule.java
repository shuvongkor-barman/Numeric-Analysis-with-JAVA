package numericanalysislab;

import java.util.Arrays;
import java.util.Scanner;

public class SimpsonOneThirdRule {

    public String simpson13() {

        System.out.println("*** Simpons 1/3 Rule ***");
        System.out.println("The Given Funcion ∫ logx dx; limit(4, 5.2)");
        Scanner sc = new Scanner(System.in);
        double a = 4;
        double b = 5.2;

        System.out.println("Enter the number of parts: ");
        int n = sc.nextInt();
        double deltaX = (b - a) / n;
        System.out.println(deltaX);

        double[] xIndex = new double[n + 1];

        for (int i = 0; i < n + 1; i++) {
            xIndex[i] = a + (i * deltaX);
        }
        System.out.println(Arrays.toString(xIndex));

        double[] y = new double[n + 1];

        for (int i = 0; i < n + 1; i++) {
            y[i] = Math.log(xIndex[i]);
        }

        System.out.println(Arrays.toString(y));

        double fx = y[0] + y[y.length - 1];

        for (int i = 1; i < n; i++) {

            if (i % 2 == 0) {
                fx += 2 * y[i];

            } else {
                fx += 4 * y[i];
            }
        }

        fx *= deltaX / 3;

        System.out.println("Answer = " + fx);
        return "";
    }

}
