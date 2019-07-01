import java.util.Arrays;

public class CheckNumber {

    public static boolean checkNumber(int input[], int x) {
        Arrays.sort(input);
        System.out.println(Arrays.binarySearch(input,x));
        if(Arrays.binarySearch(input,x) > 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,7,8,9};
        System.out.println(checkNumber(array, 11));
    }


}

