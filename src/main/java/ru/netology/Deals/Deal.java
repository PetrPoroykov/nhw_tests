package ru.netology.Deals;

public class Deal {
    private  String comment;
    private int creditChange;
    private int debitChange;

    public Deal(String comment, int creditChange, int debitChange) {
        this.comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }

    public String getComment() {
        return comment;
    }

    public int getCreditChange() {
        return creditChange;
    }

    public int getDebitChange() {
        return debitChange;
    }

    public void setDebitChange(int debitChange) {
        this.debitChange = debitChange;
    }

    public void printTransactions(){
        System.out.println("Внебалансовая сделка");
    }
}
