import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] prime = primeNum(10000);
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] value = new int[count];
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