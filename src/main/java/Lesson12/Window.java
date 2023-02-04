package Lesson12;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window() {
        setTitle("Клиентский чат");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 460);

        setLayout(null);
        JTextArea area = new JTextArea();
        area.setBackground(Color.lightGray);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setBounds(10, 10, 365, 360);
        add(area);

        setLayout(null);
        JTextField field = new JTextField();
        field.setBackground(Color.lightGray);
        field.setBounds(10, 380, 260, 32);
        add(field);
        field.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                area.setText(area.getText() + " - " + field.getText() + "\n");
                field.setText("");
            }
        });
        JButton button = new JButton("Отправить");
        button.setBounds(280, 380, 95, 32);
        button.setBackground(Color.lightGray);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                area.setText(area.getText() + " - " + field.getText() + "\n");
                field.setText("");
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new Window();
    }
}
