package com.autobots.bankApp;

import java.time.LocalDateTime;

public class Transction {
    private final String type;
    private final double amount;
    private final LocalDateTime timeStamp = LocalDateTime.now();

    public Transction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s: %.2f", timeStamp, type, amount);
    }
}
