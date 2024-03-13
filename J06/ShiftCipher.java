package comp1110.homework.J06;


//  A~Z : 65~90
//  a~z : 97~122

import java.util.Scanner;

public class ShiftCipher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String plaintext = sc.nextLine();
        int shift_value = sc.nextInt();
        char[] c = plaintext.toCharArray();

        int l = plaintext.length();
        for(int i = 0; i < l; i++) {
            if((c[i] >= 'A') & (c[i] <= 'Z')){
                if(c[i] + shift_value <= 'Z'){
                    c[i] += (char) shift_value;
                }
                else{
                    c[i] = (char) (c[i] + shift_value - 'Z' + 'A' - 1);
                }
            } else if((c[i] >= 'a') & (c[i] <= 'z')){
                if(c[i] + shift_value <= 'z'){
                    c[i] += (char) shift_value;
                }
                else{
                    c[i] = (char) (c[i] + shift_value - 'z' + 'a' - 1);
                }
            }
        }
        String ciphertext = new String(c);
        System.out.println(ciphertext);
    }
}