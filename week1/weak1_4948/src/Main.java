import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while((x=sc.nextInt()) != 0){
            System.out.println(pNum(x));
        }
    }
    public static int pNum(int n){
        if(n == 1) return 1;
        int count = 0;
        int[] value = new int[2*n];
        for(int i=2; i<value.length; i++){
            if(value[i]==0){
                if(i>n) count++;
                for (int j = 1; j * i <value.length; j++) {
                    value[i*j] = 1;
                }
            }
        }
        return count;

    }
}