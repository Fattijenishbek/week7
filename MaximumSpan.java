package week7;


import java.util.Scanner;
import java.util.NoSuchElementException;
public class MaximumSpan{
    public static void main(String[] args)
    {
        //enter your code here...
        Scanner in = new Scanner(System.in);
        String array="";
        String input = in.nextLine().trim();

        boolean g= true;
        try{
            while(g){
                if (input.length()>1)input=input.substring(0,1);
                array+=input;
                array+=" ";
                input=in.nextLine().trim();
            }}catch (NoSuchElementException e){
            g=false;
        }

        // Character.isLetterOrDigit()
        int max=1+(array.lastIndexOf(array.charAt(0))-array.indexOf(array.charAt(0)))/2;
        for (int i = 1; i < array.length(); i++) {
            if (Character.isLetterOrDigit(array.charAt(i)) & max<1+(array.lastIndexOf(array.charAt(i))-array.indexOf(array.charAt(i)))/2){
                max=1+(array.lastIndexOf(array.charAt(i))-array.indexOf(array.charAt(i)))/2;
            }
        }
        System.out.println(max);
    }
}