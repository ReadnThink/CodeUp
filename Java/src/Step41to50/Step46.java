package Step41to50;

import java.util.Scanner;

public class Step46 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int plus = a+b+c;

        double avg = (double)plus/3;

        System.out.println(plus);

        System.out.println(String.format("%.1f",avg));
    }
}