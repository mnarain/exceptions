package sr.unasat.repositories;

import sr.unasat.entities.Gebruiker;
import sr.unasat.exceptions.GeBruikersAlreadyInitialized;

import java.util.List;

public class GebruikersRepository {
    public static List<Gebruiker> gebruikers;

    public static void initialize(List<Gebruiker> gebruikerLijst) throws GeBruikersAlreadyInitialized {
        if (gebruikers == null || gebruikers.size() == 0) {
            gebruikers = gebruikerLijst;
        }else{
            throw new GeBruikersAlreadyInitialized("De gebruikers zijn al toegevoegd aan de gebruikerslijst.");
        }
    }

}
