package task9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int n = 30, positive = 0, negative = 0, zero = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = 100 - random.nextInt(200);
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();

        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negative++;
            }
            if (arr[i] > 0) {
                positive++;
            }
            if (arr[i] == 0) {
                zero++;
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimal:  " + min);
        System.out.println("Max:  " + max);
        System.out.println("Positive:  " + positive);
        System.out.println("Negative:  " + negative);
        if (zero > 0)
            System.out.println("Zero:  " + zero);
        else {
            System.out.println("There isn't zero elements");
        }
    }
}
