package sr.unasat.services;

import sr.unasat.entities.Gebruiker;
import sr.unasat.exceptions.AuthenticationException;
import sr.unasat.exceptions.SubscriptionException;

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

    public void login(String username, String password) throws AuthenticationException, SubscriptionException {
        for (Gebruiker gebruiker : gebruikerList) {
            if (gebruiker.getUsername().equals(username) && gebruiker.getPassword().equals(password)) {
                isSubscribed(gebruiker);
                return ;
            }
        }
        throw new AuthenticationException("Het inloggen is mislukt!");
    }

    public void isSubscribed(Gebruiker gebruiker) throws SubscriptionException {
        if(!gebruiker.getIsSubscribed()){
            throw new SubscriptionException("U heeft geen geldig abbonement!");
        }
    }
}
