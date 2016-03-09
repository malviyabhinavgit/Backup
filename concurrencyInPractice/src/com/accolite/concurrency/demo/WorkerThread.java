package com.accolite.concurrency.demo;

import com.accolite.concurrency.writting.FileWritting;

public class WorkerThread implements Runnable {
    
    private String command;
     
    public WorkerThread(String s){
        this.command=s;
    }
 
    @Override
    public void run() {
        FileWritting.writeContentToFile(Thread.currentThread().getName()+" Start. Command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }
 
    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 
    @Override
    public String toString(){
        return this.command;
    }
}