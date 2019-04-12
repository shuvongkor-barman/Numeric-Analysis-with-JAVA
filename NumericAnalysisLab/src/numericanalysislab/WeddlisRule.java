package numericanalysislab;

import java.util.Arrays;
import java.util.Scanner;

public class WeddlisRule {

    public String weddle()  {

        System.out.println("*** Wededle's Rule ***");
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

            if (i % 2 == 0) {

                result += fx[i];
            } else if (i == 1) {
                result += 5 * fx[i];
            } else if (i == 5) {
                result += 5 * fx[i];
            } else if (i == 9) {
                result += 5 * fx[i];
            } else if (i == 3) {
                result += 6 * fx[i];
            } else if (i == 7) {
                result += 6 * fx[i];
            }

        }

        result *= (deltaX * 3) / 10;

        System.out.println("Answer = " + result);
        return "";
    }

}
