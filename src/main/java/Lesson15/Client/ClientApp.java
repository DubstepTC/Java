package Lesson15.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientApp extends JFrame {
    public static void main(String[] args) {
        new ClientApp();
    }
    private JTextField jtf;
    private JTextArea textArea;
    final private String SERVER_ADDR = "localhost";//127.0.0.1
    final private int SERVER_PORT = 8189;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    public ClientApp() {
        try {
            socket = new Socket("localhost", 8189);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            setAuthorized(false);
            Thread t = new Thread(() -> {
                try {
                    while (true) {
                        String str = in.readUTF();
                        if(str.startsWith("/authok")) {
                            setAuthorized(true);
                            break;
                        }
                        textArea.append(str + "\n");
                    }
                    while (true) {
                        String str = in.readUTF();
                        if (str.equals("/end")) {
                            break;
                        }
                        textArea.append(str + "\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    setAuthorized(false);
                }
            });
            t.setDaemon(true);
            t.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        setBounds(600, 300, 500, 400);
        setTitle("Чатик");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        JScrollPane jsp = new JScrollPane(textArea);
        jsp.setBackground(Color.lightGray);
        add(jsp, BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel(new BorderLayout());
        add(bottomPanel, BorderLayout.SOUTH);
        JButton jbAuth = new JButton("АВТОРИЗАЦИЯ");
        jbAuth.setBackground(Color.lightGray);
        JButton jbSend = new JButton("ОТПРАВИТЬ");
        jbSend.setBackground(Color.lightGray);
        bottomPanel.add(jbSend, BorderLayout.EAST);
        bottomPanel.add(jbAuth, BorderLayout.WEST);
        jtf = new JTextField();
        jtf.setBackground(Color.lightGray);
        bottomPanel.add(jtf, BorderLayout.CENTER);
        jbSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jtf.getText().trim().isEmpty()) {
                    sendMsg();
                    jtf.grabFocus();
                }
            }
        });
        jbAuth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onAuthClick();
            }
        });
        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                try {
                    out.writeUTF("/end");
                    out.flush();
                    socket.close();
                    out.close();
                    in.close();
                } catch (IOException exc) {
                }
            }
        });
        setVisible(true);
    }

    public void setAuthorized(boolean v) {

    }

    public void onAuthClick() {
            JFrame frame = new JFrame("Вход");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setBounds(300, 300, 300, 180);


            frame.setLayout(null);
            JTextField login = new JTextField("Логин");
            login.setBackground(Color.lightGray);
            login.setBounds(10, 10, 260, 32);
            frame.add(login);


            frame.setLayout(null);
            JTextField password = new JTextField("Пароль");
            password.setBackground(Color.lightGray);
            password.setBounds(10, 50, 260, 32);
            frame.add(password);

            JButton button = new JButton("Отправить");
            button.setBounds(100, 90, 95, 32);
            button.setBackground(Color.lightGray);
            frame.add(button);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        out.writeUTF("/auth " + login.getText() + " " + password.getText());
                        login.setText("");
                        password.setText("");
                        frame.setVisible(false);
                    }
                     catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            frame.setVisible(true);
    }
    public void sendMsg() {
        try {
            out.writeUTF(jtf.getText());
            jtf.setText("");
        } catch (IOException e) {
            System.out.println("Ошибка отправки сообщения");
        }
    }

}
