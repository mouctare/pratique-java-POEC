package livres;



public class Livre {
    private String titre;
    private String auteur;
    private String anneEdition;
    private String numeroISBN;
    private Editeur editeur;
 
    public Livre(Editeur editeur){
        this.editeur = editeur;
        
    }
    public Livre(String titre, String auteur ){
        this.titre = titre;
        this.auteur = auteur;
        
    }
    public Livre(String titre, String auteur,  String anneEdition ){
        this(titre, auteur);
         this.anneEdition = anneEdition;
    }

   public Livre(String titre,String auteur, String anneEdition, String numeroISBN){
        this(titre, auteur, anneEdition);
         this.numeroISBN = numeroISBN;
  }
  // add livre
 public void ajoutEditeur(Editeur editeur){
     this.editeur = editeur;
 }

 public String afficheLivre(){
    return this.getTitre() + " "  + this.getAuteur()+ " " + this.getAnneEdition() + " " + this.getNumeroISBN()+ " "  + this.getEditeur().afficheEditeur();

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

public Editeur getEditeur(){
    return editeur;
}
public void setEditeur(Editeur editeur){
this.editeur = editeur;
}
}
