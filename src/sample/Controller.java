package sample;

import javafx.scene.control.Label;

public class Controller {
    public Label balanceOut; // создаю элемент с айди balanceOut
    public Label clickOut;
    public Label mousePrice;
    public Label keyboardPrice;

    static int balance = 0;
    static int clickValue = 1;
    static int price1 = 10;
    static int price2 = 100;

    public void printTap() {
        balance += clickValue;
        balanceOut.setText("Balance: " + balance);
    }

    public void upgradeTap() {
        if (balance >= price1) {
            clickValue++;
            balance -= price1;
            price1 += 2;
        }
        clickOut.setText("Strength: " + clickValue);
        balanceOut.setText("Balance: " + balance);
        mousePrice.setText("Цена: " + price1);
    }

    public void doubleUpgrade() {
        if (balance >= price2) {
            clickValue *= 2;
            balance -= price2;
            price2 *= 3;
        }
        clickOut.setText("Strength: " + clickValue);
        balanceOut.setText("Balance: " + balance);
        keyboardPrice.setText("Цена: " + price2);
    }

}
