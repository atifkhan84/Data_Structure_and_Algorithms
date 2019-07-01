/*
import java.util.Arrays;

public class FirstIndexOfNumber {

    public static void main(String[] args) {
        int[] array = {23,749,89,2636,56,46,56};
        System.out.println(firstIndex(array, 56));
    }

    public static int firstIndex(int input[], int x) {
        if(input.length == 0)
            return -1;
        else if(input[input.length -1] == x)
            return input.length -1;

            firstIndex(Arrays.copyOfRange(input, 0, input.length - 1), x);
    }
}
*/
