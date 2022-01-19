package bibliothèques;

import java.util.ArrayList;
import java.util.List;

import livres.Livre;

public class Bibliotheque{
    private String nom;
    private String adresse;
    private List<Livre>livres;


    public Bibliotheque(String nom,  String adresse){
        this.nom = nom;
        this.adresse = adresse;
        this.livres = new ArrayList<Livre>();
    }

    public void ajoutLivre(Livre livre){
        this.livres.add(livre);
      }

      public void ajouLivres(List<Livre> livres){
        for (Livre unLivre: livres) {
           ajoutLivre(unLivre);
        }

    }

   public void afficherLivres(){
       for (int i = 0; i < this.livres.size(); i++) {
       System.out.println("Les livres contenu dans la bibiliothèque sont: " +  " " + this.livres.get(i).afficheLivre());
              
          }

      }
      

 public void rechercheParTire(String titre){
    for(int i = 0; i <  this.livres.size(); i++){
        if(this.livres.get(i).getTitre() == titre){
            System.out.println(this.livres.get(i).afficheLivre());
           }
      }
        
   }
     
   public void rechercheEditeur(String nomEditeur ){
      for(int i = 0; i <  this.livres.size(); i++){
         if(this.livres.get(i).getEditeur().getNom() == nomEditeur){
          System.out.println(this.livres.get(i).afficheLivre());
         }
      }
     
      }
     
   public void rechercheAuter(String nom ){
    for(int i = 0; i <  this.livres.size(); i++){
    if(this.livres.get(i).getAuteur() == nom){
        System.out.println(this.livres.get(i).afficheLivre());
       }
    }
     
      }
     
     
 

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public String getAdresse(){
        return adresse;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
}