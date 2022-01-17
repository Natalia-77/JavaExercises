package task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        Random random = new Random();
        List<Integer> positive= new ArrayList<>();
        List<Integer> negative= new ArrayList<>();
        List<Integer> multiply= new ArrayList<>();
        List<Integer> nonMultiply= new ArrayList<>();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
            arr[i] = 100 - random.nextInt(200);
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();

        for(int j=0;j<arr.length;j++){
            if(arr[j]>0){

                positive.add(arr[j]);
            }
            if(arr[j]<0){
                negative.add(arr[j]);
            }
            if(arr[j]%2==0){
                multiply.add(arr[j]);
            }
            if(arr[j]%2!=0){
                nonMultiply.add(arr[j]);
            }
        }
        System.out.println("Positive elements list:");
        for (Integer item:positive) {
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.println("Negative elements list:");
        for (Integer item:negative) {
            System.out.print(item+" ");

        }
        System.out.println();
        System.out.println("Multiply elements list:");
        for (Integer item:multiply) {
            System.out.print(item+" ");

        }
        System.out.println();
        System.out.println("Non-Multiply elements list:");
        for (Integer item:nonMultiply) {
            System.out.print(item+" ");

        }
    }
}
