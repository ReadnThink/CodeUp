package Step61to70;

import java.util.Scanner;

public class Step64 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int Min = a > b ? b : a;
        System.out.println(Min < c ? Min : c);
    }
}
