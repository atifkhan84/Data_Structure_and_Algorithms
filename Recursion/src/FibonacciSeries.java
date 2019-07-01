import java.util.Arrays;

public class FibonacciSeries {
    private int[] array = new int[100];

    public FibonacciSeries(){
        Arrays.fill(array, -1);
    }


    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        long startTime = System.nanoTime();
        System.out.println("Memoization result : " + fibonacciSeries.fibonacciMemoization(10));
        long endTime = System.nanoTime();
        System.out.println("Time:" +(endTime - startTime));
        startTime = System.nanoTime();
        System.out.println("Recursive result: " + fibonacciRecursive(10));
        endTime = System.nanoTime();
        System.out.println("Time: " +(endTime - startTime));
    }


    private  int fibonacciMemoization(int n) {
        if(n <= 1){
            array[n] = n;
            return n;
        }
        else {
            if (array[n - 2] == -1)
                array[n - 2] = fibonacciMemoization(n - 2);
            if (array[n - 1] == -1)
                array[n - 1] = fibonacciMemoization(n - 1);
            array[n] = array[n - 2] + array[n - 1];
            return array[n - 2] + array[n - 1];
        }
    }
    /*

    Here Time complexity: O(n)

    */
    private static int fibonacciRecursive(int n) {
        if(n <= 1)
            return n;
        return fibonacciRecursive(n - 2) + fibonacciRecursive(n - 1);
    }
    /*

    Time Complexity of this method is O(2^n)

    */
}


