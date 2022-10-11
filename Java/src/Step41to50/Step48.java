package Step41to50;

import java.util.Scanner;

public class Step48 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c = 2;

        if(b > 0) {
            while (b > 1) {
                c *= 2;
                b--;
            }
            a = a * c;
        }
        System.out.println(a);
    }
}