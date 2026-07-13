package ru.netology;

import ru.netology.Deals.Deal;
import ru.netology.taxes.TaxSystem;

public class Company {
    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;
    private Deal[] deals = new Deal[10];
    private int finalbalance;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Deal[] getDeals() {
        return deals;
    }

    public void payTaxes() {
        System.out.printf("Компания  < %s > уплатила налог в размере: %d руб. \n", title, taxSystem.calcTaxFor(debit, credit));
        debit = 0;
        credit = 0;
    }

    public void printingListTransactions() {
        System.out.println("Компания : " + title);
        System.out.println("Перечень доходов и расходов ");
        for (Deal deal : deals) {
            deal.printTransactions();
        }
    }

    public int applyDeals() {
        for (Deal deal : deals) {
            debit = debit + deal.getDebitChange();
            credit = credit + deal.getCreditChange();
        }
        finalbalance = debit - credit;
        payTaxes();
        return finalbalance;
    }
}
