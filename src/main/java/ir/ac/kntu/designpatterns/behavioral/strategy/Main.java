package ir.ac.kntu.designpatterns.behavioral.strategy;

public class Main {
    private static SortingStrategy selectionSort;

    static {
        selectionSort = arr -> {
            for (int i = 0; i < arr.length; i++) {
                int min = Integer.MAX_VALUE;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[i]) {
                        var temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        };
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 3, 2, 1, 0};
        testStrategy(arr, new InsertionSort());
        testStrategy(arr, selectionSort);
    }


    public static boolean testStrategy(Integer[] arr, SortingStrategy strategy) {
        strategy.sort(arr);
        return false;
    }
}
