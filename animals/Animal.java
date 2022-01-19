package animals;

class Animal{
    private String prenom;
    private String couleur;
    private int age;

     
    public Animal(){};

    public Animal(String prenom){
        this.prenom = prenom;
    };
    public Animal(String prenom , int age){
        this(prenom);
        this.age = age;
    };

   public Animal(String prenom, String couleur, int age){
        this(prenom, age);
        this.couleur = couleur;
      
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
  
         public String getPrenom(){
            return prenom;
        }
        public void setPrenom(String prenom){
            this.prenom = prenom;
        }
        public String getCouleur(){
            return couleur;
        }
        public void setCouleur(String couleur){
            this.couleur = couleur;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
       }
    
}