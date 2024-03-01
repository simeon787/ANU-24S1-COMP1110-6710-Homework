package comp1110.homework.J06;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x == 2) {
            System.out.println(2);
        }

        else if(x >= 2){
            System.out.println(2);

            for (int i = 3; i <= x; i++) {
                for (int j = 2; j < i; j++) {
                    if ((i % j) == 0) {
                        break;
                    }
                    if (j == i - 1) {
                        System.out.println(i);
                    }
                }

            }

        }
    }
}
