package gestionBanque;

/**
 * Created by capetrel on 27/04/2016.
 */
public class personne {
    private final String nomTitulaire;
    private final String prenomTitulaire;
    private String adresseTitulaire;

    public personne(String nomTitulaire, String prenomTitulaire, String adresseTitulaire) {
        this.nomTitulaire = nomTitulaire;
        this.prenomTitulaire = prenomTitulaire;
        this.adresseTitulaire = adresseTitulaire;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public String getPrenomTitulaire() {
        return prenomTitulaire;
    }

    public String getAdresseTitulaire() {
        return adresseTitulaire;
    }

    public void setAdresseTitulaire(String adresseTitulaire) {
        this.adresseTitulaire = adresseTitulaire;
    }
}
