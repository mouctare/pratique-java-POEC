package livres;



public class Livre {
    private String titre;
    private String auteur;
    private String anneEdition;
    private String numeroISBN;
 

   public Livre(String titre,String auteur, String anneEdition, String numeroISBN){
         this.titre = titre;
         this.auteur = auteur;
         this.anneEdition = anneEdition;
         this.numeroISBN = numeroISBN;

   }

   public void info(){
    System.out.println("Je m'appelle " + auteur + " , " + "le titre de mon livre est " + titre + " il a été édité le " + anneEdition + " ," + " le numéro ISBN est le : " + numeroISBN);
}
   public void afficheTitreEtAuteur(){
    System.out.println("Le titre du livre est "  + titre  + " il a été écrit par " + auteur);
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
    return auteur;
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
