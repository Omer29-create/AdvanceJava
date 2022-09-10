package com.effectivejava.tutorial.effectivejava.item2;

public class StarbucksBuilder {

    // Gerekli
    private String kahveBoyutu;

    // Secime göre degisir
    private String laktozsuzSütMiktari;
    private String yumusatici;


    // Builder Pattern
    public static class Builder {

        // Gerekli
        private final String kahveBoyutu;

        // Secime göre degisir
        private String laktozsuzSütMiktari;
        private String yumusatici;

        public Builder(String kahveBoyutu) {
            this.kahveBoyutu = kahveBoyutu;
        }

        public Builder laktozsuzTayfa(String laktozsuzSüt) {
            laktozsuzSütMiktari = laktozsuzSüt;
            return this;
        }

        public Builder yumusakIcenler(String yumusakDeger) {
            yumusatici = yumusakDeger;
            return this;
        }

        public StarbucksBuilder build() {
            return new StarbucksBuilder(this);
        }
        
    }

    public StarbucksBuilder(Builder builder) {
        kahveBoyutu = builder.kahveBoyutu;
        laktozsuzSütMiktari = builder.laktozsuzSütMiktari;
        yumusatici = builder.yumusatici;
    }
}
