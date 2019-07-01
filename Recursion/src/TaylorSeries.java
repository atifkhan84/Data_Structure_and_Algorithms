public class TaylorSeries {
    private static double p = 1;
    private static double f = 1;

    public static void main(String[] args) {
        System.out.println(calTaylorSeries(1, 10));
    }

    private static double calTaylorSeries (int x, int n) {
        double r;
        if(n == 0)
            return 1;
        else {
            r = calTaylorSeries(x, n - 1);
            p = p * x;
            f = f * n;
            return r + p / f;
        }
    }

}
