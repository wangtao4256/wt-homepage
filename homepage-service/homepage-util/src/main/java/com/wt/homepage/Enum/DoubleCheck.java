package com.wt.homepage.Enum;

public class DoubleCheck {
    private static volatile DoubleCheck doubleCheck;

    private DoubleCheck() {
    }

    public DoubleCheck getInstance() {
        if (null == doubleCheck) {
            synchronized (DoubleCheck.class) {
                if (null == doubleCheck) {
                    doubleCheck = new DoubleCheck();
                }

            }

        }
        return doubleCheck;
    }
}
