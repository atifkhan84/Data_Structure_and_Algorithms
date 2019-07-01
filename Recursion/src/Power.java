public class Power {

    public static void main(String[] args) {
        System.out.println(calculatePower(2,5));

        System.out.println(calculateFaster(2,5));
    }

    private static int calculatePower(int m, int n) {
        return (n == 0) ? 1 : m * calculatePower(m, --n);

    }

    private static int calculateFaster(int m, int n) {
        if(n == 0)
            return 1;
        if(n % 2 == 0)
            return calculateFaster(m * n, n / 2);
        else
            return m * calculatePower(m * m, (n - 1) / 2);
    }
}
