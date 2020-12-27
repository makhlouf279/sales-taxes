package com.makhlouf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImportedGoodTest {
    @Test
    public void test_imported_chocolates_box() {

        ImportedGood imp1 = new ImportedGood("1 imported box of chocolates", 10.00, 0.0, 5.00);
        Assertions.assertEquals(10.50,imp1.getImportedPriceAftertax());

    }
   @Test
    public void test_imported_perfume_bottle() {

       ImportedGood imp2= new ImportedGood( "1 imported bottle of perfume",47.50,10.00,5.00);

        Assertions.assertEquals(54.65,imp2.getImportedPriceAftertax());

    }
       @Test
    public void test_box_of_imported_chocolates() {

           ImportedGood imp3= new ImportedGood( "1 box of imported chocolates",11.25,0.0,5.00 );

        Assertions.assertEquals(11.85,imp3.getImportedPriceAftertax());

    }
       @Test
    public void test_imported_perfum_bottle() {

           ImportedGood imp4= new ImportedGood( "1 imported bottle of perfume",27.99,10.00,5.00 );

        Assertions.assertEquals(32.19,imp4.getImportedPriceAftertax());

    }





}



