package algorithm.sort;

import utils.Stopwatch;

/**
 * Created by lerry on 18/05/2017.
 * <p>
 * 比较选择排序和插入排序
 */
public class SortCompare {
    private static final String TYPE_SELECTION = "type_selection";
    private static final String TYPE_INSERTION = "type_insertion";

    public static void main(String[] args) {
        double t1 = spendTime(TYPE_INSERTION, 20, 5000);
        double t2 = spendTime(TYPE_SELECTION, 20, 5000);

        System.out.println("selection is " + t2 / t1 + " times faster than insertion");
    }

    public static double spendTime(String type, int arrayLength, int repeatCount) {
        double total = 0;
        Double[] doubles = new Double[arrayLength];

        for (int i = 0; i < repeatCount; i++) {
            //随机生成数组
            for (int j = 0; j < arrayLength; j++) {
                doubles[j] = Math.random();
            }

            total += time(type, doubles);
        }
        return total;

    }

    public static double time(String type, Double[] a) {
        Stopwatch stopwatch = new Stopwatch();
        switch (type) {
            case TYPE_INSERTION:
                Insertion.sort(a);
                break;
            case TYPE_SELECTION:
                Selection.sort(a);
                break;
        }
        return stopwatch.elapsedTime();
    }
}
