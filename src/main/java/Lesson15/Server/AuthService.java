package Lesson15.Server;

public interface AuthService {

    void start();

    String getNickByLoginPass(String login, String pass);

    void stop();

}