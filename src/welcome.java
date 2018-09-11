import javax.swing.*;

public class welcome {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name");
        JOptionPane.showMessageDialog(null,"Welcome" +name+ "to year two");
    }
}

