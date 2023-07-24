/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeeshop;

import javax.swing.JOptionPane;

/**
 *
 * @author philip
 */
public class inheritance {

    public Double enter() {
        NewJFrame frame = new NewJFrame();

        double total;
        double subtotal = 0;
        double TAXRATE = .01;
        double tax;

        if (frame.radCOFFEE.isSelected()) {
            subtotal = subtotal + 50;

        } else if (frame.radCAP.isSelected()) {
            subtotal = subtotal + 75;

        } else {
            subtotal = subtotal + 50;

        }

        return subtotal;

    }

    public Double option() {
        String[] options = {"Bagels = PHP 75", "Croissant= PHP 50", "Toast= PHP 75",};
        double quan;
        double total2 = 0;
        int opt;

        opt = JOptionPane.showOptionDialog(null, "Choose your Side", "option", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        switch (opt) {
            case 0:
                quan = quantity();
                total2 = quan * 75 + total2;
                break;
            case 1:
                quan = quantity();
                total2 = quan * 50 + total2;
                break;
            case 2:
                quan = quantity();
                total2 = quan * 75 + total2;
                break;

        }
        return total2;
    }

    public Double quantity() {

        String opt = JOptionPane.showInputDialog("How Many?");
        double quan = Double.parseDouble(opt);
        return quan;
    }

}
