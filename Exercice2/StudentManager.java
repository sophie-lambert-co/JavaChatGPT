package Exercice2;

import java.util.ArrayList;
import java.util.List;

// créez une classe StudentManager qui gère une liste de ces objets Student. Ajoutez des étudiants à la liste, supprimez-les, et affichez la liste des étudiants dans le main.

// J'instancie ma class StudentManager
public class StudentManager {
    //je cree une list en important la bibliothèque List et ArrayList . Dans cette Liste je vais stocker des objet " Student" et ma list se nome students .
    private List<Student> students = new ArrayList <>();

    //Je cree le constructeur de ma class StudentManager;
    public StudentManager(){
    
    // Je déclare des objets de type Student avec des attributs uniques.
    Student nouvelEtudiant1 = new Student(1,"Harley",90);
    Student nouvelEtudiant2 = new Student(2,"Barbie",30);
    Student nouvelEtudiant3 = new Student(3,"Raiponce",50);

    
    // J'ajoute ces objets (qui sont mes étudiants) à ma liste "students".
    students.add(nouvelEtudiant1);
    students.add(nouvelEtudiant2);
    students.add(nouvelEtudiant3);

    students.remove(1);

    Student nouvelEtudiant4 = new Student(4,"Clochette",50);

    students.add(nouvelEtudiant4);


    
}

    public List<Student> getStudents() {
        return students;
    }
}

