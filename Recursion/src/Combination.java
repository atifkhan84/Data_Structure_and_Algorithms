public class Combination {

    public static void main(String[] args) {
        System.out.println(nCr(8,4));
    }

    private static int fact (int n) {
        if(n == 0)
            return 1;
        return fact(n -1) * n;
    }

    private static int nCr(int n, int r) {              //  This method follows Pascal's law
        if(n == r || r ==0)
            return 1;
        return nCr(n-1, r-1) + nCr(n-1,r);
    }
}
