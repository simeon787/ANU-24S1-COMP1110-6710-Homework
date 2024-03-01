package comp1110.homework.J06;

import java.util.Arrays;
import java.util.Scanner;

public class Permute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();

        char []a = x.toCharArray();
        char []b = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(x.length() == y.length()){
            for(int i = 0;i < x.length();i ++){
                if(a[i] != b[i]){
                    System.out.println("No");
                    break;
                }
                else if(i == x.length() - 1){
                    System.out.println("Yes");
                }

            }
        }
        else{
            System.out.println("No");
        }
    }

}
