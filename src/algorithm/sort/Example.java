package algorithm.sort;

/**
 * Created by lerry on 18/05/2017.
 * 排序算法类模板
 */
public class Example {
    //测试方法
    public static void main(String[] args) {

    }

    //排序
    public static void sort(Comparable[] comparables) {

    }

    //比较
    public static boolean less(Comparable a, Comparable b) {
        //a < b
        return a.compareTo(b) < 0;
    }

    //交换数组中两个元素
    private static void exchange(Comparable[] comparables, int i, int j) {
        Comparable t = comparables[i];
        comparables[i] = comparables[j];
        comparables[j] = t;
    }

    private static void show(Comparable[] comparables) {

        int length = comparables.length;
        for (int i = 0; i < length; i++) {
            System.out.println(comparables[i]);
        }
    }

    //是否已排序
    private static boolean isSorted(Comparable[] comparables) {
        int length = comparables.length;
        for (int i = 1; i < length; i++) {
            if (less(comparables[i], comparables[i - 1])) {
                return false;
            }
        }
        return true;

    }
}
