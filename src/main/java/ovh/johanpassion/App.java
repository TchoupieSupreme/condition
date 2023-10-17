package ovh.johanpassion;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int salaire = 400;
        int prime = 250;
        int quotas = 10;
        System.out.print("Combien avez-vous fait de ventes ?");
        int nbVente = clavier.nextInt();
        if (nbVente>=quotas){
            salaire = salaire+prime;
            System.out.println("Félicitations, votre salaire est de "+ salaire+ " € car vous avez reçu une prime !");
        }else{
            System.out.println("Vous n'avez pas rempli le quotas il vous manquais "+(quotas-nbVente)+" ventes pour avoir la prime, votre salaire est donc de "+salaire+" €");
        }
        
        clavier.close();
    }
    
}
