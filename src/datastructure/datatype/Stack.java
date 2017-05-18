package datastructure.datatype;


/**
 * Created by lerry on 12/05/2017.
 * 链表实现
 */
public class Stack<T> {

    static class NodeV<T> {
        T t;
        NodeV mNext;
    }

    //栈顶
    NodeV first;
    //索引
    int index;

    //压栈
    public void push(T t) {
        //向栈顶添加元素
        NodeV oldNode = first;
        first = new NodeV();
        first.t = t;
        first.mNext = oldNode;
        index++;
    }

    //出栈
    public T pop() {
        T t = (T) first.t;
        first = first.mNext;
        index--;
        return t;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int size() {
        return index;
    }
}
