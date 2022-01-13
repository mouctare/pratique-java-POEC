package livres;



public class Livre {
    public String titre;
    public String auteur;
    public String anneEdition;
    public String numeroISBN;
 

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
    
}
