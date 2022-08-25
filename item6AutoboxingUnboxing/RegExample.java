package com.effectivejava.tutorial.effectivejava.item6AutoboxingUnboxing;

import java.util.regex.Pattern;

public class RegExample {

    private static final  Pattern Roman = Pattern.compile("\\bM{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})\\b\n");

    public static boolean isRomanNumeral (String s) {
        return s.matches("\\bM{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})\\b\n");
    }

    static boolean isNonNumeral (String s) {
        return Roman.matcher(s).matches();
    }
}
