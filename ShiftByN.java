package week7;

import java.util.ArrayList;
import java.util.Scanner;

public class ShiftByN {
    public static void main(String[] args) {
        System.out.println("Enter your numbers, press return to end.");
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> numArr=new ArrayList<>();
        String input=" ";
        while (!input.equals("")) {
            input = scanner.nextLine();
            try {
                Integer input1 = Integer.parseInt(input);
                numArr.add(input1);
            }catch (Exception e){
                if(!input.equals(""))
                    System.out.println("Not a legal number. Try again!");}

        }
        System.out.println("Enter N:");
        int shift=scanner.nextInt();
        for (int i = 0; i <numArr.size() ; i++) {
            shift=shift%numArr.size();
            int a= i+numArr.size()-shift;

            if(a<numArr.size())
                System.out.print(numArr.get(i+numArr.size()-shift)+" ");
            else System.out.print(numArr.get(i-shift)+" ");

        }
    }
}
