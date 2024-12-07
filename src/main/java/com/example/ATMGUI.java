package com.example;

import javax.swing.*;

public class ATMGUI {
    private JFrame frame;
    private JTextField amountField;
    private JButton depositButton;
    private JButton withdrawButton;
    private JLabel balanceLabel;
    private Account account;

    public ATMGUI(Account account) {
        this.account = account;
        frame = new JFrame("ATM Simulator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        amountField = new JTextField();
        amountField.setBounds(50, 30, 200, 30);
        frame.add(amountField);

        depositButton = new JButton("Deposit");
        depositButton.setBounds(50, 70, 90, 30);
        frame.add(depositButton);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(160, 70, 90, 30);
        frame.add(withdrawButton);

        balanceLabel = new JLabel("Balance: " + account.getBalance());
        balanceLabel.setBounds(50, 110, 200, 30);
        frame.add(balanceLabel);

        depositButton.addActionListener(e -> {
            double amount = Double.parseDouble(amountField.getText());
            account.deposit(amount);
            balanceLabel.setText("Balance: " + account.getBalance());
        });

        withdrawButton.addActionListener(e -> {
            double amount = Double.parseDouble(amountField.getText());
            account.withdraw(amount);
            balanceLabel.setText("Balance: " + account.getBalance());
        });

        frame.setVisible(true);
    }
}