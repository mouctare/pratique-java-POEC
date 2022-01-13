package animals;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Médor", "marron", 3);
        animal1.presentation();
        animal1.manger();
        animal1.boire();
        System.out.println(animal1.ageHumain());

        
        Animal animal2 = new Animal("Filou", "orange", 4);
        animal2.presentation();
        animal2.manger();
        animal2.boire();
        System.out.println(animal2.ageHumain());

        Animal animal3 = new Animal("Noisette", "gris", 2);
        animal3.presentation();
        animal3.manger();
        animal3.boire();
        System.out.println(animal3.ageHumain());
    }
    
}
