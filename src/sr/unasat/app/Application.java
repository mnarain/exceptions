package sr.unasat.app;

import sr.unasat.controller.LoginController;

public class Application {

    public static void main(String[] args) throws Exception {
        LoginController lc = new LoginController();
        lc.login("Marvin", "1234");
    }


}
