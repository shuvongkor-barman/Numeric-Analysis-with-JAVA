package numericanalysislab;

import java.util.Arrays;
import java.util.Scanner;

public class NewtonForward {

    public static int fact(int n) {
        int factorial = 1;
        if (n == 0) {
            factorial = 1;
        }
        for (int i = 1; i <= n; i++) {

            factorial = factorial * i;
        }
        return factorial;
    }

    public String newtonForward() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Newton Forward Interpolation Formula ***");
        System.out.print("Enter the Number of Terms: ");
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        int row = n - 1, column = n - 1;

        int[][] deltaY = new int[row][column];

        System.out.println("Enter all the x, y terms: ");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        System.out.println("x = {" + Arrays.toString(x) + "}");
        System.out.println("x = {" + Arrays.toString(y) + "}");

        System.out.print("Enter a point to Find it's value: ");
        int xPoint = sc.nextInt();
        // End of inputs

        // Start Calculation
        int h = x[1] - x[0];
        int x0 = x[0];
        double p = (xPoint - x0) / (double) h;
        // End of all calculaton except Y

        // Delta Y calculation
        int flag = 0;
        for (int i = 0; i < n - 1; i++) {
            deltaY[i][0] = y[i + 1] - y[i];
            flag++;   // flag is 4
        }

        // Delta 2 Y Calculation and so on
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < flag - 1; j++) {
                deltaY[j][i + 1] = deltaY[j + 1][i] - deltaY[j][i];
            }
            flag--;
        }

        double yp = y[0];
        double pValue = 1.0;
        
        for (int k = 0; k < n - 1; k++) {
            pValue *= p - (k + 1) + 1;
            yp += (pValue / (double) fact(k + 1)) * deltaY[0][k];
        }
        System.out.println("Tha Value at " + xPoint + " is = " + yp);
        
        
        return "";

    }
}
