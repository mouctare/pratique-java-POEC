package livres;

public class Main {
    public static void main(String[] args) {
        Editeur editeur1 =  new Editeur("Eyrolles", "1925");
        Editeur editeur2 =  new Editeur("Eni", "1981");
       
        Livre livre1  = new Livre("Programmer en java", "de Claude Delannoy", "2020", "978-2-416-000018-8");
              livre1.ajoutEditeur(editeur1);

      System.out.println(livre1.afficheLivre());

      Livre livre2  = new Livre("Apprenez à programmer en java", "de Cyrille Herby");
      livre2.ajoutEditeur(editeur1);
      System.out.println(livre2.afficheLivre());

      Livre livre3  = new Livre("S'initier à la programmation objet", "de Claude Delannoy", "20216", "978-2-212-11826-1");
      livre3.ajoutEditeur(editeur1);
      System.out.println(livre3.afficheLivre());

      Livre livre4  = new Livre("Les fondamenteaux du langage", "de Thierry Groussard et Thierry Richard", "2029", "978-2-212-11826-1");
        livre4.ajoutEditeur(editeur2);
        System.out.println(livre4.afficheLivre());

      Livre livre5  = new Livre("Java Spring", "de Hervé Le Morvan", "2021");
        livre5.ajoutEditeur(editeur2);
        System.out.println(livre5.afficheLivre());


    
   
       
    }
}
