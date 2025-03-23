import java.util.Arrays;

public class _4_Arrays {
    public static void main(String[] args) {
        // Setting each value of an array is quite droll.
        int[] even_numbers = new int[4];
        even_numbers[0] = 2;
        even_numbers[1] = 4;
        even_numbers[2] = 6;
        even_numbers[3] = 8;
        System.out.println(Arrays.toString(even_numbers));

        // Apparently, they know that, and provide a shortcut syntax:
        int[] odd_numbers = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(odd_numbers));
    }
}
