package assignment7;

// import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadLocalRandom;


public class SumValue {
    /** THREAD_NUM */
    private static final int THREAD_NUM = 4;

    static void genRandomArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // generate a number whose upper bound is 10000
            arr[i] = ThreadLocalRandom.current().nextInt(10000);
        }
    }

    static long sum(int[] arr) {
        // create tasks
        int n = arr.length, start = 0, len = n / THREAD_NUM; // Threads == 4
        List<FutureTask<Long>> taskList = new ArrayList<>(THREAD_NUM);
        for (int i = 0; i < THREAD_NUM; i++) {
            final int START = start, END = (i == THREAD_NUM - 1) ? n : start + len;

            // System.out.println(START + ", " + END);

            FutureTask<Long> task = new FutureTask<>(new Callable<Long>() {
                @Override
                public Long call() {
                    Long sum = 0L;
                    for (int i = START; i < END; i++) {
                        sum += arr[i];
                    }
                    return sum;
                }
            });
            taskList.add(task);

            // start thread
            Thread thread = new Thread(task);
            thread.start();

            // update range
            start += len;
        }

        // merge results
        Long sum = 0L;
        try {
            for (FutureTask<Long> task : taskList) {
                sum += task.get();
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        return sum;
    }

    static long singleThreadSum(int[] arr) {
        long sum = 0L;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[4000000];
        genRandomArray(arr);
        
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
        // System.out.println("Whether the result is correct? " + (sum == singleThreadSum(arr)));
    }
}