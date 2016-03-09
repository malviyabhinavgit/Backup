package com.accolite.concurrency.demo;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
public class SimpleThreadPool {
 
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100; i++) {
            Runnable worker = new WorkerThread("" + i);
           executor.submit(worker);
//            i--;
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
 
}
