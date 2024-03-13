package comp1110.homework.J06;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int n = 2; n <= i; n = n + 2) {
            System.out.println(n);
        }
    }

}
