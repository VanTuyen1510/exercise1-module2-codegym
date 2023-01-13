package Main1;

import java.util.Scanner;

public class CurrencyConversion{
    public static void main(String[] args){
        long rate = 23000;
        Scanner s = new Scanner(System.in);
        System.out.println("Input your converted money ($): ");
        long money = s.nextLong();
        long converterMoney = money * rate;
        System.out.println("Converted money: " + converterMoney);
    }
}