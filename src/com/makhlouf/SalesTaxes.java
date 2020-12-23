package com.makhlouf;

public class SalesTaxes {

    public static void main(String[] args) {
        NotImportedGood n1=new NotImportedGood("1 book",12.49,0.0);
        NotImportedGood n2=new NotImportedGood("1 music CD ",14.99,10.00);
        NotImportedGood n3=new NotImportedGood("1 chocolate bar",0.85,0.0);
        NotImportedGood n4=new NotImportedGood("1 bottle of perfume",18.99,10.00);
        NotImportedGood n5=new NotImportedGood("1 packet of headache pills",9.75,0.0);
        ImportedGood imp1= new ImportedGood( "1 imported box of chocolates",10.00,0.0,5.00);
        ImportedGood imp2= new ImportedGood( "1 imported bottle of perfume",47.50,10.00,5.00);
        ImportedGood imp3= new ImportedGood( "1 box of imported chocolates",11.25,0.0,5.00 );
        ImportedGood imp4= new ImportedGood( "1 imported bottle of perfume",27.99,10.00,5.00 );
        //System.out.println("OUTPUT ");

        System.out.println("output 1: ");
        System.out.println(". " +n1.getGoodsName()+" : " +n1.getPriceAfterTaxe() );
        System.out.println(". " +n2.getGoodsName()+" : " +n2.getPriceAfterTaxe() );
        System.out.println(". " +n3.getGoodsName()+" : " +n3.getPriceAfterTaxe() );
        System.out.println(".  Sales Taxes : " +(n1.getTaxeGoods()+n2.getTaxeGoods()+n3.getTaxeGoods())+
                " Total: "+ (n1.getPriceAfterTaxe()+n2.getPriceAfterTaxe()+ n3.getPriceAfterTaxe()) );


        System.out.println("output 2: ");
        System.out.println(". " +imp1.getGoodsName()+" : " +imp1.getImportedPriceAftertax() );
        System.out.println(". " +imp2.getGoodsName()+" : " + imp2.getImportedPriceAftertax() );
        System.out.println(".  Sales Taxes : " +(imp1.getImportedTax()+imp2.getImportedTax())+
                " Total: "+ (imp1.getImportedPriceAftertax()+imp2.getImportedPriceAftertax()) );

        System.out.println("output 3: ");
        System.out.println(". " +imp4.getGoodsName()+" : "  +imp4.getImportedPriceAftertax());
        System.out.println(". " +n4.getGoodsName()+" : " +n4.getPriceAfterTaxe() );
        System.out.println(". " +n5.getGoodsName()+" : " +n5.getPriceAfterTaxe() );
        System.out.println(". " +imp3.getGoodsName()+" : " +imp3.getImportedPriceAftertax() );
        System.out.println(".  Sales Taxes : " +(imp4.getImportedTax()+n4.getTaxeGoods()+n5.getTaxeGoods()+imp3.getImportedTax())+
                " Total: "+ (imp4.getImportedPriceAftertax() + n4.getPriceAfterTaxe() + n5.getPriceAfterTaxe() + imp3.getImportedPriceAftertax()) );

    }
}
