package laps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Eduframe extends JFrame {

    public Eduframe() {
        setTitle("Student Registration");
        setSize(450, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(Color.WHITE);

        ImageIcon icon = new ImageIcon("logo.JPEG"); 
        JLabel logoLabel = new JLabel(icon);
        logoLabel.setBorder(BorderFactory.createEmptyBorder(15, 0, 10, 0));
        add(logoLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridLayout(6, 2, 5, 20));
        formPanel.setBackground(Color.WHITE); 
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 40, 10, 40));

        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setForeground(Color.BLACK);
        JTextField nameField = new JTextField();
        formPanel.add(nameLabel);
        formPanel.add(nameField);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setForeground(Color.BLACK);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        genderPanel.setBackground(Color.WHITE);
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        maleRadio.setBackground(Color.WHITE);
        femaleRadio.setBackground(Color.WHITE);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        formPanel.add(genderLabel);
        formPanel.add(genderPanel);

        JLabel levelLabel = new JLabel("Academic Level:");
        String[] levels = {"Freshman", "Sophomore", "Junior", "Senior"};
        JComboBox<String> levelCombo = new JComboBox<>(levels);
        formPanel.add(levelLabel);
        formPanel.add(levelCombo);

        JLabel clubLabel = new JLabel("College Club:");
        JCheckBox clubBox = new JCheckBox("CS College Club Member");
        clubBox.setBackground(Color.WHITE);
        formPanel.add(clubLabel);
        formPanel.add(clubBox);

        formPanel.add(new JLabel("University:"));
        formPanel.add(new JLabel("King Khalid University"));

        add(formPanel, BorderLayout.CENTER);

        JButton submitButton = new JButton("Register Student");
        submitButton.setBackground(Color.LIGHT_GRAY); 
        submitButton.setForeground(Color.BLACK);
        submitButton.setPreferredSize(new Dimension(0, 50));
        add(submitButton, BorderLayout.SOUTH);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                JOptionPane.showMessageDialog(null, "Student " + name + " Registered!");
            }
        });
    }

    public static void main(String[] args) {
        Eduframe frame = new Eduframe();
        frame.setVisible(true);
    }
}