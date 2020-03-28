package week7;

import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
        String [] arr = input.nextLine().trim().split(" ");


        int c=0;
        for (int i = 1; i <10 ; i++) {
            int sum1 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += Integer.parseInt(arr[j]);
            }
            int summ2 = 0;
            for (int j = i; j < 10; j++) {
                summ2 += Integer.parseInt(arr[j]);
            }
            c = 1;
            if (sum1 == summ2) {
                System.out.println("Can be balanced");
                c = 0;
                break;
            }


        }if (c==1){
            System.out.println("Can not be balanced");
        }}catch (Exception e){
            System.out.println("Error");
        }
    }
}
