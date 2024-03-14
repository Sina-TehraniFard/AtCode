import java.util.Scanner;

public class WelcomeToAtCoder {
    public static void main(String[] args) {
        //標準入力
        Scanner sc = new Scanner(System.in);

        //整数a
        int a = sc.nextInt();
        //整数b
        int b = sc.nextInt();
        //整数c
        int c = sc.nextInt();
        //文字列
        String s = sc.next();

        System.out.println(a + b + c + " " + s);

    }
}
