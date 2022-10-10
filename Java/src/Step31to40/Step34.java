package Step31to40;

import java.util.Scanner;

public class Step34 {
    //parseInt(n, 진수)는 n을 진수로 변형하고 10진수로 출력한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(Integer.parseInt(s, 8));
    }
}
