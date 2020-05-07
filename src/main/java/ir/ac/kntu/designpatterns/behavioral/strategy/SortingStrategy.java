package ir.ac.kntu.designpatterns.behavioral.strategy;

@FunctionalInterface
public interface SortingStrategy {
    void sort(Integer[] array);
}
