package even_odd_plus;

import java.util.Scanner;

public class Main {
    public static String getEvenOdd(int num){
        if (num % 2 == 0)
            return "짝수";
        else
            return "홀수";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[] {"짝수", "홀수"};
        int firstNum = sc.nextInt();
        int secNum = sc.nextInt();


        String strFist = getEvenOdd(firstNum);
        String strSec = getEvenOdd(secNum);
        String strSum = getEvenOdd(firstNum + secNum);

        System.out.printf("%s+%s=%s", strFist,strSec,strSum);

//        if(firstNum % 2 == 0) {
//            if (secNum % 2 == 0)
//                System.out.print(str[0] + "+" + str[0]);
//            else
//                System.out.print(str[0] + "+" + str[1]);
//        } else {
//            if (secNum % 2 == 0)
//                System.out.print(str[1] + "+" + str[0]);
//            else
//                System.out.print(str[1] + "+" + str[1]);
//        }
//
//        if (sumNum % 2 == 0)
//            System.out.println("=" + str[0]);
//        else
//            System.out.println("=" + str[1]);
   }
}
