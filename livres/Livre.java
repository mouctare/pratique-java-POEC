package livres;



public class Livre {
    private String titre;
    private String auteur;
    private String anneEdition;
    private String numeroISBN;
 
    public Livre(String titre, String auteur){
        this.titre = titre;
        this.auteur = auteur;
    }

   public Livre(String titre,String auteur, String anneEdition, String numeroISBN){
        this(titre, auteur);
        
         this.anneEdition = anneEdition;
         this.numeroISBN = numeroISBN;

   }


public String getTitre(){
    return titre;
}
public void setTitre(String titre){
    this.titre = titre;
}
public String getAuteur(){
    return auteur;
}
public void setAuteur(String auteur){
    this.auteur = auteur;
}
public String getAnneEdition(){
    return anneEdition;
}
public void setAnneEdition(String anneEdition){
    this.anneEdition = anneEdition;
}
public String getNumeroISBN(){
    return numeroISBN;
}
public void setNumeroISBN(String numeroISBN){
    this.numeroISBN = numeroISBN;
}

}
