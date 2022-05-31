/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaClass;

/**
 *
 * @author Alex
 */
public class SportBallon extends Sport implements ITerrain{

    private int largeur;
    private int longueur;
    
    public SportBallon(String unNom, int unNbJoueur, int uneLargeur, int uneLongueur)
    {
        super(unNom, unNbJoueur);
        this.largeur = uneLargeur;
        this.longueur = uneLongueur;
    }
    
    @Override
    public String GetDescription()
    {
        return super.GetDescription() + " Terrain= " + GetLargeur() + " * " + GetLongueur();
                
    }
    
    @Override
    public int GetLargeur() {
        return this.largeur;
    }

    @Override
    public int GetLongueur() {
        return this.longueur;
    }
    
}
