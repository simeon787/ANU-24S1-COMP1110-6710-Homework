package comp1110.homework.J05;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String grade;
        if ((score >= 0) & (score <= 49)) {
            grade = "N";
        }
        else if ((score >= 50)&(score <= 59)) {
            grade = "P";
        }
        else if ((score >= 60)&(score <= 69)){
            grade = "C";
        }
        else if ((score >= 70)&(score <= 79)) {
            grade = "D";
        }
        else if ((score >= 80)&(score <= 100)) {
            grade = "HD";
        }
        else {
            grade = "Bad mark";
        }

        System.out.println(grade);
    }

}