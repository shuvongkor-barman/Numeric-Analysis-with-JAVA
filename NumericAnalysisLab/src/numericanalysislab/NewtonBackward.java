package numericanalysislab;

import java.util.Arrays;
import java.util.Scanner;

public class NewtonBackward {

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

    public String newtonBackward() {
        System.out.println("*** Newton Backward Interpolation ");
        Scanner sc = new Scanner(System.in);
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
        int xn = x[x.length - 1];
        double p = (xPoint - xn) / (double) h;
        // End of all calculaton except Y

        // Delta Y calculation
        int flag = 0;
        for (int i = 0; i < n - 1; i++) {
            deltaY[i][0] = y[i + 1] - y[i];
            flag++;   // flag is 4
        }

        // Delta 2 Y and so on
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < flag - 1; j++) {
                deltaY[j][i + 1] = deltaY[j + 1][i] - deltaY[j][i];
            }
            flag--;
        }
        System.out.println(Arrays.deepToString(deltaY));

        int[] lastNZE = new int[deltaY.length];
        for (int i = 0; i < deltaY.length - 1; i++) {
            for (int j = deltaY.length - 1; j >= 0; j--) {
                int check = deltaY[j][i];
                if (!(check == 0)) {
                    lastNZE[i] = deltaY[j][i];
                    break;
                }
            }
        }

        double yp = y[y.length - 1];
        double pValue = 1.0;

        for (int k = 0; k < n - 1; k++) {
            pValue *= p + (k + 1) - 1;
            yp += (pValue / (double) fact(k + 1)) * lastNZE[k];
        }
        System.out.println("Tha value at "+ xPoint + " is = " + yp);
        
        return "";
    }
}
