package maroua.com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }


    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;

    }

    public int getCustomerNumber() {

        return customerNumber;
    }
    public double getCheckingBalance() {
        return checkingBalance;
    }


    public double getSavingBalance() {
        return savingBalance;
    }
    public double calcCheckingWithdraw(double amount){
        checkingBalance-=amount;
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount){
        savingBalance-=amount;
        return savingBalance;
    }
    public double calcCheckingDeposit (double amount){
        checkingBalance+=amount;
        return checkingBalance;

    }
    public double calcSavingDeposit (double amount){
        savingBalance+=amount;
        return savingBalance;
    }
}
