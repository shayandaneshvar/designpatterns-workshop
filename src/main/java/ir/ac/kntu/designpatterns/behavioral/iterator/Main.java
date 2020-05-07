package ir.ac.kntu.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        Iterator<Integer> integerIterator = stack.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
