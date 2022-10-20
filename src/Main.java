import java.util.Scanner;

public class Main
{
    static void somme()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un entier: ");
        int premierEntier = scanner.nextInt();
        System.out.println("Saisir un deuxieme entier: ");
        int deuxiemeEntier = scanner.nextInt();

        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est egale à " + somme);
    }

    static void division()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir un entier: ");
        int a = sc.nextInt();
        System.out.println("Saisir un deuxieme entier: ");
        int b = sc.nextInt();

        float res = a/b;
        System.out.print("La division de " + a + " par " + b + " est égale à " + res);
    }

    static void volume()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Longueur: ");
        int longueur = sc.nextInt();
        System.out.println("Largeur: ");
        int largeur = sc.nextInt();
        System.out.println("Hauteur: ");
        int hauteur = sc.nextInt();

        int res = longueur*largeur*hauteur;
        System.out.println("Volume = " + res);
    }

    public static void main(String[] args)
    {
        somme();
        division();
        volume();
    }
}
