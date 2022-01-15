package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();

        String[] res;
        res = swap(number);
        if (res == null) {
            System.out.println("Enter only 6 characters...");
        } else {
            System.out.println("Result is: ");
            for (String s : res) {
                System.out.print(s);
            }
        }
    }

    public static String[] swap(int num) {

        String[] subStr;
        String stroka = Integer.toString(num);
        String str = "";
        subStr = stroka.split(str);
        for (int i = 0; i < subStr.length; i++) {

            System.out.print(subStr[i]);
        }
        System.out.println();
        String first = subStr[0];
        String second = subStr[1];
        subStr[0] = subStr[subStr.length - 1];
        subStr[subStr.length - 1] = first;
        subStr[1]=subStr[4];
        subStr[4]=second;

        if (subStr.length > 6) {
            return null;
        } else {
            return subStr;
        }


    }
}
