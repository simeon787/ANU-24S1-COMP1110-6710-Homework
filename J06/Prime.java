package comp1110.homework.J06;

import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i >= 2){
            System.out.println(2);
            for(int n = 3; n <= i; n ++){
                for(int m = 2; m < n; m ++){
                    if(n % m == 0){
                        break;
                    }
                    if(m == n - 1){
                        System.out.println(n);
                    }
                }
            }
        }
    }
}