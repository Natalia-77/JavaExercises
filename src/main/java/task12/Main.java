package task12;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = 100 - random.nextInt(200);
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("Sort by growth enter 1");
        System.out.println("Sort by descending enter 2");
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        switch (result) {
            case 1:
                arraySortByGrown(array);
                for (int item : array
                ) {
                    System.out.println(item);
                }
                break;
            case 2:
                arraySortByDesc(array);
                for (int item : array
                ) {
                    System.out.println(item);
                }
                break;
            default:
                System.out.println("Incorrect choice");
        }
    }

    public static int[] arraySortByGrown(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] arraySortByDesc(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
