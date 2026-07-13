package ru.netology.Deals;

public class Expenditure extends Deal {
    public Expenditure(String comment, int creditChange) {
        super(comment, creditChange, 0);
    }

    @Override
    public void printTransactions() {
        System.out.printf("Покупка %S  на %d руб.\n", getComment(), getCreditChange());
    }
}
