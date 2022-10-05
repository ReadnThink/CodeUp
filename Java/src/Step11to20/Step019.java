package Step11to20;

import java.util.Scanner;

public class Step019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Calendar = sc.next();
        String[] splits = Calendar.split("\\.");
        int a = Integer.valueOf(splits[0]);
        int b = Integer.valueOf(splits[1]);
        int c = Integer.valueOf(splits[2]);

        System.out.printf("%04d.%02d.%02d", a, b, c);
    }
}
