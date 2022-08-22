package com.effectivejava.tutorial.effectivejava.item3;

public class ItemThreeTest {

    public static void main(String[] args) {
/*
    DefineSingleton ds = DefineSingleton.ds;
    DefineSingleton ds2 = DefineSingleton.getInstance();

    System.out.println(ds.hashCode());
    System.out.println(ds2.hashCode());
 */
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {

                }
                System.out.println("HashCode of Lazy: " + LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager: " + EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Enum: " + CacheSingleton.INSTANCE.hashCode());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("HashCode of Lazy: " + LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager: " + EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Enum: " + CacheSingleton.INSTANCE.hashCode());
            }
        }).start();
    }
}
