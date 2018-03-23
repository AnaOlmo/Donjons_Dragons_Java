package jeux;

import java.util.Scanner;

public class Bataille {

    protected static Scanner sc;
    protected static Personnage personnages[] = new Personnage[10]; //Tableau contenant les personnages, tableau d'objets Personnage
    protected static int nbPersonnage = 0;

    public static void main(String[] args) {
        Boolean reponse = true;
        int i = 0;
        String choixPersonnage;

        System.out.println("Commencez le jeu!");
        sc = new Scanner(System.in);
        int choix;

        do {
            AfficherMenu();
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    CreerPersonnage();
                    break;
                case 2:
                    AfficherPersonnage();
                    break;
                case 3:
                    ModifierPersonnage();
                    break;
                case 4:
                    LancerAttaque();
                    break;
                case 5:
                    AjouterSortArme();
                default:
                    System.out.println("Erreur, recommence");
            }
            System.out.println("See u !");

        } while (choix != 5);
    }

    // Affichage du tableau des personnages
    public static void AfficherPersonnage() {
        for (int i = 0; i < nbPersonnage; i++) {
            System.out.println(personnages[i]);
        }
    }
    //**************Méthode permettant d'afficher le menu******************//
    public static void AfficherMenu() {
        System.out.println(" Que voulez-vous faire ? ");
        System.out.println(" \n1 -Créer un nouveau personnage ?");
        System.out.println(" \n2 -Afficher les informations de vos personnages ?");
        System.out.println(" \n3 -Modifier les infos de votre personnage ?");
        System.out.println(" \n4 -Attaquer?");
        System.out.println(" \n5 -Ajouter un sort ou une arme ?");
        System.out.println(" \n6 Quitter");
    }
    public static void CreerPersonnage() {
        String choixPersonnage;
        System.out.println("Choisir votre personnage : \n1.Guerrier ou \n2.Magicien");
        choixPersonnage = sc.nextLine();

        if (choixPersonnage.equals("1")) {
            System.out.println("Vous avez choisi de créer un guerrier");
            CreerGuerrier();
        }

        if (choixPersonnage.equals("2")) {
            System.out.println("Vous avez choisi de créer un magicien");
            CreerMagicien();
        }
    }

    public static void ModifierPersonnage(){

            int choixModification;
            String newNom;

            System.out.println("Quel personnage souhaitez-vous modifier ?");
            for (int i = 0; i < nbPersonnage; i++)
            {
                System.out.println("\n" + i + ". "+ personnages[i].getNom());
            }
            choixModif = sc.nextInt();
            sc.nextLine();
            System.out.println(personnages[choixModification]);
            System.out.println("Nouveau nom pour : "+ personnages[choixModification].getNom());
            newNom = sc.nextLine();
            personnages[choixModification].setNom(newNom);
            System.out.println("Nouveau nom "+ personnages[choixModification].getNom());

        }
    public static void LancerAttaque(){

    }
    public static void AjouterSortArme(){

    }
    public static void CreerGuerrier() {
        //************** création du personnage*****************//
        Guerrier guerrier1 = new Guerrier();
        //***************Ajout du personnage dans le tableau personnages**************//
        personnages[nbPers] = guerrier1;
        //****************Incrémente le nombre de personnage dans le tableau**********//
        nbPers++;
        //****************choix du nom************************************************//
        System.out.println("Choisir le nom : ");
        guerrier1.setNom(entre.creerNom());//mutateur (setter) de la classe personnage, Appelle la méthode dans la classe creer
        //****************choix image**************************************************//
        System.out.println("Choisir votre image : ");
        guerrier1.setImage(entre.creerImage());
        //****************choix arme**************************************************//
        System.out.println("Choisir votre arme : ");
        guerrier1.setArme(entre.creerArme());
        //******************choix niveau vie*********************************************//
        System.out.println("Quel est le niveau de vie : ");
        guerrier1.setVie(entre.creerVie());
        //*****************choix force attaque******************************************//
        System.out.println("Quel est le niveau de force d'attaque : ");
        guerrier1.setAttaque(entre.creerAttaque());
        //****************choix niveau bouclier****************************************//
        System.out.println("Quelle force souhaitez-vous donner au bouclier de votre guerrier ?");
        guerrier1.setBouclier(entre.creerBouclier());
        //Affiche le nom du personnage créé avec le message "personnage créé"
        System.out.println("***********************************************");
        System.out.println("Votre guerrier " + guerrier1.getNom() + " est créé");
        System.out.println("***********************************************");
    }


    public static void CreerMagicien() {

        Magicien magicien1 = new Magicien();
        personnages[nbPers] = magicien1;
        nbPers++;
        System.out.println("Choisir le nom : ");
        magicien1.setNom(entre.creerNom());//mutateur (setter) de la classe personnage, Appelle la méthode dans la classe creer
        System.out.println("Choisir votre image : ");
        magicien1.setImage(entre.creerimage());
        System.out.println("Choisir votre sort : ");
        magicien1.setSort(entre.creerSort());
        System.out.println("Quel est le niveau de vie : ");
        magicien1.setVie(entre.creerVie());
        System.out.println("Quel est le niveau de force d'attaque : ");
        magicien1.setAttaque(entre.creerAttaque());
        System.out.println("Quelle force souhaitez-vous donner au philtre de votre magicien ?");
        magicien1.setPhiltre(entre.creerPhiltre());
        //Affiche le nom du personnage créé avec le message "personnage créé"
        System.out.println("***********************************************");
        System.out.println("Votre magicien " + magicien1.getNom() + " a été créé");
        System.out.println("***********************************************");
    }
}


/*Afficher la liste des personnages : boucle sur le tableau personnages ******//
        /*System.out.println("Choisissez votre personnage");
        AfficherUneListe(personnages);//appel methode AfficherUneListe ligne 223

        //*******Récupérer le choix de l'utilisateur pour le personnage sélectionné ***********//
        /*int persoSelected = sc.nextInt();

        //**********Afficher les infos du personnage sélectionné ***************//
        /*System.out.println(personnages[persoSelected]);
        break;





