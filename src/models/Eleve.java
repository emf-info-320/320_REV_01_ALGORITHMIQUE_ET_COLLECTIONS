package models;

public class Eleve {

    private final String section;
    private final String classeMatu;
    private final String classePro;
    private final boolean estMasculin;
    private final String nom;
    private final String prenom;

    public Eleve(String section, String classeMatu, String classePro, boolean estMasculin, String nom, String prenom) {
        this.section = section;
        this.classeMatu = classeMatu;
        this.classePro = classePro;
        this.estMasculin = estMasculin;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getSection() {
        return section;
    }

    public String getClasseMatu() {
        return classeMatu;
    }

    public String getClassePro() {
        return classePro;
    }

    public boolean estMasculin() {
        return estMasculin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

}
