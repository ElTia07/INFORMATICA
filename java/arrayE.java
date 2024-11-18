public class arrayE {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = new int[5];

        System.arraycopy(array1, 0, array2, 0, 5);

        for (int num : array2) {
            System.out.print(num + " ");
        }
    }
}
