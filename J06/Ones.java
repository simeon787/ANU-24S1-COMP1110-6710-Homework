package comp1110.homework.J06;

import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int num = 0;
        while(i >= 2){
            if(i % 2 == 1){
                num ++;
            }
            i = (int)(i / 2);
        }
        if(i == 1){
            num ++;
        }
        System.out.println(num);
    }

}
