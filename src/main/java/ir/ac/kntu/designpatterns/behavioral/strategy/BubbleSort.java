package ir.ac.kntu.designpatterns.behavioral.strategy;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[i] > array[i + 1]) {
                    var temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}
