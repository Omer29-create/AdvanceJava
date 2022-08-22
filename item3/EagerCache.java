package com.effectivejava.tutorial.effectivejava.item3;

import java.util.HashMap;

public class EagerCache implements Cache{

    // Daha en bastan olusturuluyor, Heap memory'de yer kapliyor
    private static final EagerCache instance = new EagerCache();
    private HashMap<Object, Object> map;

    private EagerCache() {
        map = new HashMap<Object, Object>();
    }
    @Override
    public void put(Object key, Object value) {
        map = new HashMap<Object, Object>();
    }

    @Override
    public Object get(Object key) {
        return get(key);
    }

    public static EagerCache getInstance() {
        return instance;
    }
}
