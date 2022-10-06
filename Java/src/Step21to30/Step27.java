package Step21to30;

import java.util.Scanner;

public class Step27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        //str = str.replace(".","-");

        String[] list = str.split("[.]");

        for(int i = list.length - 1; i >= 0;i--){
            System.out.print(list[i]);
            if(i > 0){
                System.out.print("-");
            }
        }
    }
}
