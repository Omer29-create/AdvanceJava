package com.effectivejava.tutorial.effectivejava.item5;

import java.util.function.Supplier;

public class YaziAnaliziDependencyInjection {

    private final Sözlük sözlük;

    public YaziAnaliziDependencyInjection(Supplier<Sözlük> sözlük) {
        this.sözlük = sözlük.get();  // this dememek icin sözlük_ seklinde olusturabiliriz
    }

    public boolean isValid() {
        return true;
    }
}
