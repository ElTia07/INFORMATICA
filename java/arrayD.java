public class arrayD {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int n = array.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
