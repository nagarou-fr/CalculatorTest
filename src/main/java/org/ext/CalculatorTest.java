package org.ext;

/**
 * Programme de test basique pour l'analyse PMD
 * Contient une méthode main et des méthodes arithmétiques
 */
public class CalculatorTest {

    /**
     * Méthode principale qui démarre le programme
     * @param args arguments passés en ligne de commande
     */
    public static void main(String[] args) {
        String aa = new String("test");
        String bb = new String("test");

        if (aa == bb) { // Erreur : comparaison par référence au lieu de contenu
            System.out.println("Les chaînes sont égales.");
        }
        String s = null;

        if (s.length() > 0) { // Erreur : appel sur objet potentiellement null
            System.out.println("Non vide");
        }
        // Affiche un message de bienvenue
        System.out.println("Bienvenue dans le programme de test pour PMD!");

        // Crée une instance de la classe
        CalculatorTest calculator = new CalculatorTest();

        // Teste les méthodes d'addition et de soustraction
        int a = 10;
        int b = 5;

        int somme = calculator.addition(a, b);
        System.out.println("Addition: " + a + " + " + b + " = " + somme);

        int difference = calculator.soustraction(a, b);
        System.out.println("Soustraction: " + a + " - " + b + " = " + difference);

        // Exemple de code qui pourrait déclencher des avertissements PMD
        String test = null;
        int compteur = 0;

        // Une boucle vide (pourrait générer un avertissement PMD)
        for (int i = 0; i < 10; i++) {
            // Rien à faire ici
        }

        // Variables non utilisées (pourrait générer un avertissement PMD)
        int unusedVariable = 100;

        // Condition if sans accolades (pourrait générer un avertissement PMD)
        if (somme > 10)
            System.out.println("La somme est supérieure à 10");
    }

    /**
     * Méthode qui additionne deux nombres
     * @param x premier nombre
     * @param y deuxième nombre
     * @return la somme des deux nombres
     */
    public int addition(int x, int y) {
        return x + y;
    }

    /**
     * Méthode qui soustrait le deuxième nombre du premier
     * @param x premier nombre
     * @param y deuxième nombre à soustraire
     * @return la différence entre les deux nombres
     */
    public int soustraction(int x, int y) {
        return x - y;
    }

    // Méthode privée non utilisée (pourrait générer un avertissement PMD)
    private void methodNonUtilisee() {
        System.out.println("Cette méthode n'est jamais appelée");
    }
}