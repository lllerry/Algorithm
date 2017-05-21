package algorithm.sort;

/**
 * Created by lerry on 18/05/2017.
 * 插入排序
 *
 * 插入排序对于部分部分有序的数组十分高效，也很适合小规模数组。
 */
public class Insertion {

    /**
     * 举例子解释比较容易理解
     * 拿int类型数组举例
     * int a =  [5,3,2,10,4,11,23]
     * 遍历数组a,索引记为index,初始为0
     * 当index为0时，没软用。index++
     * 当index =1 时，j>0，调用less()函数比较两值大小less(3,5)返回true，交换两个元素位置j--,跳出。此时a = [3,5,2,10,4,11,23];
     * index = 2, j = 2,j >0,less(2,5)返回true，交换位置,a = [3,2,5,10,4,11,23],j--,j = 1,less(2,3)返回true，交换位置
     * a = [2,3,5,10,4,11,23],下面的套路应该都懂了，不写啦。
     */

    public static void sort(Comparable[] comparables) {
        //将a[]按升序排列
        int length = comparables.length;

        for (int i = 0; i < length; i++) {
            for (int j = i; j > 0 && less(comparables[j], comparables[j - 1]); j--) {
                exchange(comparables, j, j - 1);
            }
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
