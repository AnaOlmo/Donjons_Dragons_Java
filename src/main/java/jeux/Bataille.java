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
      System.out.println("Choisir votre arme ou sort : ");
      String nomSort = sc.nextLine();
      guerrier.setArme(nomSort);

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

      
      //Afficher les infos du personnage créé
      System.out.println(guerrier);
      


           //System.out.println("Hello, Java!");

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
} 