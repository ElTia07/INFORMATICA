public class arrayB {
    public static void main(String[] args) {
        int[] array = {15, 22, 8, 31, 42, 10, 5, 18, 35};
        int sum = 0, min = array[0], max = array[0];

        for (int num : array) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Media: " + (sum / array.length));
        System.out.println("Minimo: " + min);
        System.out.println("Massimo: " + max);
    }
}
