package pattern.behavioral.chainofresponsibilities.before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("hello");
        RequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler.handler(request);
    }
}
