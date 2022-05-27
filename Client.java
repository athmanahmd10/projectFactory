import java.util.Scanner;

public class Client{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choisissez une méthode pour cracker votre mot de passe");
        System.out.println("1. Force brute");
        System.out.println("2. Dictionnaire");
        System.out.print("> ");
        int method = sc.nextInt();
        System.out.println("Veuillez saisir le mot de passe");
        
        //Récupération de l'instance corresppondante
        Hacker myInstance = Factory.getInstance(method);

        //Appel de la fonction qui permet de pirater le mot de passe de l'utilisateur.
        myInstance.searchPassword(); 
        sc.close();
    }
}