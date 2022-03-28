package main;

import java.util.Scanner;


public class display {


    public void displayOpening() {
        String opening = "Un archipel isole. L'Ouest lointain de Teyvat. Surpasses les eclairs intarissable d'Inazuma et fais un premier pas vers ces iles d'erables rouges et de cerisiers. Il va falloir franchir des forets et montagnes pleines de secrets avant de pouvoir temoigner de l'Eternite poursuivie par son Excellence, la grande Raiden Shogun.";
        String wrappedOpening = wrapTexte(opening);
        System.out.println(wrappedOpening);
    }

    public void displayBeginningForet() {
        String beginningF = "Vous entrez dans la foret torturee, vous allez a present faire face a plusieurs choix qui determinerons votre destin, dont vous seul (ainsi que votre de) etes maitre.";
        String wrappedbeginningF = wrapTexte(beginningF);
        System.out.println(wrappedbeginningF);
    }

    public void displayBeginningMontagne() {
        String beginningM = "Vous vous approchez de la montagne. Au bout de quelques pas, vous vous rendez compte qu'une grande porte se dessine devant vous. Voila l'entree d'un donjon. Preparez bien vos armes, il va y avoir un long chemin a parcourir avant d'atteindre la Shogun.";
        String wrappedbeginningM = wrapTexte(beginningM);
        System.out.println(wrappedbeginningM);
    }

    public String wrapTexte(String texte) {
        final int largeurMax = 70;
        String[] separationTexte = texte.split("");
        String texteFinal = "";
        String ligne = "";

        for (int i = 0; i < separationTexte.length; i++) {
            if (ligne.isEmpty()) {
                ligne += separationTexte[i];
            } else if (ligne.length() + separationTexte[i].length() < largeurMax) {
                ligne += separationTexte[i];
            } else {
                texteFinal += ligne + "\n";
                ligne = "";
            }
        }

        if(!ligne.isEmpty()){
            texteFinal += ligne + "\n";
        }

        return texteFinal;
    }

    public void clear(){
        for(int i = 0; i < 20; i++) //fonction clear
        {
            System.out.println("\b");
        }
    }

    public void displayMenu() {
        Scanner sc=new Scanner(System.in);
        int choix = 0;

        System.out.println("Quel sera votre choix ?");
        System.out.println("1 - Contourner par la foret sifflante");//histoire dont vous êtes le héros
        System.out.println("2 - Franchir la montagne silencieuse"); //donjon
        System.out.println("3 - Selectionner un heros");
        System.out.println("4 - Je veux partir. ");
        System.out.println("Taper votre choix :                                       ");
        choix=Integer.parseInt(sc.nextLine());// <--- ligne modifiée
        switch (choix) {
            case 1 -> {
                clear();
                displayBeginningForet();
            }
            case 2 -> {
                clear();
                displayBeginningMontagne();
            }
            case 3 -> {
                clear();
                System.out.println("Ecran de selection du heros");
                choixHeros.selection();
                displayMenu();
            }
            case 4 -> {
                clear();
                System.out.println("En esperant vous revoir bientot, voyageur.");
            }
            default -> System.out.println("Veuillez respecter le menu!");
        }
    }

}
