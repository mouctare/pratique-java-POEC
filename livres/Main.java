package livres;

public class Main {
    public static void main(String[] args) {
        Livre livre1  = new Livre("La programmation orienté objet", "Christophe", "12/01/2022", "1256FNB8 .");
        livre1.info();
        livre1.afficheTitreEtAuteur();
        Livre livre2  = new Livre("Java database conectivity(JDBC)", "Christian", "10/11/2021", "1256FNB899 .");
        livre2.info();
        livre2.afficheTitreEtAuteur();
        Livre livre3  = new Livre("L'Héritage en POO", "Jean-Michel", "02/01/2022", "15666FNB8 .");
        livre3.info();
        livre3.afficheTitreEtAuteur();
        Livre livre4  = new Livre("Spring Boot ", "Christophe", "1/01/2022", "14456FNB8 .");
        livre4.info();
        livre4.afficheTitreEtAuteur();
        Livre livre5  = new Livre("Le polymorphysme en java", "Tristan", "01/01/2022", "126656FNB8 .");
        livre5.info();
        livre5.afficheTitreEtAuteur();
    }
}
