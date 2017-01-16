package gestionBanque;

/**
 * Created by capetrel on 27/04/2016.
 */
public class Compte {

    private static int cpt = 1;

    private String personne;
    private int numCompte;
    private double soldeCompte;
    private double decouvertCompte;
    private double debitMaxCompte;

    /**
     * on peu ouvrir un compte avec tous les paramètre suivant
     * @param personne
     * @param soldeCompte (initialement à zéro mais peut etre renseigné si le client dépose des sous)
     * @param decouvertCompte selon la tête du titulaire
     * @param debitMaxCompte selon la tête du titulaire
     * */
    public Compte(String personne, double soldeCompte, double decouvertCompte, double debitMaxCompte) {
        this.personne = personne;
        this.numCompte = cpt;
        this.soldeCompte = soldeCompte;
        this.decouvertCompte = decouvertCompte;
        this.debitMaxCompte = debitMaxCompte;
        cpt++;
    }
    /**
     * on peu ouvrir un compte avec tous les paramètre suivant
     * @param personne
     * @param soldeCompte (initialement à zéro mais peut etre renseigné si le client dépose des sous)
     * */
    public Compte(String personne, double soldeCompte) {
        this(personne, soldeCompte, -800, 1000);
    }
    /**
     * on peu ouvrir un compte avec tous les paramètre suivant
     * @param personne
     * */
    public Compte(String personne ) {
        this(personne, 0, -800, 1000);
    }

    public void virement (double montant, Compte con){
        // Si montant inferieur a solde - decouvert du compte ET inférieur à debitMaxCompte de M. x
            //soustrait montant du compte de M. x
            //Ajoute montant au compte de M. y
        // sinon refus
        if (montant <= debitMaxCompte && montant <= soldeCompte-decouvertCompte ){
            soldeCompte = soldeCompte - montant;
        }else{
            System.out.println("Opération impossible !");
        }
    }

    public void crediter (double montant) {
        //Ajoute montant au compte de M. y
        soldeCompte = soldeCompte + montant;
    }

    public void debiter (double montant) {
        double stockMontantdebit = montant;
        // Si montant inferieur a solde - decouvert du compte ET inférieru à debitMaxCompte de M. x
            //soustrait montant du compte de M. x
        if(montant <= soldeCompte - decouvertCompte && montant <= debitMaxCompte){
            soldeCompte = soldeCompte - montant;
        }
    }

    public boolean verifdecouvert() {
        boolean decouvertTitulaire = true;
        if (soldeCompte < 0){
            decouvertTitulaire = false;
        }
        return decouvertTitulaire;
    }

    @Override
    public String toString() {
        return "Le titulaire du compte est : " + personne + " .\n" +
                "Son numérod de compte est : " + numCompte + " .\n" +
                "Le solde de son compte est de : " + soldeCompte + " €.\n" +
                "son découvert autorisé est de :" + decouvertCompte + " €.\n" +
                "il peut retirer" + debitMaxCompte + " € en une fois.";
    }

    public String getPersonne() {
        return personne;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public double getDecouvertCompte() {
        return decouvertCompte;
    }

    public void setDecouvertCompte(double decouvertCompte) {
        this.decouvertCompte = decouvertCompte;
    }

    public double getDebitMaxCompte() {
        return debitMaxCompte;
    }

    public void setDebitMaxCompte(double debitMaxCompte) {
        this.debitMaxCompte = debitMaxCompte;
    }

    public int getNumCompte() {
        return numCompte;
    }


}
