package comp1110.homework.J04;

import java.util.Scanner;
import java.util.Scanner;

public class ShoeSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float i = sc.nextFloat();
        int s = (int)Math.round(i * 5.0);
        System.out.println(s);
    }

}
