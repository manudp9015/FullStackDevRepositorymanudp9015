package com.polymorphism;

abstract class Payment 
{
    abstract void pay();
}

class GooglePay extends Payment 
{
    void pay() 
    {
        System.out.println("Google pay");
    }
}


class Cash extends Payment {
    void pay() {
        System.out.println("Payment made with Bitcoin.");
    }
}

public class Maindemo2 {
    public static void main(String[] args) {
        Payment payment;

        payment = new GooglePay();
        payment.pay();


        payment = new Cash();
        payment.pay();
    }
}

