package comp1110.homework.J05;

import java.util .Scanner;

public class Movie {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int length = sc.nextInt();

        int hour = length / 60;
        int minute = length % 60;
        if(hour == 0){
            if(minute == 1){
                System.out.println(name + " runs for 1 minute");
            }
            else if(minute > 1){
                System.out.println(name + " runs for " + minute + " minutes");
            }
        }
        else if(hour == 1){
            if(minute == 0){
                System.out.println(name + " runs for 1 hour");
            }
            else if(minute == 1){
                System.out.println(name + " runs for 1 hour and 1 minute");
            }
            else if(minute > 1){
                System.out.println(name + " runs for 1 hour and " + minute + " minutes");
            }
        }
        else if(hour > 1){
            if(minute == 0){
                System.out.println(name + " runs for " + hour + " hours");
            }
            else if(minute == 1){
                System.out.println(name + " runs for " + hour + " hours" + " and 1 minute");
            }
            else if(minute > 1){
                System.out.println(name + " runs for " + hour + " hours" + " and " + minute + " minutes");
            }
        }
    }
}
