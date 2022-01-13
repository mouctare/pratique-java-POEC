package animals;

class Animal{
    public String prenom;
    public String couleur;
    public int age;
    int ageHumain;
     
   public Animal(String prenom, String couleur, int age){
       this.prenom = prenom;
       this.couleur = couleur;
       this.age = age;
   }
    public void presentation(){
        System.out.println("Je m'appelle " + prenom + "," + "je suis de couleur " + couleur + " et j'ai " + age + " ans ");
    }
    public void manger(){
        System.out.println("miam miam");
    }
    public void boire(){
        System.out.println("glou glou");
    }
    public int ageHumain(){
         return  7 * age;
      
    }
    
}