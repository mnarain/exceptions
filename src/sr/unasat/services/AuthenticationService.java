package sr.unasat.services;

import sr.unasat.entities.Gebruiker;
import sr.unasat.exceptions.AuthenticationException;
import sr.unasat.exceptions.SubscriptionException;
import sr.unasat.repositories.GebruikersRepository;

public class AuthenticationService {

    public void login(String username, String password) throws AuthenticationException, SubscriptionException {
        for (Gebruiker gebruiker : GebruikersRepository.gebruikers) {
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
