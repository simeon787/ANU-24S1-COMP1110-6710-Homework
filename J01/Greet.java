package comp1110.homework.J01;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(
                "Hi " + s + "!"
        );
    }


}
