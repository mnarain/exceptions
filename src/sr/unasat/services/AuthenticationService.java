package sr.unasat.services;

import sr.unasat.entities.Gebruiker;

import java.util.Arrays;
import java.util.List;

public class AuthenticationService {
    List<Gebruiker> gebruikerList;

    public AuthenticationService() {
        List<Gebruiker> gebruikerList = Arrays.asList(
                new Gebruiker("Marvin", "1234", false)
                , new Gebruiker("Vannessa", "597", false)
        );
        this.gebruikerList = gebruikerList;
    }

    public void login(String username, String password) throws Exception {
        for (Gebruiker gebruiker : gebruikerList) {
            if (gebruiker.getUsername().equals(username) && gebruiker.getPassword().equals(password)) {
                isSubscribed(gebruiker);
                return ;
            }
        }
        throw new Exception("Het inloggen is mislukt!");
    }

    public void isSubscribed(Gebruiker gebruiker) throws Exception {
        if(!gebruiker.getIsSubscribed()){
            throw new Exception("U heeft geen geldig abbonement!");
        }
    }
}
