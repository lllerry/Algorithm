package algorithm.sort;

/**
 * Created by lerry on 18/05/2017.
 * 选择排序
 */
public class Selection {

    public static void sort(Comparable[] comparables) {

        int N = comparables.length;//数据长度

        for (int i = 0; i < N; i++) {
            //将a[i]和a[i+1..N]中最小的元素交换
            int min = i;

            for (int j = i + 1; j < N; j++) {
                if (less(comparables[j], comparables[min])) {
                    min = j;
                }
                //交换 传入两个索引，交换两个值
                exchange(comparables, i, min);
            }
        }
    }

    //交换
    private static void exchange(Comparable[] comparables, int i, int j) {
        Comparable t = comparables[i];
        comparables[i] = comparables[j];
        comparables[j] = t;
    }

    //比较
    private static boolean less(Comparable comparable, Comparable comparable1) {
        return comparable.compareTo(comparable1) < 0;
    }
}
