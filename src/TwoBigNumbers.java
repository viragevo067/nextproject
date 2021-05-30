public class TwoBigNumbers {

    public static int[] findTwoBigNumbers(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                secondMax = max;
                max = value;
            }
            else if (value > secondMax && value < max) {
                secondMax = value;
            }

        }
        return new int[]{max, secondMax};
    }

    public static int[] findTwoBigSort(int[] array) {
        return array;
    }
}