package Step31to40;

import java.util.Scanner;

public class Step35 {
    //parseInt(n, 진수)는 n을 진수로 변형하고 10진수로 출력한다.
    // Integer 클래스의 toBinaryString, toOctalString, toHexString 함수를 사용하면 각각 2진수,8진수 16진수로 변환해줍니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(Integer.toOctalString(Integer.parseInt(s, 16)));
    }
}
