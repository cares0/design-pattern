package pattern.behavioral.observer.after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User userA = new User("userA");
        User userB = new User("userB");

        chatServer.register("디자인 패턴", userA);
        chatServer.register("디자인 패턴", userB);

        chatServer.register("스프링", userB);

        chatServer.sendMessage(userA, "디자인 패턴", "메시지");

    }
}
