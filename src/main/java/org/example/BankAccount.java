package org.example;

public class BankAccount {
    private int cardBalance;

    public int getCardBalance() {
        return cardBalance;
    }

    public BankAccount(int cardBalance) {
        this.cardBalance = cardBalance;
    }

    public synchronized void changeAdd(int amount){
        System.out.println(cardBalance);
        cardBalance+=amount;
    }
    public void changeSub(int amount){
        cardBalance-=amount;
    }
}
