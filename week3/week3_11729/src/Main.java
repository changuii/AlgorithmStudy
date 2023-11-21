public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        hanoi(3, 3);


    }

    public static int hanoi(int n, int destination){
        if(n == 1) {
            System.out.println(n + " " + destination);
            return 1;
        }else {
            int x = hanoi(n - 1, destination);
            if(x == 1){
                System.out.println(n + " " + destination);
                return 1;
            }
        }
        return 1;
    }

}