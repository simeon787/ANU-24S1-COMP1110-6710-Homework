package comp1110.homework.J05;

import java.util.Scanner;

public class Odd {

    public static boolean isOdd(int i) {
        int j = i % 2;
        if (j != 0) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(isOdd(x)){
            System.out.println(x + " is odd");
        }
        else{
            System.out.println(x + " is even");
        }
    }
}
