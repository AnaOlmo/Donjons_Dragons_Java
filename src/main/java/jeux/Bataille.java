package jeux;

import java.util.Scanner;

public class Bataille {
    
      public static void main(String[] args) {
      /* Guerrier guerrier = new Guerrier();
      System.out.println(guerrier.nomGuerrier);
      guerrier.nomGuerrier = "Valdemor";
      System.out.println(guerrier.nomGuerrier);

      Magicien magicien = new Magicien();
      System.out.println(magicien.nomMagicien);
      magicien.nomMagicien = "Merlin";
      System.out.println(magicien.nomMagicien);

      Magicien magicien1 = new Magicien("Cruella", "test", 20 , 20 );
      System.out.println(magicien1.nomSort);
      magicien.nomSort = "poudre";
      System.out.println(magicien1.nomSort); */
      
      
      Scanner sc = new Scanner(System.in);
     
      System.out.println("Choisir votre personnage : 1.Guerrier ou 2.Magicien ?");
      String strPersonnage = sc.nextLine();
      System.out.println("Vous avez saisi : " + strPersonnage);
      //Tableau contenant personnages//
      Personnage personnages[] = new Personnage[10];
      int nbPers =0;
   /*    //voir les 10 personnages en utilisant une boucle
    System.out.println("Entrer 10 caracteres:");
    for (int nbPers=0;nbPers<10;nbPers++) {
      caracteres[nbPers]=sc.nextInt();//assigne le caractere au tableau
    }//end of for */

      //condition//
        if (strPersonnage.equals("Guerrier")){
      // création du personnage//
      Guerrier guerrier = new Guerrier();
      //Ajout du personnage dans le tableau personnages
      personnages[nbPers]=guerrier; 
      //Incrémente le nombre de personnage dans le tableau
      nbPers++;       
      
      //choix du nom//  
      System.out.println("Choisir votre nom : ");
      String nomName = sc.nextLine();
      guerrier.setNom(nomName);

      //choix image//  
      System.out.println("Choisir votre image : ");
      String nomImage = sc.nextLine();
      guerrier.setImage(nomImage);

      //choix arme ou sort//
      System.out.println("Choisir votre arme : ");
      String nomArme = sc.nextLine();
      guerrier.setArme(nomArme);

      //choix niveau vie//
      System.out.println("Quel est le niveau de vie : ");
      int nomVie = sc.nextInt();
      guerrier.setVie(nomVie);
      
      //choix niveau attaque//
      System.out.println("Quel est le niveau d'attaque : ");
      int nomAttaque = sc.nextInt();
      guerrier.setAttaque(nomAttaque);

      //choix niveau bouclier//
      System.out.println("Quelle force souhaitez-vous donner au bouclier de votre guerrier ?");
      int nomBouclier = sc.nextInt();
      guerrier.setBouclier(nomBouclier);

      
      //choix multiple - Afficher/modifier/attaquer/ajouter les infos du personnage créé
      System.out.println( " \n1 -Afficher les informations de votre guerrier ?");
      System.out.println( " \n2-Modifier les infos de votre personnage ?");
      System.out.println( " \n3-Attaquer?");
      System.out.println( " \n4-Ajouter une arme?");
      //System.out.println( " \n5-Afficher tous les personnages crées?");

      System.out.println("Entrez votre choix:");

      //Get user's choice
      int choice = sc.nextInt();

      //Display the choice of user
      switch (choice) {
        case 1: System.out.println(" Nom : "+ nomName + "\nImage : " + nomImage + "\nArme : " + nomArme + "\nNiveau de vie : " + nomVie + "\nForce Attaque : " + nomAttaque + "\nBouclier : " + nomBouclier); 
 break;
        case 2: System.out.println("Modifier");
                break;
        case 3: System.out.println("Attaquer"); 
                break;
        case 4: System.out.println("Ajouter arme"); 
                 break;
        /* case 5: System.out.println("es personnages créés sont:");
        for (int nbPers=0;nbPers<10;nbPers++) 
            System.out.print(caracteres[nbPers]+" "); 
                 break; */
        default: System.out.println("Choix invalide");
    }//end of switch  
        System.out.println("Voulez-vous réessayer  ?");
        System.out.println(" \n1 :O \n2 :N");
        System.out.println("Entrez votre choix:");

        //Get user's choice
      int choice1 = sc.nextInt();

      //Display the choice of user
      switch (choice1) {
        case 1: System.out.println("Choisir votre personnage : 1.Guerrier ou 2.Magicien ?");
                System.out.println( " \n1 -Afficher les informations de votre guerrier ?");
                System.out.println( " \n2-Modifier les infos de votre personnage ?");
                System.out.println( " \n3-Attaquer?");
                System.out.println( " \n4-Ajouter une arme?"); 
                  break;
        case 2: System.out.println("Good bye");
      }
    }
      

      else if (strPersonnage.equals("Magicien")){
        // création du personnage//
        Magicien magicien = new Magicien();
        //Ajout du personnage dans le tableau personnages
        personnages[nbPers]=magicien; 
        //Incrémente le nombre de personnage dans le tableau
        nbPers++;       
        
        //choix du nom//  
        System.out.println("Choisir votre nom : ");
        String nomName = sc.nextLine();
        magicien.setNom(nomName);
  
        //choix image//  
        System.out.println("Choisir votre image : ");
        String nomImage = sc.nextLine();
        magicien.setImage(nomImage);
  
        //choix arme ou sort//
        System.out.println("Choisir votre sort : ");
        String nomSort = sc.nextLine();
        magicien.setSort(nomSort);
  
        //choix niveau vie//
        System.out.println("Quel est le niveau de vie : ");
        int nomVie = sc.nextInt();
        magicien.setVie(nomVie);
        
        //choix niveau attaque//
        System.out.println("Quel est le niveau d'attaque : ");
        int nomAttaque = sc.nextInt();
        magicien.setAttaque(nomAttaque);
  
        //choix niveau philtre//
        System.out.println("Quelle force souhaitez-vous donner au philtre de votre magicien ?");
        int nomPhiltre = sc.nextInt();
        magicien.setPhiltre(nomPhiltre);
  
        
         //choix multiple - Afficher/modifier/attaquer/ajouter les infos du personnage créé
      System.out.println( " \n1 -Afficher les informations de votre magicien ?");
      System.out.println( " \n2-Modifier les infos de votre personnage ?");
      System.out.println( " \n3-Attaquer?");
      System.out.println( " \n4-Ajouter un sort?");
      //System.out.println( " \n5-Afficher tous les personnages crées?");

      System.out.println("Entrez votre choix:");

      //Get user's choice
      int choice = sc.nextInt();

      //Display the choice of user
      switch (choice) {
        case 1: System.out.println(" Nom : "+ nomName + "\nImage : " + nomImage + "\nSort : " + nomSort + "\nNiveau de vie : " + nomVie + "\nForce Attaque : " + nomAttaque + "\nPhiltre : " + nomPhiltre); 
                break;
        case 2: System.out.println("Modifier");
                break;
        case 3: System.out.println("Attaquer"); 
                break;
        case 4: System.out.println("Ajouter sort"); 
                 break;
        /* case 5: System.out.println("es personnages créés sont:");
        for (int nbPers=0;nbPers<10;nbPers++) 
            System.out.print(caracteres[nbPers]+" "); 
                 break; */
        default: System.out.println("Choix invalide");
    }//end of switch  
        System.out.println("Voulez-vous réessayer  ?");
        System.out.println(" \n1 :O \n2 :N");
        System.out.println("Entrez votre choix:");

        //Get user's choice
      int choice1 = sc.nextInt();

      //Display the choice of user
      switch (choice1) {
        case 1: System.out.println("Choisir votre personnage : 1.Guerrier ou 2.Magicien ?");
                System.out.println( " \n1 -Afficher les informations de votre magicien ?");
                System.out.println( " \n2-Modifier les infos de votre personnage ?");
                System.out.println( " \n3-Attaquer?");
                System.out.println( " \n4-Ajouter un sort?"); 
                  break;
        case 2: System.out.println("Good bye");
      }
    }       
           

           sc.close();
           
      /* Guerrier guerrier = new Guerrier();
      String thisname = "Coin-Coin warrior";
      String thisweapon = "sabre";
    
      guerrier.setName(thisname);
      guerrier.setWeapon(thisweapon);
      guerrier.setlifeLevel(25);
      guerrier.setattackStrenght(50);

      guerrier.Guerrier(); */
      
        } 
      }
