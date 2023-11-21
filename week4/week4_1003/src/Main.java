import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();

        // 테스트 케이스의 수
        int count = Integer.parseInt(br.readLine());
        for(int i=0; i<count; i++) {
            map.put(0, 0);
            map.put(1, 0);
            fibonacci(Integer.parseInt(br.readLine()), map);
            System.out.println(map.get(0)+" "+map.get(1));
        }

    }

    public static int fibonacci(int i, Map map){
        // fib(0) = 0
        if(i == 0){
            map.put(0, (Integer)map.get(0) + 1);
            return 0;
        }
        // fib(1) = 1
        else if(i == 1){
            map.put(1, (Integer)map.get(1)+1);
            return 1;
        }
        // fib(n) = fib(n-1) + fib(n-2)
        else{
            return fibonacci(i-1, map) + fibonacci(i-2, map);
        }
    }
}