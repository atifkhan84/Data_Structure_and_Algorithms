// Demonstration of nested recursion

public class NestedRecursion {

    public static void main(String[] args) {
        System.out.println(recursion(95));

    }

    public static int recursion (int n) {
        if(n > 100)
            return n -10;
        else
            return recursion(recursion(n +11));

    }
}
