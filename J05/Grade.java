package comp1110.homework.J05;

import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String grade = "Bad mark";
        if(i >= 0 & i <= 49){grade = "N";}
        else if(i >= 50 & i<= 59){grade = "P";}
        else if(i >= 60 & i <= 69){grade = "C";}
        else if(i >= 70 & i <= 79){grade = "D";}
        else if(i >= 80 & i <= 100){grade = "HD";}
        System.out.println(grade);
    }
}