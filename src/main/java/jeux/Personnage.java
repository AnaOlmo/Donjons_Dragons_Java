package jeux;
public abstract class Personnage {
    //public abstract String sayHello ();

    //Stocke variable
    private String nom;
    private String arme;
    private String image;
    private int nbreVie;
    private int nbreAttaque;

    //Accesseurs//

    //Retourne nom
    public String getNom(){
        return nom;
    }    
    //Retourne arme
    public String getArme(){
        return arme;  
    }    
    ////Retourne image
    public String getImage(){
        return image;  
    }    
    //Retourne niveau vie
    public int getVie(){
        return nbreVie;  
    }    
    //Retourne force attaque
    public int getAttaque(){
        return nbreAttaque;    
    }    

     //mutateurs//
     
    // Définit le nom
    public void setNom(String pNom){
        nom = pNom;   
    }
    //Définit arme
    public void setArme(String pArme){
        arme = pArme;
    }
    ////Définit image
    public void setImage(String pImage){
        image = pImage;
    }
    //Définit le niveau vie
    public void setVie(int pVie){
        nbreVie = pVie;
    }
    //Définit la force attaque
    public void setAttaque(int pAttaque){
        nbreAttaque = pAttaque;  
    }
    // Méthode toString : Affiche les informations d'un objet
    public String toString(){
        return "Nom : "+ nom + "\nImage : " + image + "\nArme : " + arme + "\nNiveau de vie : " + nbreVie + "\nForce Attaque : " + nbreAttaque;
    }
}