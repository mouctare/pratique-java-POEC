package livres;

public class Main {
    public static void main(String[] args) {
        Livre livre1  = new Livre("La programmation orienté objet", "Christophe");
        System.out.println("Le titre du livre est : " + livre1.getTitre() + "l'auteur et Mr " + livre1.getAuteur());
       
    }
}
