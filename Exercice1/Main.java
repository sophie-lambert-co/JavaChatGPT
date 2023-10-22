package Exercice1;
public class Main {

    public static void main(String[] args) {

        // J'accède a mes variables de class
        System.out.println(" la variable a satic et public est : " + MathUtil.a);

        MathUtil instanceMathUtil = new MathUtil(1, 2, 3, 4);

        int variableb = instanceMathUtil.b;
        System.out.println("la variable b public et non static est : " + variableb);

        // J'accède a mes variables de class
        System.out.println(" la variable a satic et public est : " + MathUtil.a);

        System.out.println("la valeur de la variable private c est : " + instanceMathUtil.getC());

        System.out.println("La valeur de div et de sortieDeSous : " + instanceMathUtil.sortieDeSous(3,4));
    }

}
