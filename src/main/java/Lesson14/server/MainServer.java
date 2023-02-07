package Lesson14.server;

public class MainServer {

    public static void main(String[] args) {

        try {
            new ServerApp(8990).start();
        } catch (Exception e) {
            System.out.println("Клиент отсоединился и сервер прекратил работу");
        }
    }
}