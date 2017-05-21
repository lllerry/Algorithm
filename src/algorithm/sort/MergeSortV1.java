package algorithm.sort;

/**
 * Created by lerry on 21/05/2017.
 * 归并排序（原地归并）
 */
public class MergeSortV1 {

    /**
     * 原地归并的抽象方法
     */
    public static void merge(Comparable[] comparables, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        Comparable[] aux = new Comparable[]{};
        for (int k = lo; k <= hi; k++) {
            aux[k] = comparables[k];        //复制数组
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                //取右边的元素
                comparables[k] = aux[j++];
            } else if (j > hi) {
                //取左边的元素
                comparables[k] = aux[i++];
            } else if (less(aux[i], aux[j])) {
                //当左边的小于右边的时候，把左边的给放进数组
                comparables[k] = aux[i++];
            } else {
                //当左边的大于右边的，把右边的放进数组
                comparables[k] = aux[j++];

            }
        }
    }

    private static boolean less(Comparable comparable, Comparable comparable1) {
        return comparable.compareTo(comparable1) < 0;
    }
}
