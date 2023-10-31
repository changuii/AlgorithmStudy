import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte[] stack = new byte[sc.nextInt()+1];
        int before = 1;
        int top = 1;
        int sequence = 1;

        String result = new String();
        for (int i = sc.nextInt(); ; ) {
            if (before < i) {
                System.out.println(before + ""+i+sequence);
                result += "+";
                stack[sequence] = 1;
                top = sequence;
                before = sequence++;
            } else if (before >= i) {
                result += "-";
                while(true){
                    if(stack[top] == 1)
                        break;
                    top--;
                }
                stack[top] = 0;
                if(result.length()/2 == stack.length){
                    break;
                }
                if ((before = top--) == i) {
                   i = sc.nextInt();
                } else if (top > i) {
                    result = "";
                    System.out.println("NO");
                    break;
                }
            }
        }
        for (char a : result.toCharArray())
            System.out.println(a);
    }
}