package sr.unasat.controller;

import sr.unasat.exceptions.AuthenticationException;
import sr.unasat.exceptions.SubscriptionException;
import sr.unasat.services.AuthenticationService;

public class LoginController {
    AuthenticationService as;

    public LoginController() {
       this.as = new AuthenticationService();
    }

    public void login(String username, String password){

        try {
            as.login(username,password);
            System.out.println("Welkom op de dashboard " + username);
        } catch (AuthenticationException e) {
            System.out.println("Authentication Exception: " + e.getMessage());
        } catch (SubscriptionException e) {
            System.out.println("Subscription Exception: " + e.getMessage());
        }
    }
}
