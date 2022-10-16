package Step61to70;

import java.util.Scanner;



public class Step66 {
    public static void check(int a){
        if(a%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        check(a);
        check(b);
        check(c);
    }
}
