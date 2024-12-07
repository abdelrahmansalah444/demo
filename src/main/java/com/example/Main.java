package com.example;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000);
        SwingUtilities.invokeLater(() -> new ATMGUI(account));
    }
}