package Step21to30;

import java.util.Scanner;

public class Step26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String list[] = str.split("[:]");
        if(list[1].charAt(0) == '0'){
            System.out.println(list[1].charAt(1));
        }else
            System.out.println(list[1]);
    }
}
