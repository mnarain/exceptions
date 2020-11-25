package sr.unasat.controller;

import sr.unasat.services.AuthenticationService;

public class LoginController {
    AuthenticationService as = new AuthenticationService();

    public LoginController() {
       this.as = new AuthenticationService();
    }

    public void login(String username, String password){

        try {
            as.login(username,password);
            System.out.println("Welkom op de dashboard " + username);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
