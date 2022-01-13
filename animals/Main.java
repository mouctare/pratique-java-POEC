package animals;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Médor");
        Animal animal2 = new Animal("Idéfix", "blanc", 5);
        System.out.println(animal1.getPrenom());
        System.out.println(animal2.getPrenom() + " " + animal2.getCouleur() + " " + animal2.getAge());
    
     
    
    }
    
}
