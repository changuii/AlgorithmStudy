import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int value = 0;
        for(int i=1; i <= x; i++)
            value += i;
        System.out.println(value);
    }
}