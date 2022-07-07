package pattern.structural.adapter.after;

import pattern.structural.adapter.after.security.LoginHandler;
import pattern.structural.adapter.after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        loginHandler.login("keesun", "keesun");
    }
}
