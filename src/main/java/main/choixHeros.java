package main;
import Data.*;


import java.util.Scanner;  // Import the Scanner class

import static main.display.clear;

public class choixHeros {

    public void selection() {
        char classeChoisie;
        String displayNom = "";

        Scanner selectionUser = new Scanner(System.in);  // Create a Scanner object

        do {
            System.out.println("'c' pour la classe claymore");
            System.out.println("'a' pour la classe archer");
            System.out.println("'m' pour la classe mage");
            System.out.println("'e' pour la classe epeiste");
            System.out.println("'l' pour la classe lancier");
            classeChoisie = selectionUser.nextLine().charAt(0);
            switch(classeChoisie) {
                case 'c':
                    clear();
                    System.out.println("Votre personnage appartiendra a la classe mage.\n " +
                            "Par chance, nous avons deux mages prêts à l'aventure !\n" +
                            "[1] - Chongyun, le claymore cryo.\n" +
                            "[2] - Beidou, la claymore electro.\n" +
                            "[3] - Finalement, les claymores ne m'intéressent pas.");
                    int selectionClaymore = selectionUser.nextLine().charAt(0);
                    switch (selectionClaymore) {
                        case '1':
                            ClasseHeros Chongyun = new Claymore(1000, 57, 54, 35, 70);
                            System.out.println("Heros choisi ! ");
                            Personnages.nom = "Chongyun";
                            Personnages.element = "cryo";
                            Personnages.classe = "claymore";
                            Personnages.camp = "héros";
                            displayNom = "Chongyun";
                            break;
                        case '2':
                            ClasseHeros Beidou = new Claymore(1000, 57, 54, 30, 70);
                            System.out.println("Heros choisi ! ");
                            Personnages.nom = "Beidou";
                            Personnages.element = "electro";
                            Personnages.classe = "claymore";
                            Personnages.camp = "héros";
                            displayNom = "Beidou";
                            break;
                        case '3':
                            System.out.println("Retour au menu de selection.");
                            choixHeros.selection();
                            break;
                    }
                    break;
                case 'a':
                    clear();
                    System.out.println("Votre personnage appartiendra a la classe archer.\n " +
                            "Par chance, nous avons deux archers prêts à l'aventure !\n" +
                            "[1] - Ganyu, l'archere cryo.\n" +
                            "[2] - Yoimiya, l'archere pyro.\n" +
                            "[3] - Finalement, les archers ne m'intéressent pas.");
                    int selectionArcher = selectionUser.nextLine().charAt(0);
                    switch (selectionArcher) {
                        case '1':
                            ClasseHeros Ganyu = new Archer(1000, 57, 54, 35, 70);
                            System.out.println("Heros choisi ! ");
                            Personnages.nom = "Ganyu";
                            Personnages.element = "cryo";
                            Personnages.classe = "archer";
                            Personnages.camp = "héros";
                            displayNom = "Ganyu";
                            break;
                        case '2':
                            ClasseHeros Yoimiya = new Archer(1000, 57, 54, 30, 70);
                            System.out.println("Heros choisi ! ");
                            Personnages.nom = "Yoimiya";
                            Personnages.element = "pyro";
                            Personnages.classe = "archer";
                            Personnages.camp = "héros";
                            displayNom = "Yoimiya";
                            break;
                        case '3':
                            System.out.println("Retour au menu de selection.");
                            choixHeros.selection();
                            break;
                    }
                    break;
                case 'm':
                    clear();
                    System.out.println("Votre personnage appartiendra a la classe mage.\n " +
                            "Par chance, nous avons deux mages prêts à l'aventure !\n" +
                            "[1] - Mona, la mage hydro.\n" +
                            "[2] - Ninguangg, la mage geo.\n" +
                            "[3] - Finalement, les mages ne m'intéressent pas.");
                    int selectionMage = selectionUser.nextLine().charAt(0);
                    switch (selectionMage) {
                        case '1':
                            ClasseHeros Mona = new Mage(1000, 57, 54, 35, 70);
                            System.out.println("Heros choisi ! ");
                            Personnages.nom = "Mona";
                            Personnages.element = "hydro";
                            Personnages.classe = "mage";
                            Personnages.camp = "héros";
                            displayNom = "Mona";
                            break;
                        case '2':
                            ClasseHeros Ninguangg = new Mage(1000, 57, 54, 30, 70);
                            System.out.println("Heros choisi ! ");
                            Personnages.nom = "Ninguangg";
                            Personnages.element = "geo";
                            Personnages.classe = "mage";
                            Personnages.camp = "héros";
                            displayNom = "Ninguangg";
                            break;
                        case '3':
                            System.out.println("Retour au menu de selection.");
                            choixHeros.selection();
                            break;
                    }
                    break;
                case 'e':
                    clear();
                    System.out.println("Votre personnage appartiendra a la classe epeiste.\n " +
                            "Par chance, nous avons deux epeistes prêts à l'aventure !\n" +
                            "[1] - Xingqiu, l'epeiste hydro.\n" +
                            "[2] - Jean, l'epeiste anemo.\n" +
                            "[3] - Finalement, les epeistes ne m'intéressent pas.");
                    int selectionEpeiste = selectionUser.nextLine().charAt(0);
                    switch (selectionEpeiste) {
                        case '1':
                            ClasseHeros Xingqiu = new Epeiste(1000, 57, 54, 35, 70);
                            System.out.println("Heros choisi ! ");
                            Personnages.nom = "Xingqiu";
                            Personnages.element = "hydro";
                            Personnages.classe = "epeiste";
                            Personnages.camp = "héros";
                            displayNom = "Xingqiu";
                            break;
                        case '2':
                            ClasseHeros Jean = new Epeiste(1000, 57, 54, 30, 70);
                            System.out.println("Heros choisi ! ");
                            Personnages.nom = "Jean";
                            Personnages.element = "anemo";
                            Personnages.classe = "epeiste";
                            Personnages.camp = "héros";
                            displayNom = "Jean";
                            break;
                        case '3':
                            System.out.println("Retour au menu de selection.\n\n");
                            choixHeros.selection();
                            break;
                    }
                    break;
                case 'l':
                    clear();
                    System.out.println("Votre personnage appartiendra a la classe lancier.\n " +
                            "Par chance, nous avons deux lanciers prêts à l'aventure !\n" +
                            "[1] - Xiao, le lancier anemo.\n" +
                            "[2] - Hu tao, la lanciere pyro.\n" +
                            "[3] - Finalement, les lanciers ne m'intéressent pas.");
                    int selectionLancier = selectionUser.nextLine().charAt(0);
                    switch (selectionLancier) {
                        case '1':
                            ClasseHeros Xiao = new Lancier(1000, 57, 54, 35, 70);
                            System.out.println("Heros choisi ! ");
                            Personnages.nom = "Xiao";
                            Personnages.element = "anemo";
                            Personnages.classe = "lancier";
                            Personnages.camp = "héros";
                            displayNom = "Xiao";
                            break;
                        case '2':
                            ClasseHeros Hutao = new Lancier(1000, 57, 54, 30, 70);
                            System.out.println("Heros choisi ! ");
                            Personnages.nom = "Hu tao";
                            Personnages.element = "pyro";
                            Personnages.classe = "lancier";
                            Personnages.camp = "héros";
                            displayNom = "Hu tao";
                            break;
                        case '3':
                            System.out.println("Retour au menu de selection.\n\n");
                            choixHeros.selection();
                            break;
                    }
            }

        } while (classeChoisie != 'c' && classeChoisie != 'a' && classeChoisie != 'm' && classeChoisie != 'e' && classeChoisie != 'l');
        System.out.println("Vous incarnerez " + displayNom + " pour cette aventure.\n\n");
    }
}
