package numericanalysislab;

import java.util.Scanner;

public class NumericAnalysis {

    public static void main(String[] args) {

        BisectionMethod BM = new BisectionMethod();
        RegulaFalsiMethod RFM = new RegulaFalsiMethod();
        NewtonRaphsonMethod NRM = new NewtonRaphsonMethod();
        NewtonForward NF = new NewtonForward();
        NewtonBackward NB = new NewtonBackward();
        NewtonDividedDifference NDD = new NewtonDividedDifference();
        LagrangeInterpolation LI = new LagrangeInterpolation();
        TrapezoidalRule TR = new TrapezoidalRule();
        SimpsonOneThirdRule SM13 = new SimpsonOneThirdRule();
        SimpsonThreeByEightRule SM38 = new SimpsonThreeByEightRule();
        WeddlisRule WR = new WeddlisRule();

        System.out.println("***Program List***");
        
        System.out.println("Enter 1 for BisectionMethod");
        System.out.println("Enter 2 for RegularFalsiMethod");
        System.out.println("Enter 3 for NewtonRaphsonMethod");
        System.out.println("Enter 4 for Newton Forward Interpolation");
        System.out.println("Enter 5 for Newton Backward Interpolation");
        System.out.println("Enter 6 for Newton Divided Difference");
        System.out.println("Enter 7 for Lagranges Interpolation");
        System.out.println("Enter 8 for Trapezoidal Rule for Numeric Integration ");
        System.out.println("Enter 9 for Simpson's 1/3 Rule ");
        System.out.println("Enter 10 for Simpson's 3/3 Rule ");
        System.out.println("Enter 11 for Weddle's Rule ");
        

        System.out.println("Enter 12 for Exit ");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Choice:  ");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print(" " + BM.theBisectionMethod());
                break;

            case 2:
                System.out.print("The Root Using Regular Falsi Method is: " + RFM.theRegulaFalsiMethod());
                break;

            case 3:
                System.out.print("The Root Using NewtonRaphsonMethod is: " + NRM.theNewtonRaphsonMethod());
                break;

            case 4:
                System.out.print(NF.newtonForward());
                break;

            case 5:
                System.out.print(NB.newtonBackward());
                break;
            case 6:
                System.out.print(NDD.newtonDD());
                break;

            case 7:
                System.out.print(LI.lagrangeInerpolation());
                break;

            case 8:
                System.out.print(TR.trapezoidal());
                break;

            case 9:
                System.out.print(SM13.simpson13());
                break;

            case 10:
                System.out.print(SM38.simson38());
                break;
            case 11:
                System.out.print(WR.weddle());
                break;

            case 12:
                System.exit(0);

            default:
                System.out.println("Invaid Choice");

        }

    }
}
