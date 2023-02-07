package Lesson14.server;

import Lesson14.Handler;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
class ServerApp {
    private final int PORT;
    private boolean VERBOSE;
    ServerApp(int port) {
        this.PORT = port;
        this.VERBOSE = true;
    }
    ServerApp(int port, boolean verbose) {
        this(port);
        this.VERBOSE = verbose;
    }
    void start() {
        try (ServerSocket server = new ServerSocket(PORT)) {

            if (VERBOSE) System.out.println("Сервер запущен, ожидаем подключения...");

            try (Socket socket = server.accept()) {

                if (VERBOSE) System.out.println("Клиент подключился");

                new Handler(socket, "Client");

            } catch (IOException e) {
                System.out.println("Ошибка запуска сервера");
            }
        } catch (IOException e) {
            System.out.println("Ошибка инициализации сервера");
        }
    }
}