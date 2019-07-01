public class SumofArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(array, array.length));
    }

    public static int sum(int input[], int n) {
        if(n == 0)
            return 0;
        return input[n - 1  ] + sum(input, n - 1);
    }
}
