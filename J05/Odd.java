package comp1110.homework.J05;

import java.util.Scanner;
public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(isOdd(i)){
            System.out.println(i + " is odd");
        }
        else{
            System.out.println(i + " is even");
        }
    }
    public static boolean isOdd(int i){
        if(i == 0){
            return false;
        }
        else{
            if(i % 2 == 0){
                return false;
            }
            else{
                return true;
            }
        }
    }
}
