package com.effectivejava.tutorial.effectivejava.item5;

import java.util.function.Supplier;

public class ItemFiveTest {
    public static void main(String[] args) {
         // YaziAnaliziUtility.isValid();  Sadece Utility'de tanimlanan dile göre yapacagi icin cok kullanissiz

        // YaziAnaliziSingleton.INSTANCE.isValid();  Singleton metodu da esnek degil, o yüzden kullanissiz

        // Bu cok esnek oldu. Dili degistirebiliriz
        Supplier<Sözlük> türkce = () -> new Sözlük("Türkce");
        YaziAnaliziDependencyInjection asd = new YaziAnaliziDependencyInjection(türkce);
        asd.isValid();

        // Lambda Functions
        Supplier<String> fs = () -> "Furkan";
        System.out.println(fs.get());  // Furkan

        Supplier<String> dahaKisa = () -> YaziAnaliziUtility.upuzunBirMethodYaziyorumSuAnAklimaGelenKelimelerle();

        YaziAnaliziUtility.upuzunBirMethodYaziyorumSuAnAklimaGelenKelimelerle();

        dahaKisa.get();


        double randomSayi = Math.random();
        System.out.println(randomSayi);
        System.out.println(randomSayi);

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

    }
}
