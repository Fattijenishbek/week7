package week7;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=input.nextInt();
        double [] arr= new double[n];
        for (int i = 0; i <n; i++) {
            double num = input.nextDouble();
            arr[i]=num;
        }
        Arrays.sort(arr);
        System.out.print(arr[1]);

    }
}
