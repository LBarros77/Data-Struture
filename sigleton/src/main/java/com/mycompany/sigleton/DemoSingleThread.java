package com.mycompany.sigleton;

public class DemoSingleThread {
    private static DemoSingleThread instance;
    public String value;

    private DemoSingleThread(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static DemoSingleThread getInstance(String value) {
        if (instance == null) {
            instance = new DemoSingleThread(value);
        }
        return instance;
    }
}
