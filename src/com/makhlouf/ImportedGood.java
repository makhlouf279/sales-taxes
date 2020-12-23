package com.makhlouf;

public class ImportedGood extends Goods{

    private double importedTaxRate;
    private double importedTax;
    private double importedPriceAftertax;

    ImportedGood(String goodsName, double goodsPrice, double taxRate, double importedTaxRate) {
        super(goodsName, goodsPrice, taxRate);
        this.importedTaxRate=importedTaxRate;
        this.importedTax = (goodsPrice * (taxRate + importedTaxRate)) / 100;
        this.importedPriceAftertax = goodsPrice + importedTax;

    }

    public double getImportedTaxRate() {
        return  importedTaxRate;
    }

    public void setImportedTaxRate(double importedTaxRate) {
        this.importedTaxRate = importedTaxRate;
    }

    public double getImportedTax() {
        return (double) Math.round(importedTax*100)/100;
    }

    public void setImportedTax(double importedTax) {
        this.importedTax = importedTax;
    }

    public double getImportedPriceAftertax() {
        return (double) Math.round(importedPriceAftertax*100)/100;
    }

    public void setImportedPriceAftertax(double importedPriceAftertax) {
        this.importedPriceAftertax = importedPriceAftertax;
    }
}
