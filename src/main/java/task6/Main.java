package task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp  = new Scanner(System.in);
        System.out.println("Enter meter:");
        int meter = 0,params;
        while (!inp.hasNext("w")) {
            meter = inp.nextInt();
            System.out.println("Choose second parameter:");
            System.out.println("1-miles, 2-inch, 3-yard");
            double mileRes=meter * 0.000621371192;
            double inchRes = meter * 39.37;
            double yardRes = meter * 1.094;
            params= inp.nextInt();
            switch (params) {
                case 1:
                    String resMile = String.format("%.3f",mileRes);
                    System.out.println(resMile);
                    break;
                case 2:
                    String resInch = String.format("%.3f",inchRes);
                    System.out.println(resInch);
                    break;
                case 3:
                    String resYard = String.format("%.3f",yardRes);
                    System.out.println(resYard);
                    break;
                default:
                    System.out.println("Incorrect param...");

            }
        }

    }
}
