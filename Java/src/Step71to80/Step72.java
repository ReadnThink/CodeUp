package Step71to80;

import java.util.Scanner;

public class Step72 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m[]=new int[n];

        for(int i=0;i<n;i++) {

            m[i]=sc.nextInt();

        }

        for(int i=0;i<n;i++) {

            System.out.println(m[i]);
            }
    }
}
