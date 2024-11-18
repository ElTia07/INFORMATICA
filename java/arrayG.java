import java.util.Arrays;

public class arrayG {
    public static void main(String[] args) {
        int[] array1 = {4, 8, 15, 16};
        int[] array2 = Arrays.copyOf(array1, array1.length);

        System.out.println(Arrays.equals(array1, array2));
    }
}
