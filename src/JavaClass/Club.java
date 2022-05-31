/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaClass;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Club implements Comparable<Club>{
    private int IdClub;
    private String nomClub;
    private int nbPoints;
    private ArrayList<Sport> lesSports;
    
    public Club(int unId, String unNom, int unNbPoints)
    {
        this.IdClub = unId;
        this.nomClub = unNom;
        this.nbPoints = unNbPoints;
        lesSports = new ArrayList();
    }

    /**
     * @return the IdClub
     */
    public int getIdClub() {
        return IdClub;
    }

    /**
     * @return the nomClub
     */
    public String getNomClub() {
        return nomClub;
    }

    /**
     * @return the nbPoints
     */
    public int getNbPoints() {
        return nbPoints;
    }

    /**
     * @return the lesSports
     */
    public ArrayList<Sport> getLesSports() {
        return lesSports;
    }
    
    public void AjouterSport(Sport sport)
    {
        lesSports.add(sport);
    }

    @Override
    public int compareTo(Club o) {
        return o.getNomClub().compareTo(this.nomClub);
    }
    
    
    
    
    
}
