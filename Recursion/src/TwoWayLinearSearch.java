public class TwoWayLinearSearch {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(recSearch(array, 0, array.length -1, 6));
    }

    public static int recSearch(int arr[], int l, int r, int x) {
        if (r < l)
            return -1;
        if (arr[l] == x)
            return l;
        if (arr[r] == x)
            return r;
        return recSearch(arr, l+1, r-1, x);
    }
}
