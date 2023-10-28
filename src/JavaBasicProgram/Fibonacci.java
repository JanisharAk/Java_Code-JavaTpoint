package JavaBasicProgram;
//Fibonacci series is 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
public class Fibonacci {
    public static void main(String[] args) {
        int start = 0;
        int next = 1;
        System.out.print(start+ " " +next);
        int sum;
        for(int i = 2; i<10; i++){
            sum = start+next;
            System.out.print(" "+ sum);
            start = next;
            next = sum;
        }
    }
}
