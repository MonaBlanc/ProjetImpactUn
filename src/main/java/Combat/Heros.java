package Combat;

import Data.ClasseHeros;
import Data.Ennemis;
import Data.Personnages;

import java.util.Scanner;

public abstract class Heros implements GestionCombat {
    private static String name;
// Autres caractéristiques entrant en jeu

    public boolean estVaincu() {
        return recupHP() <= 0;

     }

    public void debutCombat(String NomHeros, String Ennemistype){
        Scanner selectionUser = new Scanner(System.in);  // Create a Scanner object
        int choixDebut;
        //identifer le héros
        System.out.println("Que souhaitez vous faire ? \n [1] - Afficher mes statistiques \n [2] - Afficher les statistiques de l'ennemi \n [3] - Attaquer\n");
        choixDebut = selectionUser.nextLine().charAt(0);
        switch(choixDebut){
            case 1:
                //lire les statistique du héros/ de l'ennemi
                printStats();
                break;
            case 2:
                printEnnemiStats();
                break;
            case 3:
                attaque();
        }


    }

    private void printStats(){
        System.out.println(Personnages.nom + "\npv: " + Personnages.pv + "\nMaitrise Elementaire: " + Personnages.maîtriseElem + "\nAttaque: " + Personnages.attaque + "\nNiveau: " + Personnages.niveau + "\n");
    }

    private void printEnnemiStats(){
        System.out.println(Ennemis.type + "\npv: " + Ennemis.PV + "\nMaitrise Elementaire: " + Ennemis.maîtriseElem + "\nAttaque: " + Ennemis.Attaque + "\nDéfense: " + Ennemis.Défense + "\nNiveau: " + Ennemis.Niveau + "\n");
    }


    public boolean attaque() {
        if (LancerDé.lancer6() > 2) {
            System.out.println("Vous attaquez l'ennemi !");

            int Degat = degatsInfliges(); //degats infligés calculés dans une autre classe
            Ennemis.PV = Ennemis.PV - Degat;
            System.out.println("Vous faites" + Degat + "de degat ! ");

            if (estVaincu()) {
                System.out.println("Ennemi vaincu !");
                return false;
            }
        } else {
            System.out.println("Dommage ! Attaque manquée...");
        }
        return true;

    }


    private int degatsInfliges() {
    //coup critique
        if (LancerDé.lancer6() == 6) {
        int Degat = Personnages.attaque*4;
            return Degat;
        } else {
            return Personnages.attaque*2;
        }
    }






}
