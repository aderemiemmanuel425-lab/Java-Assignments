package com.emmanuel;

public class ChangingValues {
    public static void main(String[] args) {
        class BalanceCalculator {
            public static void main(String[] args) {

                double accountBalance = 50000.0;


                accountBalance = accountBalance + 15000.0;


                accountBalance = accountBalance - 10000.0;


                accountBalance = accountBalance + 2500.0;


                System.out.println("The final balance is: " + accountBalance);
    }
}
    }
}