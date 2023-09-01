package com.snpinfo.upipayment;

import androidx.annotation.NonNull;

import com.snpinfo.upipayment.listener.PaymentStatusListener;

public final class Singleton {
    private static Singleton instance = null;

    private PaymentStatusListener listener;

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    @NonNull
    public PaymentStatusListener getListener() {
        return instance.listener;
    }

    void setListener(@NonNull PaymentStatusListener listener) {
        instance.listener = listener;
    }

    public void detachListener() {
        instance.listener = null;
    }

    public boolean isListenerRegistered() {
        return (instance.listener != null);
    }
}
