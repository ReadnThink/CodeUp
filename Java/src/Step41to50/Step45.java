package Step41to50;

import java.util.Scanner;

public class Step45 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();

        int plus = a+b;
        int min = a-b;
        int mul = a*b;
        int mok= a/b;
        int remain = a%b;
        double div = (double)a/(double)b;

        System.out.println(plus);
        System.out.println(min);
        System.out.println(mul);
        System.out.println(mok);
        System.out.println(remain);
        System.out.println(String.format("%.2f",div));
    }
}