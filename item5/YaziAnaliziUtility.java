package com.effectivejava.tutorial.effectivejava.item5;

public class YaziAnaliziUtility {

    private static final Sözlük sözlük = new Sözlük("Türkce");

    private YaziAnaliziUtility() {}

    public static boolean isValid() {
        return true;
    }

    public static  String upuzunBirMethodYaziyorumSuAnAklimaGelenKelimelerle() {
        return "Selam";
    }
}
