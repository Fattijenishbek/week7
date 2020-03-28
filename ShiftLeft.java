package week7;

import java.util.ArrayList;
import java.util.Scanner;

public class ShiftLeft {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums=new ArrayList<>();
        System.out.println("Enter your numbers, press return to end.");
        String num = " ";
        while (!num.equals("")){
            num = input.nextLine();
            try{
                nums.add(Integer.parseInt(num));
            }catch (Exception e){
                if(!num.equals("")){
                    System.out.println("Not a legal number. Try again!");}
            }

        }
        System.out.println("Enter N:");


        int step=0;
        int shift=input.nextInt();
        if (nums.size()>0){
            if (shift>nums.size()){
                step=shift%nums.size();
            }else step=shift;

            for (int i = step; i <nums.size(); i++) {
                System.out.print(nums.get(i)+" ");
            }
            for (int i = 0; i <step ; i++) {
                System.out.print(nums.get(i)+" ");}
        }
    }
}
