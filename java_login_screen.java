import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Customize {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Customer Registration");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Name field
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 100, 25);
        frame.add(nameLabel);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 30, 200, 25);
        frame.add(nameField);

        // Customer number
        JLabel numberLabel = new JLabel("Customer Number:");
        numberLabel.setBounds(30, 70, 120, 25);
        frame.add(numberLabel);
        JTextField numberField = new JTextField();
        numberField.setBounds(150, 70, 200, 25);
        frame.add(numberField);

        // Date of Birth
        JLabel dobLabel = new JLabel("Date of Birth:");
        dobLabel.setBounds(30, 110, 100, 25);
        frame.add(dobLabel);
        JTextField dobField = new JTextField();
        dobField.setBounds(150, 110, 200, 25);
        frame.add(dobField);

        // Amount Paid
        JLabel amountLabel = new JLabel("Amount Paid:");
        amountLabel.setBounds(30, 150, 100, 25);
        frame.add(amountLabel);
        JTextField amountField = new JTextField();
        amountField.setBounds(150, 150, 200, 25);
        frame.add(amountField);

        // Sex
        JLabel sexLabel = new JLabel("Sex (M/F):");
        sexLabel.setBounds(30, 190, 100, 25);
        frame.add(sexLabel);
        JTextField sexField = new JTextField();
        sexField.setBounds(150, 190, 200, 25);
        frame.add(sexField);

        // Save button
        JButton saveButton = new JButton("Save");
        saveButton.setBounds(70, 250, 100, 30);
        frame.add(saveButton);

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(220, 250, 100, 30);
        frame.add(loginButton);

        // Save button logic
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String number = numberField.getText();
                String dob = dobField.getText();
                String amount = amountField.getText();
                String sex = sexField.getText();

                try {
                    FileWriter fw = new FileWriter("customer_data.txt", true); // append mode
                    PrintWriter pw = new PrintWriter(fw);
                    pw.println("Name: " + name);
                    pw.println("Customer Number: " + number);
                    pw.println("Date of Birth: " + dob);
                    pw.println("Amount Paid: " + amount);
                    pw.println("Sex: " + sex);
                    pw.println("--------------------------");
                    pw.close();
                    JOptionPane.showMessageDialog(frame, "Data saved to customer_data.txt");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error saving file: " + ex.getMessage());
                }
            }
        });

        // Login button logic (placeholder)
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Login button clicked (not yet implemented)");
            }
        });

        // Show the form
        frame.setVisible(true);
    }
}
