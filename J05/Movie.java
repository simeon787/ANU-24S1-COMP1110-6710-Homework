package comp1110.homework.J05;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int length = sc.nextInt();
        if(length == 1){
            System.out.println(name + " runs for 1 minute");
        }
        else if(length < 60){
            System.out.println(name + " runs for " + length + " minutes");
        }
        else if(length == 60){
            System.out.println(name + " runs for 1 hour");
        }
        else if(length == 61){
            System.out.println(name + " runs for 1 hour and 1 minute");
        }
        else if(length > 61 & length < 119){
            System.out.println(name + " runs for 1 hour and " + length % 60 + " minutes");
        }
        else if(length % 60 == 0 & length >= 120){
            System.out.println(name + " runs for " + length / 60 + " hours");
        }
        else if(length % 60 == 1 & length >= 120){
            System.out.println(name + " runs for " + (int)(length / 60) + " hours and 1 minute");
        }
        else if(length % 60 > 1 & length >= 120){
            System.out.println(name + " runs for " + (int)(length / 60) + " hours and " + length % 60 + " minutes");
        }
    }
}