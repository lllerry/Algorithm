package utils;

import java.util.Stack;

/**
 * Created by lerry on 18/05/2017.
 */
public class Stopwatch {
    double startTime;

    public Stopwatch() {
        startTime = System.currentTimeMillis();
    }

    public double elapsedTime() {
        double endTime = System.currentTimeMillis();
        return endTime - startTime;
    }



}
