public class Fibonacci {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; //Change this to calculate different Fibonacci numbers.
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciRecursive(n));
    }
}
