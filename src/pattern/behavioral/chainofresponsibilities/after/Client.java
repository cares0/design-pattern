package pattern.behavioral.chainofresponsibilities.after;

import pattern.behavioral.chainofresponsibilities.before.Request;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("hello");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(
                                new LoggingRequestHandler(
                                new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}
