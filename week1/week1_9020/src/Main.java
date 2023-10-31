import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] prime = primeNum(10000);
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] value = new int[count];
        // 1인 경우를 빼는 것이 더 빠르다.
        for(int i=0; i<count; i++){
            value[i] = scanner.nextInt();
        }
        for(int i=0; i<count; i++){
            int x = value[i]/2;
            while(true){
                if(prime[x] == 0){
                    if(prime[value[i]-x] == 0) {
                        System.out.println(x + " " + (value[i] - x));
                        break;
                    }
                }
                x--;
            }
        }
    }

    // 에라스토테네스를 구현할 때 루트값까지만 곱을 구하면 모든 소수를 구할 수 있다.
    public static int[] primeNum(int n) {
        int[] pNum = new int[n];
        for (int i = 2; i < pNum.length; i++) {
            if (pNum[i] == 0) {
                for (int j = 2; j * i < pNum.length; j++) {
                    pNum[i * j] = 1;
                }
            }
        }
        return pNum;
    }

}