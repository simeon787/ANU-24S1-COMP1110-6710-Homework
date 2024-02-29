package comp1110.homework.J04;


import java.util.Scanner;

public class ShoeSize {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float height = sc.nextFloat();
        double shoesize = height * 5.0;
        int x = (int)Math.round(shoesize);
        System.out.println(x);

    }
}
