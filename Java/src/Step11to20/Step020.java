package Step11to20;

import java.util.Scanner;

public class Step020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Num = sc.next();
        String[] splits = Num.split("\\-");
        int a = Integer.valueOf(splits[0]);
        int b = Integer.valueOf(splits[1]);

        System.out.printf("%06d%d", a, b);
    }
}
