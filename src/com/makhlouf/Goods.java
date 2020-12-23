package com.makhlouf;

public class Goods {

    private String goodsName;
    private double goodsPrice;
    private double taxRate;
    private double taxeGoods;
    private double priceAfterTaxe;


public Goods(String goodsName, double goodsPrice, double taxRate) {
    this.goodsName=goodsName;
    this.goodsPrice=goodsPrice;
    this.taxRate=taxRate;
    this.taxeGoods=(goodsPrice*taxRate)/100;
    this.priceAfterTaxe=goodsPrice+taxeGoods;
}

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxeGoods() {
        //return taxeGoods;
        return (double)Math.round(taxeGoods*100)/100;
    }

    public void setTaxeGoods(double taxeGoods) {
        this.taxeGoods = taxeGoods;
    }

    public double getPriceAfterTaxe() {
        //return priceAfterTaxe;

    return (double) Math.round(priceAfterTaxe*100)/100;
    }

    public void setPriceAfterTaxe(double priceAfterTaxe) {
        this.priceAfterTaxe = priceAfterTaxe;
    }
}