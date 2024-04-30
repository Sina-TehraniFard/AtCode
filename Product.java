import java.util.Scanner;

/**
 * 2024年4月30日
 *
 * @author テヘラニファルド スィナ<br>
 * 問題文参照：<a href="https://atcoder.jp/">AtCode</a><br>
 * シカのAtCoDeerくんは二つの正整数 a,b を見つけました。<br>
 * a と b の積が偶数か奇数か判定してください。
 */
public class Product {
    public static void main(String[] args) {
        //標準入力：入力形式（a b）
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 積が奇数なら Odd と、 偶数なら Even と出力する。
        int result = (a * b) % 2;
        if (result == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
