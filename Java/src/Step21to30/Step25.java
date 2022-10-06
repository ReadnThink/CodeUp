package Step21to30;

import java.util.Scanner;

public class Step25 {

    public static void multi(int num, int length){
        int multiple = 1;
        length--;
        while(length != 0){
            multiple *= 10;
            length--;
        }
        System.out.println("[" + num * multiple + "]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int length = str.length();
        int[] num = new int[length];

        for(int i = 0; i < str.length(); i++){
            num[i] = str.charAt(i) - '0';

            multi(num[i], length--);
        }



    }
}
