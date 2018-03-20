package jeux;

public class Magicien extends Personnage {
    /* String nom;
    String image;
    int niveauVie;
    int forceAttaque; */
    String sortilege;
    int philtre;

        
        /* //Constructeur par défaut
        public Magicien(){
          System.out.println("Création d'un magicien !");      
          nomMagicien = "Inconnu";
          nomSort = "Inconnu";
          nbreVie = 0;
          nbrAttaque =0;
        } 
        //Constructeur avec paramètres
        public Magicien(String pNom, String pSort, int pVie, int pAttaque){
            System.out.println("Création d'un magicien avec paramétres!");
            nomMagicien = pNom;
            nomSort = pSort;
            nbreVie = pVie;
            nbrAttaque = pAttaque;
        }
      } */

      //ACCESSEURS//
    
      public String getSort() {
        return sortilege;
    }

    public int getPhiltre() {
        return philtre;
    }

    // MUTATEURS//

    public void setSort(String pSort){
        sortilege = pSort;
    }

    public void setPhiltre(int pPhiltre){
        philtre = pPhiltre;
    }

    // Méthode toString : Affiche les informations d'un objet
    public String toString(){
        return super.toString() + "\nSort : " + sortilege + "\nPhiltre : " + philtre;
    }
}    

