import java.util.Scanner;

/**
 * 2024年3月15日
 *
 * @author テヘラニファルド スィナ<br>
 * 問題文参照：<a href="https://atcoder.jp/">AtCode</a><br>
 * 整数 a,b,cと、文字列 s が与えらた場合に<br>
 * a+b+c の計算結果と、文字列 s を並べて表示するプログラム。
 */
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
