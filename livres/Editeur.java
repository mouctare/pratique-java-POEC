package livres;


public class Editeur{
    private String nom;
    private String anneeCreation;

 public Editeur(String nom, String anneeCreation){
    this.nom = nom;
    this.anneeCreation = anneeCreation;
}


public String afficheEditeur(){
    return "aux éditions " + this.nom + " " + this.anneeCreation;
}
 public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    
    public String getAnneCreation(){
        return anneeCreation;
    }

    public void setAnneCreation(String anneCreation){
        this.anneeCreation = anneCreation;
    }

}