package com.makhlouf;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
public class ImportedGood extends Goods{

    private final Double importedTaxRate;
    private final Double importedTax;
    private final Double importedPriceAftertax;

    ImportedGood(String goodsName, Double goodsPrice, Double taxRate, Double importedTaxRate) {
        super(goodsName, goodsPrice, taxRate);
        this.importedTaxRate=importedTaxRate;

        this.importedTax = BigDecimal.valueOf(goodsPrice)
                .multiply(BigDecimal.valueOf(taxRate)
                .add(BigDecimal.valueOf(importedTaxRate)))
                .divide(BigDecimal.valueOf(100))
                .multiply(BigDecimal.valueOf(20)).setScale(0, RoundingMode.CEILING)
                .divide(BigDecimal.valueOf(20)).setScale(2,RoundingMode.CEILING).doubleValue();

        this.importedPriceAftertax = BigDecimal.valueOf(goodsPrice)
                .add(BigDecimal.valueOf(importedTax)).doubleValue();


    }

    public Double getImportedTax() {
        return importedTax;
    }
    public Double getImportedPriceAftertax() {
        return importedPriceAftertax;
    }


}
