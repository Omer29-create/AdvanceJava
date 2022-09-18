package com.effectivejava.tutorial.effectivejava.item5;

public class YaziAnaliziSingleton {

    private static final Sözlük türkce = new Sözlük("Türkce");

    public static YaziAnaliziSingleton INSTANCE = new YaziAnaliziSingleton();
    private YaziAnaliziSingleton(){}   // Tek 1 instance olup onun üzerinden calismasi gerekiyor

    public static boolean isValid() {
        return true;
    }
}
