package Step21to30;

import java.util.Scanner;

public class Step23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] list = str.split("[.]");

        System.out.println(list[0]);
        System.out.printf(list[1]);

    }
}
