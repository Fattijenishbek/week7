package week7;

import java.util.ArrayList;
import java.util.Scanner;

public class ShiftByN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter your numbers, press return to end.");
        String s=input.nextLine();
        arr.add(Integer.parseInt(s));
        while (s!=""){
            try{
                int num=input.nextInt();
                arr.add(num);
            }catch (Exception e){
                System.out.println("Not a legal number. Try again!");
                break;
            } continue;
            
        }
        System.out.println(arr);
    }


}
