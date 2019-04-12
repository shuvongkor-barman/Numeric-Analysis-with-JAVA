package numericanalysislab;

import java.util.Arrays;
import java.util.Scanner;

public class NewtonDividedDifference {

    public String newtonDD() {
        System.out.println("*** Newton Divided Differnce Formula ***");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Terms: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] fx = new int[n];
        int row = n - 1, column = n - 1;
        int[][] deltaFx = new int[row][column];

        System.out.println("Enter all the x, fx terms: ");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            fx[i] = sc.nextInt();
        }

        System.out.println("x = {" + Arrays.toString(x) + "}");
        System.out.println("fx = {" + Arrays.toString(fx) + "}");

        System.out.print("Enter the number of points to Calculate values: ");
        int pn = sc.nextInt();
        int[] xPoint = new int[pn];

        for (int i = 0; i < pn; i++) {
            System.out.print("Enter point " + (i + 1) + ": ");
            xPoint[i] = sc.nextInt();
        }

        // First Delta Fx calucation
        int loopCount = 0;
        for (int j = 0; j < row; j++) {
            deltaFx[j][0] = (fx[j + 1] - fx[j]) / (x[j + 1] - x[j]);
            loopCount++;
        }

        // Second Delta Fx calucation and so on
        int gap = 1;
        for (int i = 0; i < column - 1; i++) {
            for (int j = 0; j < loopCount - 1; j++) {
                deltaFx[j][i + 1] = (deltaFx[j + 1][i] - deltaFx[j][i]) / (x[j + 1 + gap] - x[j]);
            }
            loopCount--;
            gap++;
        }

        // Calculating Final Result
        for (int m = 0; m < pn; m++) {
            double result = fx[0];
            double xEs = 1;

            for (int i = 0; i < column; i++) {
                xEs *= xPoint[m] - x[i];
                result += xEs * deltaFx[0][i];
            }

            System.out.println("f(" + xPoint[m] + ") = " + result);
            result = fx[0];
        }
    
    
        return "";
    }
}
