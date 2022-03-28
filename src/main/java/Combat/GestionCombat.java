package Combat;

import Data.Ennemis;
import Data.Personnages;

public interface GestionCombat {
    int recupNiveau();
    void setNiveau(final int level);
    int monterNiveau();
    boolean estVaincu();
    int recupHP();
    int recupHPmax();
    int setHP(final int newHP);
    void degat(final int degatInflige);
    boolean attaque(final Personnages Héros, final Ennemis cible);

}
