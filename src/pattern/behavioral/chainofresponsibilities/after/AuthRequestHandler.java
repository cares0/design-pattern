package pattern.behavioral.chainofresponsibilities.after;

import pattern.behavioral.chainofresponsibilities.before.Request;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증 확인");
        super.handle(request);
    }
}
