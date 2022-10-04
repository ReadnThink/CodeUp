package Multiple;

import java.util.Scanner;

class Multiple{
    int num;

    Multiple(int num){
        this.num = num;
    }

    void isMultiple(){
        if (num % 7 == 0)
            System.out.println("multiple");
        else
            System.out.println("not multiple");
    }


}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Multiple multiple = new Multiple(num);
        multiple.isMultiple();

    }
}
