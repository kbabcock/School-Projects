/**
 * Another simple app, this time for module 2. Enjoy.
 * This time I'll add my name: written by Kris Babcock
 */
import java.util.*;
import java.text.*;// Needed for DecimalFormat
import javax.swing.JOptionPane;

public class MassConversion {
    public static void main(String[] args) {
        String ans;
        ans = JOptionPane.showInputDialog(null, "Enter a weight in pounds to be converted to kilograms");// First dialog box
        DecimalFormat df = new DecimalFormat("#.##");// Formats output to two decimal spaces
        double pounds = Double.parseDouble(ans);
        double kilograms = pounds / 2.2;
        JOptionPane.showMessageDialog(null, "Kilograms = " + df.format(kilograms));// Output to another dialog box

        System.exit(0);
    }
}