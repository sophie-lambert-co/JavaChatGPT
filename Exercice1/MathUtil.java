package Exercice1;
// Exercice 1 - Niveau Très Facile :

// Objectif : Comprendre les variables et les méthodes statiques.

// Énoncé : Créez une classe MathUtil qui contient une méthode statique add prenant deux entiers en paramètres et renvoyant leur somme. Utilisez cette méthode pour ajouter deux nombres et affichez le résultat dans la méthode main.


// La class et ses attributs
public class MathUtil {
    static public int a;
     public int b;
     private int c;
     private int d;
     
// le constructeur 
public MathUtil(int a, int b, int c, int d){
    this.b = b;
    this.c = c;
    this.d = d;
    MathUtil.a = a; // cette variable peut être déclaré uniquement au dessus dans la class MathUtil.
}

public MathUtil(){

}


public static int add(int a, int b){
    return a + b;
    }


public int getD() {
    return d;
}

private int sous(int c, int d){
    return c - d; 
}

public double sortieDeSous(int c,int d){
    double g=sous(c,d);
    return g; 
}

public int getC(){
    return c;
}

public void setD(int d){
   this.d = d;
}
   
}