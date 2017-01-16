package gestionBanque;


/**
 * Created by capetrel on 27/04/2016.
 */
public class GestionCompte {
    public static void main(String[] args){

        /**
         * Indiquer le nombre de client
         * */

        int nTitulaire = Saisie.lireEntier("veuillez renseigner le nom du client."); //definie taille tableau client
        personne[] client = new personne[nTitulaire];

        for(int i = 0; i < nTitulaire; i++ ) {

            String nomTit = Saisie.lireChaine("Rentrer le nom du client");
            String prenomTit = Saisie.lireChaine("Renter le prénom du client");
            String adresseTit = Saisie.lireChaine("Renseigner son adresse.");
            client[i] = new personne(nomTit, prenomTit, adresseTit);


        /*

        int ncompte = Saisie.lireEntier("Veuillez saisir le nombre de salles."); // definie la taille du tableau compte
        Compte[] compteTitu = new Compte[ncompte];

        compteTitu[0] = new Compte(null);

        for(int j = 0; j < ncompte; j++ ) {
            String nomCpt = personne[0];
            double soldeTit = Saisie.lireDouble("Veuillez indiquer le solde de début.");
            double decouvertTit = Saisie.lireDouble("préciser le découvert autorisé.");
            double debitMaxTit = Saisie.lireDouble("Donner Le retrait maximum autorisé en une fois.");
            compteTitu[i] = new Compte(nomCpt, soldeTit, decouvertTit, debitMaxTit);
        }
    }*/
        }
    }
}
