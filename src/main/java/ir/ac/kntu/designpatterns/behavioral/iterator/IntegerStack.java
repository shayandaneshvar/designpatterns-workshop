package ir.ac.kntu.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegerStack implements Iterable<Integer> {
    private List<Integer> stack = new ArrayList<>();

    public void push(Integer integer) {
        stack.add(0, integer);
    }

    public Integer pop() {
        Integer integer = stack.get(0);
        stack.remove(0);
        return integer;
    }

    public Integer peek() {
        return stack.get(0);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < stack.size();
            }

            @Override
            public Integer next() {
                return stack.get(index++);
            }

            @Override
            public void remove() {
                stack.remove(--index);
            }
        };
    }
}
