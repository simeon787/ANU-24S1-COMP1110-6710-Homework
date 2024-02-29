package comp1110.homework.J04;

import java.util.Scanner;

public class Name {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = name.toUpperCase();
        System.out.println(name);
        System.out.println(name.length());

    }
}
