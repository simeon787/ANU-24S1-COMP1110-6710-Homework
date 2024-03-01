package comp1110.homework.J06;

import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n == 1){
            System.out.println(1);
        }
        else{
            while(n >= 2){
            int m = n % 2;
            if(m == 1){
                count ++;
            }
            n = n / 2;
            if(n == 1){
                count ++;
            }
            }
            System.out.println(count);
        }
    }
}
