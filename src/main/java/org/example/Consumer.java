package org.example;

public class Consumer extends Thread{
    private Store store;
    public Consumer(Store store){
        this.store = store;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            store.get();
        }
    }
}
