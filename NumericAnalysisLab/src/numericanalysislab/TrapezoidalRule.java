package numericanalysislab;

import java.util.Arrays;
import java.util.Scanner;

public class TrapezoidalRule {

    public String trapezoidal() {

        System.out.println("***Trapezoidal Rule for Numerical Integration***");
        System.out.println("The Given Funcion ∫ 1/x dx; limit(1 - 2)");
        Scanner sc = new Scanner(System.in);
        double a = 1;
        double b = 2;

        System.out.println("Enter the number of parts: ");
        int n = sc.nextInt();
        double deltaX = (b - a) / n;

        double[] xIndex = new double[n + 1];

        for (int i = 0; i < n + 1; i++) {
            xIndex[i] = a + (i * deltaX);
        }

        double[] fIndex = new double[n + 1];

        for (int i = 0; i < n + 1; i++) {
            fIndex[i] = 1 / xIndex[i];
        }

        double result = fIndex[0] + fIndex[fIndex.length - 1];

        for (int i = 1; i < n; i++) {

            result += 2 * (fIndex[i]);
        }

        result *= deltaX / 2;

        System.out.println("Our Numerical Integration Result is: "+ result);

        return "";
    }

}
