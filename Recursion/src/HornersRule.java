//Taylor Series using Horner's Rule
// Time Complexity : O(n)
public class HornersRule {

    private static double s = 1;

    public static void main(String[] args) {
        System.out.println(calculateIterative(1, 10));
        System.out.println(calculate(1, 10));

    }

    private static double calculate(double x, double n){
        if(n == 0)
            return s;
        s = 1 + x * s / n;
        return calculate(x, n - 1);
    }

    private static double calculateIterative(int x, int n) {
        double se = 1;
        double num = 1;
        double den = 1;
        int i;
        for(i = 1; i <= n; i++) {
            num *= x;
            den *= i;
            se += num / den;
        }
        return se;
    }

}
