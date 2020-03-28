package week7;

import java.util.Scanner;

public class MaxSpan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = 0;
        while (c == 0) {
            String num = input.nextLine().trim();

            if (num.equals("")) {
                c = 1;
                break;
            } else c = 0;
        }
    }
}
