package org.genesis.arena.corejava.fundermental.lambda;

/**
 * Created by KG on 2017/6/6.
 */
public class LambdaRepeat {
    public static void repeat(int n, Runnable action) {
        for (int i = 0; i < n; i++)
            action.run();
    }

    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) action.accept(i);
    }

    public static void main(String[] args) {
        repeat(10, () -> System.out.println("Repeat without parameters!"));
        System.out.println("----------------------------------------------------");
        repeat(10, i -> System.out.println("Countdown: " + (9 - i)));
    }
}

