/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaClass;

/**
 *
 * @author Alex
 */
public class Sport implements ISport, ISportCollectif{
    private String nomSport;
    private int nbJoueur;
    
    public Sport(String unNom, int unNbJoueur)
    {
        this.nomSport = unNom;
        this.nbJoueur = unNbJoueur;
    }

    @Override
    public String GetNomSport() {
        return this.nomSport;
    }

    @Override
    public String GetDescription() {
        return "Sport =" + this.nomSport + " Nombre de joueur=" + this.nbJoueur;
    }

    @Override
    public int GetNbJoueur() {
        return this.nbJoueur;
    }
    
    
}
