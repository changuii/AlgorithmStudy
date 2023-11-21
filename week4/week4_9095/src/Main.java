import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        while (x-- > 0) {
            int count[] =new int[Integer.parseInt(br.readLine())+1];
            System.out.println(plus(count.length-1, count));
        }
    }
    public static int plus(int n, int[] count){
        if(n == 0)
            return 1;
        else if(n == 1)
            return count[n] = 1;
        else if(n == 2)
            return count[n] = 2;
        if(count[n] != 0){
            return count[n];
        }

        return count[n] = plus(n-1, count) + plus(n-2, count) + plus(n-3, count);



    }



}