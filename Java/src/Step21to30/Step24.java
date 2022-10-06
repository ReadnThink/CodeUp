package Step21to30;

import java.util.Scanner;

public class Step24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

//        String[] list = str.split("[.]");
        for(int i = 0; i < str.length(); i++){
            System.out.println("'"+ str.charAt(i) +"'");
        }

    }
}
