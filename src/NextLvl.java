public class NextLvl {
    public static void main(String[] args){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "");
        }
        System.out.println("\nДва максимальных числа цикла");
        int[] result = TwoBigNumbers.findTwoBigNumbers(array);
        for (int value : result) {
            System.out.println(value + " ");
        }
        System.out.println("\nДва максимальных числа сортировки");
        int[] resultSort = TwoBigNumbers.findTwoBigSort(array);

        for(int value : resultSort){
            System.out.println(value + "");
        }
    }
}
