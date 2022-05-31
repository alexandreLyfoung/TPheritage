/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaClass;

/**
 *
 * @author Alex
 */
public class SportRelais extends Sport{
    
    private int distance;
    
    public SportRelais(String unNom, int uneDistance, int unNbJoueur)
    {
        super(unNom, unNbJoueur);
        this.distance = uneDistance;
    }
    
    
    
    @Override
    public String GetDescription()
    {
        return super.GetDescription() + " Distance = " + getDistance();
    }

    /**
     * @return the distance
     */
    public int getDistance() {
        return distance;
    }
}
