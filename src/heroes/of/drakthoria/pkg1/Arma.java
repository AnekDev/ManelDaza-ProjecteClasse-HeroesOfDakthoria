/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package heroes.of.drakthoria.pkg1;

/**
 * Classe que representa una arma en el joc Heroes of Drakthoria.
 * 
 * @author Manel
 * @version 1.0
 * @since 2025-03-23
 */
public class Arma {
    private String arma; 
    private int WPOW;
    private int WVEL;
    
    private static int numArmes = -1;
    
    /**
     * Constructor de la classe Arma.
     * 
     * @param nom Nom de l'arma.
     * @param WPOW Poder de l'arma.
     * @param WVEL Velocitat de l'arma.
     */
    public Arma(String nom, int WPOW, int WVEL){
        this.arma = nom;
        this.WPOW = WPOW;
        this.WVEL = WVEL;
        numArmes++;
    }
    
    /**
     * Constructor de còpia.
     * 
     * @param ar Objecte Arma a copiar.
     */
    public Arma(Arma ar){
        this(ar.arma, ar.WPOW, ar.WVEL);
    }
    
    /**
     * Retorna una representació en format String de l'objecte.
     * 
     * @return Cadena amb les propietats de l'arma.
     */
    @Override
    public String toString(){
        return "Arma Nom: " + this.arma + "\n" +
               "Poder Arma: " + this.WPOW + "\n" +
               "Velocitat Arma: " + this.WVEL;
    }
    
    /**
     * Obté el nom de l'arma.
     * 
     * @return Nom de l'arma.
     */
    public String getArma(){
        return this.arma;
    }
    
    /**
     * Obté el poder de l'arma.
     * 
     * @return Poder de l'arma.
     */
    public int getDanyArma(){
        return this.WPOW;
    }
    
    /**
     * Obté la velocitat de l'arma.
     * 
     * @return Velocitat de l'arma.
     */
    public int getVelArma(){
        return this.WVEL;
    }
    
    /**
     * Obté el nombre total d'armes creades.
     * 
     * @return Nombre d'armes creades.
     */
    public static int getNumArmes(){
        return numArmes;
    }
    
    /**
     * Estableix el nom de l'arma.
     * 
     * @param i Nou nom de l'arma.
     */
    public void setArma(String i){
        this.arma = i;
    }
    
    /**
     * Estableix el poder de l'arma.
     * 
     * @param i Nou valor de poder de l'arma.
     */
    public void setDanyArma(int i){
        this.WPOW = i;
    }
    
    /**
     * Estableix la velocitat de l'arma.
     * 
     * @param i Nou valor de velocitat de l'arma.
     */
    public void setVelArma(int i){
        this.WVEL = i;
    }
}
