package Data;

public class Personnages extends ClasseHeros {
    public String nom;
    public String element;
    public String classe;
    public String camp;
    public int pv;
    public int attaque;
    public int défense;
    public int maîtriseElem;
    public int niveau = 1;

    public Personnages(int PV, int attaque, int défense, int maîtriseElem, int stamina, String camp, String classe, String element, String nom) {
        super(PV, attaque, défense, maîtriseElem, stamina);
        this.camp = camp;
        this.classe = classe;
        this.element = element;
        this.nom = nom;
        this.PV = pv;
        this.attaque = attaque;
        this.défense = défense;
        this.maîtriseElem = maîtriseElem;
    }

}

