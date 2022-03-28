package Data;

public abstract class ClasseHeros {
    protected int PV;
    protected int Attaque;
    protected int Défense;
    protected int MaîtriseElem;
    protected int Stamina;

    public ClasseHeros(int PV, int attaque, int défense, int maîtriseElem, int stamina) {
        this.PV = PV;
        Attaque = attaque;
        Défense = défense;
        MaîtriseElem = maîtriseElem;
        Stamina = stamina;
    }

}
