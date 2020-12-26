package com.makhlouf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotImportedGoodTest {

    @Test
    public void test_notimported_book() {

        NotImportedGood n1=new NotImportedGood("1 book",12.49,0.0);

        Assertions.assertEquals(12.49,n1.getPriceAfterTaxe());

    }

    @Test
    public void test_notimported_music_CD() {

        NotImportedGood n2=new NotImportedGood("1 music CD ",14.99,10.00);

        Assertions.assertEquals(16.49,n2.getPriceAfterTaxe());

    }
    @Test
    public void test_notimported_chocolate_bar() {

        NotImportedGood n3=new NotImportedGood("1 chocolate bar",0.85,0.0);

        Assertions.assertEquals(0.85,n3.getPriceAfterTaxe());

    }
    @Test
    public void test_notimported_bottle_of_perfume() {

        NotImportedGood n4=new NotImportedGood("1 bottle of perfume",18.99,10.00);

        Assertions.assertEquals(20.89,n4.getPriceAfterTaxe());

    }
    @Test
    public void test_notimported_packet_of_headche_pills() {

        NotImportedGood n5=new NotImportedGood("1 packet of headache pills",9.75,0.0);

        Assertions.assertEquals(9.75,n5.getPriceAfterTaxe());

    }

}