package even_odd_plus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[] {"짝수", "홀수"};
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a % 2 == 0) {
            if (b % 2 == 0)
                System.out.print(str[0] + "+" + str[0]);
            else
                System.out.print(str[0] + "+" + str[1]);
        } else {
            if (b % 2 == 0)
                System.out.print(str[1] + "+" + str[0]);
            else
                System.out.print(str[1] + "+" + str[1]);
        }

        if ((a + b) % 2 == 0)
            System.out.println("=" + str[0]);
        else
            System.out.println("=" + str[1]);
   }
}
