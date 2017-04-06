package org.genesis.arena.corejava.concurrency;

/**
 * Created by KG on 17/2/25.
 * a BlockingQueue to deliver work
 */
public class SynchronizedQueue {
    private int index = 0;

    public synchronized void run() {
        try {
            // process another task
            index++;
            Thread.sleep(1000);
            System.out.println("task " + index + " executed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final SynchronizedQueue queue = new SynchronizedQueue();

        for (int i = 0; i<10; i++) {
            Thread t = new Thread(new Runnable(){
                public void run(){
                    queue.run();
                }
            });
            t.start();
        }
    }
}
