// Exercice 2 - Niveau Facile :

// Objectif : Manipuler les collections en Java.

// Énoncé : Créez une classe Student avec des attributs tels que id, name, et score. Ensuite, créez une classe StudentManager qui gère une liste de ces objets Student. Ajoutez des étudiants à la liste, supprimez-les, et affichez la liste des étudiants dans le main.


package Exercice2;

// Je crée ma class 
public class Student {
    private int id;
    private String name;
    private int score;  



//Je crée le constructeur 
public Student ( int id, String name, int score){
    this.id= id;
    this.name = name ;
    this.score =score;
    }


 // Ajoutez une méthode toString personnalisée
    @Override
    public String toString() {
        return  " Name: " + name +
                ", ID: " + id +
                ", Score: " + score;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
