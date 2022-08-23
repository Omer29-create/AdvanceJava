package com.effectivejava.tutorial.effectivejava.item5;

import java.util.function.Supplier;

public class ItemFiveTest {
    public static void main(String[] args) {
         // YaziAnaliziUtility.isValid();  Sadece Utility'de tanimlanan dile göre yapacagi icin cok kullanissiz

        // YaziAnaliziSingleton.INSTANCE.isValid();  Singleton metodu da esnek degil, o yüzden kullanissiz

        // Bu cok esnek oldu. Dili degistirebiliriz
        YaziAnaliziDependencyInjection asd = new YaziAnaliziDependencyInjection(new Sözlük("Türkce"));
        asd.isValid();

        // Lambda Functions
        Supplier<String> fs = () -> "Furkan";
        fs.get();  // Furkan

        Supplier<Sözlük> türkce = () -> new Sözlük("Türkce");

    }
}
