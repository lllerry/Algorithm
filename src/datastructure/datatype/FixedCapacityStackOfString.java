package datastructure.datatype;

/**
 * Created by lerry on 11/05/2017.
 */
public class FixedCapacityStackOfString {

    private String[] container;
    //索引
    private int index;

    public FixedCapacityStackOfString(int cap) {
        container = new String[cap];
    }

    //进栈
    public void push(String content) {
        if (container[index] == null) {
            container[index] = content;
            index++;
        }
    }

    //弹栈
    public String pop() {
        if (index == 0) {
            throw new IllegalStateException("you can't do this");
        }
        return container[--index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int size() {
        return index;
    }

    //是否满了
    public boolean isFull() {
        return container.length == index;
    }
}
