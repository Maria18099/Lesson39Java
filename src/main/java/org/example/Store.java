package org.example;

public class Store {
    private int amount =0;
    public synchronized void get(){
        while(amount<=0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        amount--;
        System.out.println("1 товар забрали зі складу. Amount = "+amount);
        notify();
    }
    public synchronized void put(){
        while (amount>=5){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        amount++;
        System.out.println("1 товар поклали на склад. Amount = "+amount);
        notify();
    }
}
