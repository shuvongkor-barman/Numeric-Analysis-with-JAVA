package numericanalysislab;

import java.util.Arrays;
import java.util.Scanner;

public class SimpsonThreeByEightRule {

    public String simson38() {

        System.out.println("*** Simpons 3/8 Rule ***");
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

        double[] fx = new double[n + 1];

        for (int i = 0; i < n + 1; i++) {
            fx[i] = Math.log(xIndex[i]);
        }

        System.out.println(Arrays.toString(fx));

        double result = fx[0] + fx[fx.length - 1];

        for (int i = 1; i < n; i++) {

            if (i % 3 == 0) {
                result += 2 * fx[i];

            } else {
                result += 3 * fx[i];
            }
        }

        result *= (deltaX * 3) / 8;

        System.out.println("Answer = " + result);
        return "";
    }

}
