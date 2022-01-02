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

    public double calcCheckingWithdraw(double amount) {
        checkingBalance -= amount;
        return checkingBalance;
    }

    public double calcSavingWithdraw(double amount) {
        savingBalance -= amount;
        return savingBalance;
    }

    public double calcCheckingDeposit(double amount) {
        checkingBalance += amount;
        return checkingBalance;

    }

    public double calcSavingDeposit(double amount) {
        savingBalance += amount;
        return savingBalance;
    }

    public void getCheckingWithdrawInput() {
        System.out.println("checking Account Balance:" + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from checking Account:");
        double amount = input.nextDouble();
        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New checking Account Balance :"+moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be negative."+"/n");
        }
    }
    public void getCheckingDepositInput(){
        System.out.println("checking Account Balance:" + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to Deposit to checking Account:");
        double amount = input.nextDouble();
        if (amount>=0){
            calcCheckingDeposit(amount);
            System.out.println("New checking Account Balance :"+moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be negative."+"/n");
        }
    }
    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account:");
        double amount = input.nextDouble();
        if ((savingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New saving Account Balance :"+moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance cannot be negative."+"/n");
        }
    }
    public void getSavingDepositInput(){
        System.out.println("saving Account Balance:" + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to Deposit to saving Account:");
        double amount = input.nextDouble();
        if (amount>=0){
            calcSavingDeposit(amount);
            System.out.println("New saving Account Balance :"+moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance cannot be negative."+"/n");
        }
    }
}

