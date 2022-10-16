package Step61to70;

import java.util.Scanner;


public class Step67 {
    public static void checkEven(int a){
        checkPlus(a);
        if(a%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
    public static void checkPlus(int a){
        if(a>0){
            System.out.println("plus");
        }
        else {
            System.out.println("minus");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a= sc.nextInt();

        checkEven(a);

    }
}
