package algorithm.sort;

/**
 * Created by lerry on 18/05/2017.
 * 希尔排序
 */
public class Shell {

    public static void sort(Comparable[] comparables) {
        int N = comparables.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h > 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; i >= h && less(comparables[j], comparables[j - h]); j -= h) {
                    exchange(comparables, j, j - h);
                }
            }

            h = h / 3;
        }
    }


    private static boolean less(Comparable comparable, Comparable comparable1) {
        return comparable.compareTo(comparable1) < 0;
    }

    //交换
    private static void exchange(Comparable[] comparables, int i, int j) {
        Comparable t = comparables[i];
        comparables[i] = comparables[j];
        comparables[j] = t;
    }
}
