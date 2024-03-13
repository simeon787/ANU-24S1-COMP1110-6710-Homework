package comp1110.homework.J06;

import java.util.Arrays;
import java.util.Scanner;

    public class Permute {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            if(s1.length() != s2.length()){
                System.out.println("No");
            }
            else{
                Arrays.sort(c1);
                Arrays.sort(c2);
                for(int i = 0; i < c1.length; i ++){
                    if(c1[i] != c2[i]){
                        System.out.println("No");
                        break;
                    }
                    if(i == c1.length - 1){
                        System.out.println("Yes");
                    }
                }
            }
        }
}
