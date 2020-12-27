package com.makhlouf;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Goods {

    private String  goodsName;
    private final Double  goodsPrice;
    private final Double  taxRate;
    private final Double  taxeGoods;
    private final Double  priceAfterTaxe;


public Goods(String goodsName, Double goodsPrice, Double taxRate) {
    this.goodsName=goodsName;
    this.goodsPrice=goodsPrice;
    this.taxRate=taxRate;


    this.taxeGoods=BigDecimal.valueOf(goodsPrice)
            .multiply(BigDecimal.valueOf(taxRate))
            .divide(BigDecimal.valueOf(100))
            .multiply(BigDecimal.valueOf(20)).setScale(0,RoundingMode.CEILING)
            .divide(BigDecimal.valueOf(20)).setScale(2,RoundingMode.CEILING).doubleValue();

    this.priceAfterTaxe =BigDecimal.valueOf(goodsPrice)
            .add(BigDecimal.valueOf(taxeGoods)).doubleValue();

}

    public String getGoodsName() {
        return goodsName;
    }
    public Double getTaxeGoods() {
        return taxeGoods;
    }
    public Double getPriceAfterTaxe() {
        return priceAfterTaxe;
    }


}