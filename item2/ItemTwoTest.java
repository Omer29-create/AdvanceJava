package com.effectivejava.tutorial.effectivejava.item2;

public class ItemTwoTest {
    public static void main(String[] args) {
        /*
        Starbucks sb = new Starbucks();
        sb.setKahveBoyutu("kücük");
        sb.setYumusatici("bana ekle");
        */

        StarbucksBuilder sb = new StarbucksBuilder.Builder("tall").yumusakIcenler("ben yumusak istiyorum").build();
    }
}
