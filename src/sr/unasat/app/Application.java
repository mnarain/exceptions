package sr.unasat.app;

import sr.unasat.controller.LoginController;
import sr.unasat.entities.Gebruiker;
import sr.unasat.exceptions.AuthenticationException;
import sr.unasat.repositories.GebruikersRepository;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) throws Exception {
        GebruikersRepository.initialize(Arrays.asList(new Gebruiker("Nintendo","none",true)));
        GebruikersRepository.initialize(Arrays.asList(new Gebruiker("Nintendo","none",true)));
        LoginController lc = new LoginController();
        lc.login("Nintendo", "none");

    }


}
