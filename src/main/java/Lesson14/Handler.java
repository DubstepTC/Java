package Lesson14;

import Lesson14.Sender;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
public class Handler {
    public Handler(Socket socket, String className) {

        try (Scanner scanner = new Scanner(System.in);
             DataInputStream in = new DataInputStream(socket.getInputStream());
             DataOutputStream out = new DataOutputStream(socket.getOutputStream())) {

            String msg;
            Sender sender = new Sender(scanner, out);
            Thread senderThread = new Thread(sender);
            senderThread.start();

            while (true) {
                msg = in.readUTF();

                if (msg.equals("bye")) {
                    System.out.printf("%s stop writing%n", className);
                    break;
                }
                System.out.printf("%s says: %s%n", className, msg);
            }
        } catch (IOException e) {
            System.out.println("writer stopped");
        }
    }
}