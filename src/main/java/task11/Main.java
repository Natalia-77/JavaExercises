package task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter symbol:");
            char c = sc.next().charAt(0);
            System.out.println("Enter line lengths: ");
            int len= sc.nextInt();
            System.out.println("Orientation: horizontal-1,vertical-2");
            int choose=sc.nextInt();
            switch (choose) {
                case 1:
                    for (int i = 0; i < len; i++) {
                        System.out.print(c);
                    }
                    break;

                case 2:
                    for (int i = 0; i < len; i++) {
                        System.out.println(c);
                    }
                    break;
                default:
                    System.out.println("Incorrect choice");
            }


    }
}
