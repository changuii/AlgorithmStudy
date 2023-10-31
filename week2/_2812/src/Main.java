import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int removeSize =Integer.parseInt(st.nextToken());
        StringBuffer value = new StringBuffer(br.readLine());
        br.close();
        for(int i=0; i<removeSize; i++){
            int min=0;
            for(int j =0; j<value.length()/2+1; j++){
                if(Character.getNumericValue(value.charAt(min)) > Character.getNumericValue(value.charAt(j)))
                    min =j;
                if(value.charAt(min) == '1')
                    break;
            }
            value.delete(min, min+1);
            min = 0;
        }
        System.out.println(value);
    }
}