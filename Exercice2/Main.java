package Exercice2;

import java.util.List;

// Je déclare la classe Main
public class Main {
    // je déclare la methode main, main accepte un tableau (tableau unidimensionnel) de chaînes de caractères (type String) appelé args. Le tableau args est généralement utilisé pour passer des arguments au programme lors de son exécution à partir de la ligne de commande.
    public static void main(String[] args){

    //À l'intérieur de la méthode main, nous créons une instance de la classe StudentManager 
    //Cela crée un nouvel objet StudentManager, que nous utilisons pour gérer les étudiants.
     StudentManager StudentManager = new StudentManager();

     //Ensuite, nous utilisons StudentManager pour obtenir une liste d'étudiants 
    List<Student> students = StudentManager.getStudents();
    
    System.out.println("Liste des étudiants :");
        for (Student student : students) {
            System.out.println(student);  // Appel à la méthode toString personnalisée
            System.out.println();  // Saut de ligne
        }
       
    }
    
}
